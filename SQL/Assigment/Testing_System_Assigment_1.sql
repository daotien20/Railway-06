DROP DATABASE IF EXISTS Testing_System_Assignment_1;
CREATE DATABASE Testing_System_Assignment_1;

USE Testing_System_Assignment_1;
CREATE TABLE Department (
	DepartmentID	INT,
	DepartmentName	VARCHAR(50)
);

CREATE TABLE Position (
	PositionID		INT,
	PositionNamme	VARCHAR(50)
);

CREATE TABLE Account (
	AccountID		INT,
	Email			VARCHAR(50),
	UserName		VARCHAR(50),
	FullName		VARCHAR(50),
	DepartmentID	INT,
	PositionID		INT,
	CreatDate		DATE
);

CREATE TABLE Group_ (
	GroupID			INT,
	GroupName		VARCHAR(50),
	CreatorID		INT,
	CreatDate		DATE
);

CREATE TABLE GroupAccount (
	GroupID			INT,
	AccountID		INt,
	JoinDate		DATE
);

CREATE TABLE TypeQuestion (
	TypeID			INT,
	TypeName		VARCHAR(50)
);

CREATE TABLE CategoryQuestion (
	CategoryID		INT,
	CategoryName	VARCHAR(50)
);

CREATE TABLE Question (
	QuestionID		INT,
	Content			VARCHAR(200),
	CategoryID		INT,
	TypeID			INT,
	CreatorID		INT,
	CreatDate		DATE
);

CREATE TABLE Answer (
	AnswerID		INT,
	Content			VARCHAR(200),
	QuestionID		INT,
	isCorrect		VARCHAR(50)
);

CREATE TABLE Exam (
	ExamID			INT,
	Code			VARCHAR(8),
	Title			VARCHAR(50),
	CategoryID		INT,
	Duration		DATE,
	CreatorID		INT,
	CreatDate		DATE
);

CREATE TABLE ExamQuestion (
	ExamID			INT,
	QuestionID		INT
);