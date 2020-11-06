/* ============================== CREATE DATABASE ============================== */
DROP DATABASE IF EXISTS extra_4;
CREATE DATABASE IF NOT EXISTS extra_4;
USE extra_4;

/* ============================== CREATE TABLE ================================= */
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_number	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    department_name		NVARCHAR (50) UNIQUE KEY
);

DROP TABLE IF EXISTS employee_table;
CREATE TABLE IF NOT EXISTS employee_table (
	employee_number		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    employee_name		VARCHAR (100) NOT NULL,
    department_number	TINYINT UNSIGNED ,
    FOREIGN KEY (department_number) REFERENCES department (department_number)
);

DROP TABLE IF EXISTS employee_skill_table;
CREATE TABLE IF NOT EXISTS employee_skill_table (
	employee_number		SMALLINT UNSIGNED,
    skill_code			VARCHAR(50),
    date_registered		DATE
);

/* =============================== INSERT DATA ================================= */
-- Add data department
INSERT INTO department	(department_name	)
VALUES					(N'Marketing'		),
						(N'Sale'			),
						(N'Bảo vệ'			),
						(N'Nhân sự'			),
						(N'Kỹ thuật'		),
						(N'Tài chính'		),
						(N'Phó giám đốc'	),
						(N'Giám đốc'		),
						(N'Thư ký'			),
						(N'Bán hàng'		),
                        (N'Lao công'		);
                        
-- Add data employee_table
INSERT INTO employee_table	(employee_name		, department_number	)
VALUES						('Nguyen Van A'		, 4					),
                            ('Leu Mac Thanh'	, 3					),		
                            ('Nguyen Kieu Van'	, 5					),			
                            ('Do Hai Nam'		, 2					),		
                            ('Ca Dolphin'		, 5					),				
                            ('Nguyen Van'		, 3					),			
                            ('Dao Thu Thuy'		, 3					),		
                            ('Doan Ninh Thao'	, 3					),			
                            ('Doan Ninh Thao'	, 5					),			
                            ('Le Thuy'			, 2					),				
                            ('Nhan Ly Di'		, 5					),	
                            ('Ho Huynh'			, 1					),	
                            ('Vo Vi'			, 4					),		
                            ('D Pele'			, 3					),			
                            ('Joe Biden'		, 4					),			
                            ('Di Deu Buoc'		, NULL				),		
                            ('Le Thuy OB'		, 2					),		
                            ('Bo Bi Di'			, 4					),		
                            ('Kama J'			, 4					);
                            
-- Add data employee_skill_table
INSERT INTO employee_skill_table	(employee_number	, skill_code	, date_registered	)
VALUES								(		1			,'Java'		,	'2019-01-02'	),
									(		3			,'.NET'		,	'2019-10-07'	),
									(		5			,'NodeJS'	,	'2019-12-03'	),
									(		7			,'SQL'		,	'2020-01-02'	),
									(		8			,'Java'		,	'2020-05-06'	),
									(		1			,'Ruby'		,	'2018-01-02'	),
									(		2			,'Python'	,	'2017-11-02'	),
									(		6			,'Java'		,	'2017-05-22'	),
									(		5			,'C#'		,	'2019-09-12'	),
									(		4			,'PHP'		,	'2019-01-23'	);
                                    
/* ================================= EXTRA 4 =================================== */
-- Q3: Lấy ra danh sách nhân viên có skill JAVA
SELECT *
FROM employee_table
JOIN employee_skill_table USING (employee_number)
WHERE skill_code = 'Java';

-- Q4: Lấy ra danh sách phòng ban có > 3 nhân viên
SELECT department_name AS 'Phòng ban', COUNT(department_number) AS 'Số nhân viên'
FROM employee_table
JOIN department USING (department_number)
GROUP BY department_number
HAVING COUNT(department_number) > 3;

-- Q5: Lấy ra danh sách nhân viên của mỗi phòng ban
SELECT department_number AS 'ID Phòng ban', department_name AS 'Phòng ban', GROUP_CONCAT(employee_name) AS 'Tên nhân viên'
FROM employee_table
RIGHT JOIN department USING (department_number)
GROUP BY department_number;

-- Q6: Lấy ra danh sách nhân viên có > 1 skills
SELECT	employee_number AS 'ID của nhân viên', employee_name AS 'Tên nhân viên', 
		COUNT(employee_number) AS 'Số các kỹ năng', GROUP_CONCAT(skill_code) AS 'Kỹ năng'
FROM employee_table
JOIN employee_skill_table USING (employee_number)
GROUP BY employee_number
HAVING COUNT(employee_number) > 1;
