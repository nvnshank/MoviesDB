## MoviesDB | Spritle Software, Chennai

### Java Task | Spritle

### Spritle Coding Test Project

The project has served its purpose to test my knowleadge on Restful Services,Spring Framework, Spring Boot, Jpa/Hibernate and Relational Database.

This Project is Spring Boot Multi Module Project and It contains three child modules Service [JAR], Core [JAR], and Store[JAR].

1) Core contains all the DTOs and Models. 
2) Services contains all the Service Interfaces, Service Implementations, Controllers and Rest Controllers.
3) Store contains all the JPA CRUD Operations and JPA Pagination/Sorting related Repositories.


### MySql Setup : 
I am using MySql Database 5.7 Version in this Spring Boot Multi Module Project. 
For testing this project you need to install MySql Community Edition 5.7 Version. 
After installing create a user with credential details username=root and password=root. 
And create a schema db with name "moviesdb".

## I didn't configure Liquibase in this project. Sorry!

## See below steps for building artifact jar and running this application.

1) First configure MySql Database schema and clone this git repository.
2) This is multimodule project so select Main project and do Maven "CLEAN" and "INSTALL" respectively.
3) Now update your Maven Project by selecting "Force Update of Snapshots/Releases"
4) Select "STORE" module and then select Run As : Spring Boot App
5) After successfully completing above steps run "SERVICE" module by doing same as explained in previous step 4.

## Now for testing MOVIE Rest Resource API :

  
