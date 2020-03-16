## Project dependencies
* Apache Tomcat v8.5
* sql connector included in lib folder
* MySql 

> Password for PhpMyadmin is  `""`  and password for MySQL Workbench is `"root"` 

> Make necessary adjustments in Dao class (master will have  `""`)

## How to run the app
* Import Book_List.sql in MySql database
> If import is not possible just create a database named Book_List and copy paste the contents of the provided sql file and run it as a query
* Import porject in eclipse and configure build path
> Configure build path -> Add Library -> add apache tomcat v8.5 folder

> Configure build path -> Add External jar -> add mysql connector 
* Start server and go to `http://localhost:8080/advJava` in your browser

## How to get a copy of the project
```
git clone https://github.com/Klaus-poppe/advJava
git checkout [apnaBranchName]  // (square brackets mat dalna)
```

## Before u start working 
```
git pull origin master
this command will make sure u r up to date with the main branch 
```
## To upload changes
```
git add .
git commit -m "short message about the commit"
git push origin [BranchName]  
```
## To create a new branch 
```
git branch [branchName]
```



