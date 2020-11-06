/* =================== CREATE DATABASE ===================*/
DROP DATABASE IF EXISTS Extra_Assignment_3;
CREATE DATABASE IF NOT EXISTS Extra_Assignment_3;
USE Extra_Assignment_3;

/* =================== CREATE TABLE ===================*/
DROP TABLE IF EXISTS trainee;
CREATE TABLE IF NOT EXISTS trainee(
	trainee_id		 	MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
	full_name		 	VARCHAR(100) NOT NULL,
	birth_date			DATE NOT NULL,
	gender			 	ENUM('male','female','unknown'),
	et_iq				TINYINT UNSIGNED,
	et_gmath		 	TINYINT UNSIGNED,
	et_english		 	TINYINT UNSIGNED,
	training_class 	 	VARCHAR(50) NOT NULL,
	evaluation_notes 	TEXT,
	vti_account			VARCHAR(100) UNIQUE KEY NOT NULL,
	CHECK (et_iq >=0 && et_iq <=20),
	CHECK (et_gmath >=0 && et_gmath <=20),
	CHECK (et_english >=0 && et_english <=50)
);

/* =================== BT EXTRA ASSIGNMENT 3 ===================*/
-- Q1: Thêm data cho bảng
INSERT INTO trainee	(full_name				, birth_date		, gender	, et_iq	, et_gmath	, et_english	, training_class	, evaluation_notes	, vti_account	)
VALUES				('Ba Nguyen Xuan'		, '1991-01-02'		, 'male'	, 17	, 18		, 46			, 'Class 1A'		, 'Osusume'			, 'VTI_0101'	),
					('Cao Nghiem Thanh'		, '1991-11-25'		, 'male'	, 15	, 20		, 35			, 'Class 2A'		, 'et_gmath max'	, 'VTI_0102'	),
                    ('Do Thuy Linh'			, '1997-03-02'		, 'female'	, 17	, 12		, 20			, 'Class 1B'		, ''				, 'VTI_0103'	),
					('Le Cam Tu'			, '1998-11-25'		, 'male'	, 13	, 2			, 16			, 'Class 2F'		, 'edit something'	, 'VTI_0104'	),
                    ('Nguyen Thanh Huong'	, '1995-07-02'		, 'male'	, 20	, 16		, 47			, 'Class 3C'		, ''				, 'VTI_0105'	),
					('Vo Tuan Kiet'			, '1996-11-25'		, 'male'	, 5		, 8			, 25			, 'Class 2A'		, 'chayo'			, 'VTI_0106'	),
                    ('Doan Thi Diem'		, '1992-07-02'		, 'female'	, 1		, 3			, 40			, 'Class 1A'		, 'None'			, 'VTI_0107'	),
					('Hoang Hoang'			, '1993-11-25'		, 'unknown'	, 7		, 10		, 33			, 'Class 3C'		, 'no problem'		, 'VTI_0108'	),
                    ('Khue Van Cac'			, '1994-01-02'		, 'unknown'	, 9		, 17		, 49			, 'Class 3C'		, 'OK'				, 'VTI_0109'	),
					('Ho Con Rua'			, '1997-12-25'		, 'male'	, 14	, 20		, 50			, 'Class 2A'		, 'et_english max'	, 'VTI_0201'	);
		
-- Q2: Lấy thực tập sinh đã qua bài ktra đầu vào & được nhóm lại theo tháng sinh
SELECT MONTH(birth_date) AS 'Tháng sinh' , COUNT(*) AS 'Số người', GROUP_CONCAT(full_name) AS 'Tên'
FROM trainee
WHERE 	et_iq + et_gmath	>= 20	&&
		et_iq				>= 8	&&
        et_gmath			>= 8	&&
        et_english			>= 18
GROUP BY MONTH(birth_date)
ORDER BY MONTH(birth_date) ASC;

-- Q3: Lấy ra thực tập sinh có tên dài nhất; lấy ra các thông tin tên, tuổi, thông tin cơ bản (như đã được định nghĩa trong table)
ALTER TABLE trainee
ADD COLUMN age TINYINT UNSIGNED;

SET SQL_SAFE_UPDATES = 0;
UPDATE trainee
SET age = YEAR(NOW()) - YEAR(birth_date)
WHERE age IS NULL;

SELECT *, LENGTH(full_name)
FROM trainee
WHERE LENGTH(full_name) = (
	SELECT MAX(LENGTH(full_name))
    FROM trainee
    );

-- Q4: Lẩy ra ET
SELECT *, SUM(et_iq + et_gmath)
FROM trainee
WHERE	et_iq + et_gmath	>= 20	&&
		et_iq				>= 8	&&
        et_gmath			>= 8	&&
        et_english			>= 18
GROUP BY trainee_id;

-- Q5:
SET SQL_SAFE_UPDATES = 0;
SET FOREIGN_KEY_CHECKS = 0;
DELETE
FROM trainee
WHERE trainee_id = 3;

-- Q6:
UPDATE trainee
SET training_class = '2'
WHERE trainee_id = 5;
