
DavisBase
--------------------------------------------------------------------------------
Author: Vyaas Narendra Shenoy


Steps to Build and Run
--------------------------------------------------------------------------------
Welcome to DavisBase
DavisBase Version v1.0
2018 Vyaas Narendra Shenoy


Build instructions
--------------------------------------------------------------------------------
The source files are created using eclipse. I have included a runnable jar file for use. It is a direct compilation of my source file. 

  * Option 1
  Use the runnable jar file
  In the terminal, use this command
  java -jar VyaasBase.jar


  * Option 2
  Install Eclipse 2017
  Create a project Davisbase
  Create a package ‘davisBase’
  Manually add all the java files from the src folder
  Run it inside eclipse

Type 'help;' to display supported commands.
--------------------------------------------------------------------------------

List of Supported Commands
--------------------------------------------------------------------------------

The following list can be seen by running the help; command:

SUPPORTED COMMANDS
All commands below are case insensitive

	CREATE DATABASE database_name;                   Creates an empty database.
	SHOW TABLES;                                     Displays all tables in current database.
	CREATE TABLE table_name (                        Creates a table in current database.
		<column_name> <datatype> [PRIMARY KEY | NOT NULL]
		...);
	DROP TABLE table_name;                           Deletes a table data and its schema.
	SELECT * FROM table_name             Display all records
		
	INSERT INTO table_name                           Inserts a record into the table.
		[(<column1>, ...)] VALUES (<value1>, <value2>, ...);
	
	VERSION;                                         Display current database engine version.
	HELP;                                            Displays help information
	EXIT;                                            Exits the program


A Few Sample Commands Tested Successfully
--------------------------------------------------------------------------------
Basic commands are with respect to Catalog Database;


1. show tables;

2. select * from <table_name>;

3. create database <database_name>;

4. CREATE TABLE <table_name> (<column_name datatype constraints>, <column_name datatype constraints>);
I have not implemented the primary key option. You can specify null and not null

5. insert into <table_name> values (<values>,<values>);

6. drop table <table_name>;

Unfortunately , I have not implemented Delete, update, select with a where clause

Assumptions
--------------------------------------------------------------------------------

1. When updating string values, values of same length should be given, else system can behave erratically.

2. The directory structure for all databases is as follows:
     data/
          +-/table_name1.tbl
          +-/table_name2.tbl
          

Unfortunately, I have not supported the data/catalog file structure.


3. Supported Data Types [Database Names (Java Class Names)]:
     a. TinyInt (Byte)
     b. SmallInt (Short)
     c. Int (Integer)
     d. BigInt (Long)
     e. Real (Float)
     f. Double (Double)
     g. Text (String)
     
Unfortunately, I have not supported Date and Date time

4. Page size is fixed to 512 bytes.

5. B tree has not been implemented. All pages are leaf pages and searched linearly.
     



