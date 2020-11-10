/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/
DROP DATABASE IF EXISTS Assignment_6;
CREATE DATABASE Assignment_6;
USE Assignment_6;

/*============================== CREATE TABLE=== =======================================*/
/*======================================================================================*/
DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_id	TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	department_name	NVARCHAR(50) UNIQUE KEY NOT NULL
);

DROP TABLE IF EXISTS position;
CREATE TABLE IF NOT EXISTS position (
	position_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	position_name	ENUM('Dev', 'Test', 'Scrum Master', 'PM', 'BA', 'BrSE', 'Intern', 'Comtor', 'Reviewer')
);

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(100) UNIQUE KEY,
	user_name		VARCHAR(50) UNIQUE KEY,
	full_name		NVARCHAR(50),
	department_id	TINYINT UNSIGNED,
	position_id		TINYINT UNSIGNED,
	create_date		DATE,
    FOREIGN KEY (department_id)	REFERENCES department (department_id),
    FOREIGN KEY (position_id)	REFERENCES position (position_id)
);

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
	group_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	group_name		VARCHAR(200),
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (creator_id) REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS group_account;
CREATE TABLE IF NOT EXISTS group_account (
	group_id		TINYINT UNSIGNED,
	account_id		SMALLINT UNSIGNED,
	join_date		DATE,
	PRIMARY KEY (group_id,account_id)
);

DROP TABLE IF EXISTS table_01;
CREATE TABLE IF NOT EXISTS table_01(
	table01_id		SMALLINT UNSIGNED,
	group_id		TINYINT UNSIGNED,
	account_id		SMALLINT UNSIGNED,
    another_account	VARCHAR(50) DEFAULT 'unknown',
    PRIMARY KEY (table01_id),
    FOREIGN KEY (group_id,account_id) REFERENCES group_account (group_id,account_id)
);

DROP TABLE IF EXISTS type_question;
CREATE TABLE IF NOT EXISTS type_question (
	type_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	type_name		ENUM('Essay', 'Multiple-Choice')
);

DROP TABLE IF EXISTS category_question;
CREATE TABLE IF NOT EXISTS category_question (
	category_id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	category_name	VARCHAR(200)
);

DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question (
	question_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	q_content		TEXT,
	category_id		TINYINT UNSIGNED,
	type_id			SMALLINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (category_id)	REFERENCES category_question(category_id),
	FOREIGN KEY (type_id)		REFERENCES type_question (type_id),
	FOREIGN KEY (creator_id) 	REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer (
	answer_id		SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	a_content		TEXT,
	question_id		SMALLINT UNSIGNED,
	is_correct		ENUM('True', 'False'),
	FOREIGN KEY (question_id)	REFERENCES question (question_id)
);

DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam (
	exam_id			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	`code`			VARCHAR(50) UNIQUE KEY NOT NULL,
	title			VARCHAR(100),
	category_id		TINYINT UNSIGNED,
	duration		TINYINT UNSIGNED,
	creator_id		SMALLINT UNSIGNED,
	create_date		DATE,
	FOREIGN KEY (category_id)	REFERENCES category_question (category_id),
	FOREIGN KEY (creator_id) 	REFERENCES `account` (account_id) 
);

DROP TABLE IF EXISTS exam_question;
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id			SMALLINT UNSIGNED,
	question_id		SMALLINT UNSIGNED,
    PRIMARY KEY (exam_id,question_id)
);

DROP TABLE IF EXISTS table_02;
CREATE TABLE IF NOT EXISTS table_02(
	table02_id		SMALLINT UNSIGNED,
	exam_id			SMALLINT UNSIGNED,
	question_id		SMALLINT UNSIGNED,
    another_account	VARCHAR(50) DEFAULT 'unknown',
    PRIMARY KEY (table02_id),
    FOREIGN KEY (exam_id,question_id) REFERENCES exam_question (exam_id,question_id)
);

/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
-- Add data departmet
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
        
-- Add data position
INSERT INTO position	(position_name	)
VALUES					('Dev'			),
						('Test'			),
						('Scrum Master'	),
						('PM'			),
						('BA'			),
						('BrSE'			),
						('Intern'		),
						('Comtor'		),
						('Reviewer'		);
        
-- Add data account
INSERT INTO `account`	(email							, user_name		, full_name			, department_id	, position_id	, create_date	)
VALUES					('nguyenvana@gmail.com'			, 'nva123'		, 'Nguyen Van A'	, 4				, 7				, '2017-04-21'	),
						('leumacthanh@gmail.com'		, 'lmt2512'		, 'Leu Mac Thanh'	, 3				, 9				, '2007-09-25'	),
                        ('vankieunguyen12@gmail.com'	, 'vankieu'		, 'Nguyen Kieu Van'	, 10			, 2				, '2018-05-14'	),
                        ('hainam23@gmail.com'			, 'hn23'		, 'Do Hai Nam'		, 2				, 1				, '2015-12-12'	),
                        ('dolphinca@gmail.com'			, 'dolphin'		, 'Ca Dolphin'		, 1				, 7				, '2016-11-23'	),
                        ('nguyenvan@gmail.com'			, 'nvan_'		, 'Nguyen Van'		, 3				, 9				, '2009-07-21'	),
						('elliedao@gmail.com'			, 'ellie201'	, 'Dao Thu Thuy'	, 3				, 5				, '2020-12-25'	),
                        ('vanninhn12@gmail.com'			, 'ninhninh'	, 'Doan Ninh Thao'	, 3				, 1				, '2011-05-07'	),
						('muavaban12@gmail.com'			, 'muaban'		, 'Doan Ninh Thao'	, 2			 	, 1				, '2018-05-09'	),
                        ('jklovot@gmail.com'			, 'lovot'		, 'Le Thuy'			, 2				, 4				, '2015-10-12'	),
                        ('doubledouble@gmail.com'		, 'doubleD'		, 'Nhan Ly Di'		, NULL			, 2				, '2016-05-23'	),
						('hohuynh@gmail.com'			, 'hhbabe'		, 'Ho Huynh'		, 1				, 7				, '2016-11-23'	),
                        ('nvanson@gmail.com'			, 'vosong'		, 'Vo Vi'			, 4				, 9				, '2009-08-21'	),
						('elliedata@gmail.com'			, 'elliedt201'	, 'D Pele'			, 3				, 5				, '2020-12-25'	),
                        ('joebiden@gmail.com'			, 'jbiden'		, 'Joe Biden'		, 4				, 1				, '2011-05-09'	),
						('muavaban122@gmail.com'		, '12145'		, 'Di Deu Buoc'		, NULL			, 1				, '2018-05-09'	),
                        ('jklovot56@gmail.com'			, 'lovot56'		, 'Le Thuy OB'		, 2				, 4				, '2015-12-12'	),
						('bobidi@gmail.com'				, 'bbdi'		, 'Bo Bi Di'		, 4				, 9				, '2009-07-21'	),
						('kamathanhchuong@gmail.com'	, 'kamatc'		, 'Kama J'			, 4				, 5				, '2020-12-25'	);
                       
                        
-- Add data group
INSERT INTO `group` (group_name		, creator_id	, create_date	)
VALUES				('group_a'		, 2				, '2018-10-07'	),
					('group_b'		, 5				, '2017-10-03'	),
					('group_c'		, 3				, '2020-02-14'	),
                    ('group_d'		, 1				, '2016-09-07'	),
					('group_e'		, 2				, '2010-10-07'	),
					('group_g'		, 10			, '2020-02-16'	),
                    ('group_h'		, 7				, '2020-02-15'	),
                    ('group_i'		, 8				, '2016-09-23'	),
					('group_k'		, 7				, '2010-07-07'	),
					('group_l'		, 7				, '2019-10-16'	),
                    ('G Bán cá'		, 2				, '2018-10-07'	),
					('G Bán thịt'	, 5				, '2017-10-03'	),
					('G Rau cải'	, 3				, '2020-02-14'	),
                    ('G Rau đay'	, 7				, '2016-09-07'	),
					('G Rau muống'	, 2				, '2010-10-07'	),
					('G Mồng tơi'	, 7				, '2020-02-16'	),
                    ('G Bánh trái'	, 9				, '2020-02-15'	),
                    ('G Rau ngót'	, 8				, '2016-09-23'	),
					('G Rau dền'	, 7				, '2010-07-07'	);
                    
-- Add data group_account
INSERT INTO group_account	(group_id	, account_id	,join_date		)
VALUES						(19			, 14			,'2017-10-07'	),
							(2			, 14			,'2019-10-03'	),
							(7			, 14			,'2020-02-14'	),
							(3			, 14			,'2016-09-07'	),
							(5			, 14			,'2007-10-07'	),
							(2			, 12			,'2020-12-16'	),
							(3			, 10			,'2020-02-15'	),
							(4			, 14			,'2016-09-23'	),
							(5			, 5				,'2010-07-07'	),
							(6			, 18			,'2020-10-16'	),
							(1			, 6				,'2019-10-07'	),
							(19			, 7				,'2019-10-03'	),
							(7			, 1				,'2020-02-14'	),
							(19			, 1				,'2016-09-07'	),
							(5			, 1				,'2017-10-07'	),
							(2			, 1				,'2020-02-16'	),
							(3			, 2				,'2020-02-17'	),
							(19			, 10			,'2016-08-23'	),
							(5			, 15			,'2010-07-07'	),
							(19			, 2				,'2020-10-16'	),
							(4			, 8				,'2016-09-23'	),
							(19			, 17			,'2010-06-07'	),
							(6			, 3				,'2020-10-16'	),
							(19			, 8				,'2019-11-07'	),
							(2			, 9				,'2013-12-03'	),
							(9			, 14 			,'2020-02-14'	),
							(9			, 6				,'2016-09-07'	),
							(19			, 4				,'2017-10-07'	),
							(2			, 10			,'2020-02-16'	);
                            
-- Add data type_question
INSERT INTO type_question	(type_name			) 
VALUES 						('Essay'			), 
							('Multiple-Choice'	); 
				
-- Add data category_question
INSERT INTO category_question	(category_name	)
VALUES 							('Java'			),
								('.NET'			),
								('NodeJS'		),
								('SQL'			),
								('Postman'		),
								('Ruby'			),
								('Python'		),
								('C++'			),
								('C#'			),
								('PHP'			);

-- Add data question
INSERT INTO question	(q_content						, category_id	, type_id	, creator_id	, create_date	)
VALUES					('Câu hỏi về Java'				, 1				, 1			, 3				, '2019-01-02'	),
                        ('Question about .NET'			, 2				, 2			, 5				, '2019-10-07'	),
                        ('Question about NodeJS'		, 3				, 2			, 3				, '2020-11-03'	),
						('Question about SQL'			, 4				, 1			, 7				, '2020-01-02'	),
						('Câu hỏi về Postman'			, 5				, 2			, 2				, '2020-05-06'	),
                        ('Question about Ruby'			, 6				, 1			, 3				, '2018-01-02'	),
                        ('Question about Python'		, 7				, 1			, 9				, '2020-11-02'	),
                        ('Câu hỏi về C++'				, 8				, 2			, 4				, '2017-05-22'	),
						('Question about C#'			, 9				, 1			, 7				, '2019-09-12'	),
						('Question about PHP'			, NULL			, 1			, 1				, '2019-01-23'	),
						('Question about Keywords'		, 2				, 2			, 3				, '2019-11-07'	),
                        ('Question about Syntax'		, 7				, 2			, 10			, '2019-12-03'	),
						('Question about RWords '		, 7				, 1			, 12			, '2020-11-02'	),
						('Câu hỏi về truy vấn data'		, 8				, 2			, 3				, '2020-05-06'	),
                        ('Con bò có ăn cỏ không'		, 6				, 1			, 8				, '2018-01-02'	),
                        ('Khi ngồi lâu, bụng nở ra ntn?', NULL			, 1			, 6				, '2020-11-02'	),
                        ('Điểm khác nhau giữa C và c'	, 8				, 1			, 4				, '2017-05-22'	),
						('Question about C# statement'	, 9				, 1			, 3				, '2019-09-12'	);
                  
-- Add data answer
INSERT INTO answer	(a_content		, question_id	, is_correct	)
VALUES				('Answer AB'	, 7				, 'True'		),
					('Answer CD'	, 5				, 'False'		),
					('Answer EF'	, 4				, 'False'		),     
					('Answer GH'	, 15			, 'True'		),       
                    ('Answer IK'	, 3				, 'False'		),    
					('Answer MN'	, 3				, 'False'		),
					('Answer PQ'	, 18			, 'False'		),
					('Answer XY'	, 3				, 'True'		),     
					('Answer BD'	, 4				, 'True'		),
					('Quả Bưởi'		, 4				, 'True'		),       
                    ('Quả Cam'		, 3				, 'False'		),    
					('Quả Chanh'	, 9				, 'False'		),
					('Củ Sắn'		, 5				, 'False'		),
					('Măng cụt'		, 5				, 'True'		),   
                    ('Quả Quyét'	, 12			, 'True'		);
                    
-- Add data exam
INSERT INTO exam	(`code`		, title					, category_id	, duration	, creator_id	, create_date	)
VALUES				('EX001'	, 'Python Final Exam'	, 7				, 60		, 5				, '2018-10-21'	),
                    ('EX002'	, 'C# Final Exam'		, 9				, 60		, 6				, '2019-10-22'	),
                    ('EX003'	, 'PHP Final Exam'		, 10			, 50		, 7				, '2017-10-13'	),
                    ('EX004'	, 'C++ Final Exam'		, 8				, 60		, 8				, '2020-10-23'	),
                    ('EX005'	, 'Postman Final Exam'	, 5				, 60		, 1				, '2019-09-21'	),
                    ('EX006'	, 'Ruby Final Exam'		, 6				, 60		, 2				, '2016-07-01'	),
                    ('EX007'	, 'Java Final Exam'		, 1				, 120		, 3				, '2017-06-06'	),
                    ('EX008'	, 'SQL Final Exam'		, 4				, 120		, 4				, '2020-11-21'	),
                    ('EX009'	, '.NET Final Exam'		, 2				, 60		, 9				, '2019-12-21'	),
                    ('EX010'	, 'NodeJS Final Exam'	, 3				, 60		, 10			, '2016-10-31'	);
                    
-- Add data exam_question
INSERT INTO exam_question	(exam_id	, question_id	)
VALUES						(1			, 5				),
							(2			, 1				),
							(3			, 7				),
							(4			, 8				),
                            (5			, 9				),
							(6			, 4				),
                            (7			, 5				),
							(8			, 3				),
                            (9			, 1				),
							(10			, 1				),
							(11			, 9				),
							(12			, 5				),
                            (13			, 5				),
							(14			, 3				),
                            (15			, 7				);
/* ======================== Assignment 6 ===========================*/   
-- Q1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS get_account;
DELIMITER $$
CREATE PROCEDURE get_account (IN name_department NVARCHAR(100))
	BEGIN
		SELECT *
		FROM `account`
        RIGHT JOIN department USING (department_id)
        WHERE department_name LIKE CONCAT('%', name_department , '%')
        ;
    
    END $$
DELIMITER ;

CALL assignment_6.get_account('bảo');

-- Q2: Tạo store để in ra số lượng account của mỗi group
DROP PROCEDURE IF EXISTS luong_account;
DELIMITER $$
CREATE PROCEDURE luong_account ()
	BEGIN
		SELECT *, COUNT(1)
        FROM group_account
        GROUP BY group_id
        ;
	END $$
DELIMITER ;

CALL bt_4.luong_account();

-- Q3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS luong_question;
DELIMITER $$
CREATE PROCEDURE luong_question ()
	BEGIN
		SELECT type_id, type_name, create_date, COUNT(type_id)
        FROM type_question
        JOIN question USING (type_id)
        WHERE YEAR(create_date) = YEAR(NOW()) && MONTH(create_date) = MONTH(NOW())
        GROUP BY type_id
		;
	END $$
DELIMITER ;

CALL assignment_6.luong_question();

-- Q4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS max_question;
DELIMITER $$
CREATE PROCEDURE max_question ()
	BEGIN
		SELECT type_id, COUNT(type_id)
        FROM type_question
        JOIN question USING (type_id)
        GROUP BY type_id
        HAVING COUNT(type_id) = (
			SELECT COUNT(type_id)
            FROM question
            GROUP BY type_id
            ORDER BY COUNT(type_id) DESC
            LIMIT 1
            )
		;
	END $$
DELIMITER ;

CALL assignment_6.max_question();

-- Q5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS max_question1;
DELIMITER $$
CREATE PROCEDURE max_question1 ()
	BEGIN
		SELECT type_name, COUNT(type_id)
        FROM type_question
        JOIN question USING (type_id)
        GROUP BY type_id
        HAVING COUNT(type_id) = (
			SELECT COUNT(type_id)
            FROM question
            GROUP BY type_id
            ORDER BY COUNT(type_id) DESC
            LIMIT 1
            )
		;
	END $$
DELIMITER ;

CALL assignment_6.max_question1();

-- Q6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào
		-- hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS abc;
DELIMITER $$
CREATE PROCEDURE abc (IN input VARCHAR(100))
	BEGIN
		SELECT 	g.group_name, a.user_name
        FROM 	group_account ga
        JOIN 	`account` a 	ON ga.account_id = a.account_id
        JOIN 	`group` g		ON ga.group_id 	= g.group_id
        WHERE 	g.group_name LIKE CONCAT('%', input, '%') OR 
				a.user_name LIKE CONCAT('%', input, '%')
		;
	END $$
DELIMITER ;

CALL assignment_6.abc('lmt');
-- Q7: 
DROP PROCEDURE IF EXISTS log_in;
DELIMITER $$
CREATE PROCEDURE log_in (IN your_name VARCHAR(100), your_email VARCHAR(150))
	BEGIN
		INSERT INTO `account`
        SET email = your_email,
			user_name = LOWER(SUBSTR(email,1,LOCATE('@',email) - 1)),
            full_name = your_name,
			position_id = 0,
            department_id = 0,
            create_date = NOW();
	END $$
DELIMITER ;

CALL assignment_6.log_in('Hùng Ưng Vẫy Cánh', 'hungung@gmail.com');
CALL assignment_6.log_in('Bạch Tuộc Bốn Chân', 'bachtuoc11@gmail.com');

-- Q8: Viết 1 store cho phép người dùng nhập vào Essay hay Mulitiple-Choice để thống kê câu hỏi Essay hay Multiple_Choice nào có content dài nhất
DROP PROCEDURE IF EXISTS long_content;
DELIMITER $$
CREATE PROCEDURE long_content (IN input ENUM('Essay', 'Multiple-Choice'))
	BEGIN
		SELECT type_id, type_name, q_content, LENGTH(q_content)	
		FROM question
		JOIN type_question USING (type_id)
		WHERE LENGTH(q_content) = (
			SELECT LENGTH(q_content)
			FROM question
			JOIN type_question USING (type_id)
			WHERE type_name = input
			ORDER BY LENGTH(q_content) DESC
			LIMIT 1 );
	END $$
DELIMITER ;

-- Q9: Viết 1 store cho phép người dùng xóa exam dựa vào id
DROP PROCEDURE IF EXISTS delete_exam;
DELIMITER $$
CREATE PROCEDURE delete_exam (IN input_id INT)
	BEGIN
		DELETE
        FROM exam
        WHERE exam_id = input_id;
	END $$
DELIMITER ;

/* Q10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (dùng store 9) +
In số lượng record đã remove từ các table liên quan trong khi removing */

-- Tìm  Tìm ra các exam được tạo từ 3 năm trước
SELECT *
FROM exam
WHERE YEAR(NOW()) - YEAR(create_date) >=3;

-- xóa các exam đó đi (dùng store 9)
DROP PROCEDURE IF EXISTS delete_exam;
DELIMITER $$
CREATE PROCEDURE delete_exam (IN input_id INT)
	BEGIN
		DELETE
        FROM exam
        WHERE 	exam_id = input_id AND 
				(YEAR(NOW()) - YEAR(create_date)>=3);
	END $$
DELIMITER ;

-- In số lượng record đã remove từ các table liên quan trong khi removing

/* Q11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban
 và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc */
DROP PROCEDURE IF EXISTS delete_department;
DELIMITER $$
CREATE PROCEDURE delete_department (IN input_department_name VARCHAR(150))
	BEGIN
		UPDATE `account` a
        LEFT JOIN department d ON a.department_id = d.department_id
        SET department_name = 'Phòng ban chờ việc'
        WHERE d.department_name = input_department_name;
        
	END $$
DELIMITER ;

CALL assignment_6.delete_department('marketing');

-- Q12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
DROP PROCEDURE IF EXISTS year_question;
DELIMITER $$
CREATE PROCEDURE year_question ()
	BEGIN
		SELECT MONTH(create_date), COUNT(question_id), GROUP_CONCAT(question_id)
        FROM question
        WHERE YEAR(create_date) = YEAR(NOW())
        GROUP BY MONTH(create_date);
	END $$
DELIMITER ;

CALL assignment_6.year_question();

-- Q13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6 tháng gần đây nhất 
-- Nếu tháng nào không có thì sẽ in ra "không có câu trả lời nào trong tháng"
DROP PROCEDURE IF EXISTS month_question;
DELIMITER $$
CREATE PROCEDURE month_question ()
	BEGIN
		SELECT MONTH(create_date), COUNT(question_id), GROUP_CONCAT(question_id)
        FROM question
        WHERE YEAR(create_date) = YEAR(NOW()) AND (MONTH(NOW()) - MONTH(create_date) <= 6)
        GROUP BY MONTH(create_date);
	END $$
DELIMITER ;

CALL assignment_6.month_question();
