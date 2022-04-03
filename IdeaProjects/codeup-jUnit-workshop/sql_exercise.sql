SELECT database();      /*NULL if not in applicable part of SQL Database*/
USE sirius_example_db;    /*How to access db*/
SHOW CREATE DATABASE sirius_example_db;
DROP DATABASE sirius_example_db;
SHOW GRANTS for 'testUser'@'localhost';    /*See priv granted to user*/
SELECT * FROM mysql.user;
SELECT * from SERVERS;                          /*Look into further*/
GRANT SELECT ON *.* TO 'databaseadmin'@'localhost';
GRANT SELECT ON *.* TO 'databaseadmin'@'localhost' WITH GRANT OPTIONS ;
SHOW databases;