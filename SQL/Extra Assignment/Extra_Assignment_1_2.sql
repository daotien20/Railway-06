DROP DATABASE IF EXISTS Extra_Testing__System1;
CREATE DATABASE IF NOT EXISTS Extra_Testing__System1;

USE Extra_Testing__System1;
-- Exercise 1
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

-- Exercise 2
DROP TABLE IF EXISTS data_type_1;
CREATE TABLE IF NOT EXISTS data_type_1(
	id					MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
	`name`				VARCHAR(50),
	`code`				VARCHAR(5) UNIQUE KEY,
	modified_date		DATETIME DEFAULT NOW()
);

-- Exercise 3
DROP TABLE IF EXISTS data_type_2;
CREATE TABLE IF NOT EXISTS data_type_2(
	id					MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
	`name`				VARCHAR(100),
	birth_date			DATE,
	gender				BIT,
	is_deleted_flag		BIT
);

INSERT INTO data_type_2 (`name`,gender)
VALUES	(N'User1', 1),
		(N'User2', 0),
		(N'User3', 1),
		(N'User4', 1);

SELECT *,
	CASE gender
	WHEN 0 THEN 'Male'
    WHEN 1 THEN 'Female'
    ELSE 'Unknown' END
FROM data_type_2;

INSERT INTO data_type_2 (`name`,is_deleted_flag)
VALUES	(N'User1', 1),
		(N'User2', 0),
		(N'User3', 1),
		(N'User4', 1);

SELECT *,
	CASE is_deleted_flag
	WHEN 0 THEN 'active'
    WHEN 1 THEN 'deleted'
    ELSE 'Unknown' END
FROM data_type_2;