# SqlProject
## Overview
Welcome to a car dealership database. This database goes over the history of what happened there in 2019. <br> <br>
This Schema contains 7 tables. <br> <br>
Companies: List of all car companies <br>
carModels: List of all car models that the dealership has held in present or past <br>
Purchases: Log of all cars purchased from the dealership in 2019 <br>
Sales: Log of all cars that the dealership bought to keep in the dealership <br>
Employees: Log of all employees that the dealership had in 2019 <br>
Test Drives: Log of all test drives that took place in 2019 <br>
Service Cars: List of all service appointments from 2019 <br>
<br>

## How to Run
To Run this database use the following commands. <br>
First to run the schema file go to MySQL and click File->Run Sql Script. Choose Shabanian_schema.sql. 
Once the schema has been ported to mySQL, Run the python program to make a list of inserts by doing the following command
<br>
```  
Python createInserts.py
```
Once the generation of inserts has completed (eta 2min 15sec), Populate the database by going to MySql Workbench and doing
```
File->Run Sql Scrip and choose Data.sql
```
Once that is done you are now ready to run the jdbc file. To Run it follow these commands: <br>
```
javac FinalInterface.java
java -classpath ".;mysql-connector-java-8.0.22.jar" FinalInterface.java
```
## General Info
a. Full Name: Aaron Shabanian <br>
  b. Student ID: 2314391 <br>
  c. Chapman email: shabanian@chapman.edu <br>
  d. Course number and section: 408-02 <br>
  e. Assignment Number: FINAL <br>
  
  ### List Of Files
  a. createInserts.py <br>
  b. Shabanian_Schema.sql <br>
  c. Final Video.mp4 <br>
  d. Data.sql <br>
  e. FinalInterface.java <br>
  f. FinalInterface.class <br>
  g. Readme.md
  
  ### References 
  a. ExampleJDBC.java file from class
  b. Stack Overflow for various bugs
  c. Slack Messages with Dr. Linstead. 
