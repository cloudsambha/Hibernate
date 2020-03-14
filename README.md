

brew install mysql
mysql.server start

https://www.digitalocean.com/community/tutorials/how-to-create-a-new-user-and-grant-permissions-in-mysql
SHOW VARIABLES WHERE Variable_name = 'port';


ALTER USER 'root'@'localhost' IDENTIFIED BY 'sam@12345';
CREATE USER 'sam'@'localhost' IDENTIFIED BY 'sam@12345';
GRANT ALL PRIVILEGES ON * . * TO 'sam'@'localhost';
FLUSH PRIVILEGES;

mysql -u root -p


mysql> show databases;
mysql> show tables;
mysql> create database majorproject;
mysql> use majorproject;


describe table student;



