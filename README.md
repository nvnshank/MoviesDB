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

You don't need to perform any insert operation for inserting Movie Record into the database because I have configured
all the database insertion operation inside Service Module's Spring Boot App main class by implementing "run(String... args)" method of CommandLineRunner interface.

### Now only thing you need to do is to check Movie Rest API by using Postman tool.

### Follow below mentioned procedure for testing MOVIE Rest Resource API :

#### Note : Please Configure Content and Accept Type in POSTMAN Testing Tool as application/json for all sending request.

*******************************************************************************************************
# GET Request

### For getting all Movie Records from DB.
   
   Send GET Request on  http://localhost:8080/movies
   
### For getting single Movie Record by sending specific id as path varibale.

Send GET Request with ID Path Variable on http://localhost:8080/movies/{id}
-******************************************************************************************************
# POST Request

### For creating a Movie Record into the Database.

Send Post Request on http://localhost:8080/movies

### Add below JSON Structured Data in request body of the post request for Movie record create operation.

{
    "title": "Any Dummy Name",
    "review": "Any Review You Can Write Here",
    "releaseDate": "2020-04-12T15:31:56.000+0000",
    "actors": [
        {
            "firstname": "ActorName1",
            "lastname": "ActorLastName1",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName2",
            "lastname": "ActorLastName2",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName3",
            "lastname": "ActorLastName3",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName4",
            "lastname": "ActorLastName4",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        }
    ],
    "genres": [
        {
            "genrename": "Crime"
        }
    ]
}

You can pass any Genre, Actor and Movie Details according to your choice. I did'nt configure validation so no need to worry for length also.

******************************************************************************************************************************

# Delete Request

### For deleting a Movie Record from the Database.

  Send DELETE Request on http://localhost:8080/movies/{id}
  
  Pass Specific ID as a Path Variable for deleting a Movie Record.

******************************************************************************************************************************
# Put Request 
 
 ### For Updating a Movie Record in the Database.
 
 Send PUT Request for Updatig Stored Movie Record on http://localhost:8080/movies
 
 ### Add below JSON Structured Data in request body of the PUT request for Movie record update operation.

{
	"id": "2",
    "title": "Any Dummy Movie Name Text",
    "review": "Any Review Text",
    "releaseDate": "2020-04-12T15:31:56.000+0000",
    "actors": [
        {
            "firstname": "ActorName1",
            "lastname": "ActorLastName1",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName2",
            "lastname": "ActorLastName2",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName3",
            "lastname": "ActorLastName3",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        },
        {
            "firstname": "ActorName4",
            "lastname": "ActorLastName4",
            "gender": "Male",
            "dateofbirth": "2020-04-12T15:31:56.000+0000"
        }
    ],
    "genres": [
        {
            "genrename": "Crime"
        }
    ]
}

You can pass any Genre, Actor and Movie Details according to your choice for updation. I did'nt configure validation so no need to worry for length also.

******************************************************************************************************************************

# Some Useful Links Related To Swagger, Swagger UI, and Spring Boot Actuator.

### http://localhost:8080/ 

### Swagger UI Link       ::        http://localhost:8080/swagger-ui.html#/movie-rest-controller 
###                                 http://localhost:8080/swagger-ui.html
                   
### Api Doc               ::        http://localhost:8080/v2/api-docs 

### Spring Boot Actuator  ::        http://localhost:8080/actuator

### App Health Check      ::        http://localhost:8080/ 

*******************************************************************************************************************************
  
# THANKS Team Spritle!
