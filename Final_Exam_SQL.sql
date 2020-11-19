/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS thuc_tap;
CREATE DATABASE thuc_tap;
USE thuc_tap;

/*============================== CREATE TABLE=== =======================================*/
/*======================================================================================*/
DROP TABLE IF EXISTS country;
CREATE TABLE IF NOT EXISTS country (
	country_id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    country_name	VARCHAR(100)
);

DROP TABLE IF EXISTS location;
CREATE TABLE IF NOT EXISTS location (
	location_id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    street_address	VARCHAR(100),
    postal_code		MEDIUMINT,
    country_id		MEDIUMINT UNSIGNED ,
    FOREIGN KEY	(country_id) 
		REFERENCES country (country_id)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee (
	employee_id		MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    full_name		VARCHAR(100),
    email			VARCHAR(100),
    location_id		MEDIUMINT UNSIGNED,
    FOREIGN KEY (location_id)
		REFERENCES location (location_id)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data country
INSERT INTO country		( country_name	)	
VALUES					( 'japan'		),
						( 'china'		),
						( 'vietnam'		);
                        
 -- Add data location
INSERT INTO location	(street_address		, postal_code	, country_id	)	
VALUES					('toyota'			, 10000			, 1				),
						('nissan'			, 20000			, 2				),
                        ('toyo'				, 1000			, 1				),
						('niss'				, 20002			, 2				),
						('honda'			, 30000			, 3				);
                        
 -- Add data employee
INSERT INTO employee	(full_name			, email							, location_id	)	
VALUES					('Nguyen Van A'		, 'nguyenvana@gmail.com'		, 1				),
						('Leu Mac Thanh'	, 'nn03@gmail.com'				, 2				),
                        ('Nguyen Van B'		, 'nguyena@gmail.com'			, 2				),
						('Leu Mac Than'		, 'nn03856@gmail.com'			, 1				),
                        ('Nguyen A'			, 'ngana@gmail.com'				, 3				),
						('L  Thanh'			, 'nnlmio@gmail.com'			, 2				),
						('Nguyen Kieu Van'	, 'vankieunguyen12@gmail.com'	, 3				);
                        
/*============================== EXAM =======================================*/
/*===========================================================================*/
-- Q2:
-- Lấy tất cả các nhân viên thuộc Việt nam
SELECT * 
FROM employee
WHERE location_id = (
	SELECT location_id
	FROM location
	JOIN country USING (country_id)
	WHERE country_name = 'vietnam'
    );
    
-- Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
SELECT country_name
FROM country
WHERE country_id = ( 
	SELECT country_id
	FROM location
	JOIN employee USING (location_id)
	WHERE email = 'nn03@gmail.com'
    );

-- Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
-- Thống kê mỗi location có bao nhiêu employee đang làm việc.
SELECT *, COUNT(employee_id)
FROM employee
RIGHT JOIN location USING (location_id)
GROUP BY location_id;

-- Thống kê mỗi country có bao nhiêu employee đang làm việc.
CREATE OR REPLACE VIEW cac_location AS
	SELECT *
	FROM location
	RIGHT JOIN country USING (country_id);
    
SELECT * FROM thuc_tap.cac_location; -- các location ở mỗi country

CREATE OR REPLACE VIEW so_employee AS    
    SELECT *, COUNT(employee_id) AS s_employee, GROUP_CONCAT(employee_id)
	FROM employee
	RIGHT JOIN location USING (location_id)
	GROUP BY location_id;
    
SELECT * FROM thuc_tap.so_employee; -- mỗi location có bao nhiêu employee
    
CREATE OR REPLACE VIEW employees AS  
	SELECT so_employee.country_id, cac_location.country_name, SUM(s_employee) AS so_nhan_vien
	FROM cac_location
	RIGHT JOIN so_employee USING (location_id)
	GROUP BY so_employee.country_id;

SELECT * FROM thuc_tap.employees;

-- Q3: Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
DROP TRIGGER IF EXISTS employee_10;
DELIMITER $$
CREATE TRIGGER employee_10
BEFORE INSERT ON employee
FOR EACH ROW
	BEGIN
		DECLARE d_employee TINYINT;

		SELECT SUM(s_employee) INTO d_employee
		FROM employees
		WHERE SUM(s_employee) = NEW.SUM(s_employee);
		
        IF d_employee >= 10
		THEN 
			SIGNAL SQLSTATE '10003'
			SET MESSAGE_TEXT = 'mỗi quốc gia có tối đa 10 employee';
            
		END IF;
	END $$
DELIMITER ;

/*
INSERT INTO employee	(full_name			, email							, location_id	)	
VALUES					('Nguyen Van B'		, 'nguyenvan@gmail.com'			, 1				);

SELECT * FROM employee;
*/

-- Q4: Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DROP TRIGGER IF EXISTS delete_location;
DELIMITER $$
CREATE TRIGGER delete_location
BEFORE DELETE ON location
FOR EACH ROW	
	BEGIN
		DECLARE d_location INT;
        
        SELECT location_id INTO d_location
        FROM location
        WHERE location_id = OLD.location_id;
        
		UPDATE employee
		SET location_id = NULL
        WHERE location_id = d_location;

	END $$
DELIMITER ;

/* 
DELETE
FROM location
WHERE location_id =1;

SELECT * FROM employee;
*/
    
