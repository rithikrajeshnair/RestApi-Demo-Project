# RestApi-Demo-Project
This is a basic project to try out and implement basics of RestAPI. 


## What is API ?
![image](https://user-images.githubusercontent.com/46045404/189599124-c1370222-7203-4296-b783-5c028bc933b2.png)
  
  API or Application Program Interface is a software that allows two applications to communicate to each other. API is a way to send and receive data between two applications.
For example, if you want to display Google maps on your site, but the maps application is running on Google servers, you need a way to ask Google to provide you with the maps. 
The way to ask Google is through the API which is provided by google.

### Types of API
* SOAP API '(Simple Object Access Protocol)'
* RESTFulAPI

## REST API
* Web API
* REST '(Representational State Tansfer)'
* REST API/ RESTFUL API/ RESTFul Services

### Web API
* Services available all over the Web.
Web API contains one or more END-POINTS to access the Service availables on Web.

## How Web API Works 
* Client send a HTTP Request to API
* API will communicate to web applications/ database.
* Web Application provides Response / Data to API.
* Api Returns response / data back to client.
* Data which we are getting may be XML/ JSON. [XML/ JSON is used because they are universally accepted data formats.
Of which JSON is ligh weight than XML hence JSON is more commonly used. JSON is stored as key value pair.]

## What is REST?
* REST is an architectural guideline for creating WEB API that uses HTTP Protocol for communications.
* The API which is developed using REST is known as REST API/ RESTFul API/ RESTFul Web Services.

## REST Architectural Guidelines - ROY FIELDING
1. END Point - resource on web must be accessible using URL Patterns.
2. HTTP verbs/ HTTP Methods - must be used to perform pactions on recourse.
3. Status Codes - Status codes should be included in response after each call to the server.
4. Data/ Body - JSON/ XML should be used for exchanging the data between client and server (Request, Response).
5. Stateless - Communication between client and server should be stateless. ie., Requests cannot 
be dependend on any other requests and all the request made from the client to the server are frest requests. No data from the client is stored on the server side.
![image](https://user-images.githubusercontent.com/46045404/189620347-3ad61aaa-de93-459f-9eef-a186267d3284.png)
![image](https://user-images.githubusercontent.com/46045404/189620533-29ec552f-98b8-4ba9-9438-40321f68524e.png)

## Designing End-Points
* To view LIST of Employees, a GET request should be sent to server.
URI: http://www.icress.in/api/employee
* To GET an employee details with Id of 1001, we send a GET request.
URI: http://www.icress.in/api/employee/1001
* To Create a new Employee, we send the data with POST request.
URI: http://www.icress.in/api/employee
* To Update an Employee with ID 1001 send PUT/PATCH request.
URI: http://www.icress.in/api/employee/1001
* To Delete an Employee with Id 1001 send DELETE request.
URI: http://www.icress.in/api/employee/1001

Major difference between PUT and PATCH is that PATCH is used for partial updation,
while PUT is utilzed for complete Updation. Consider an example suppose there is a road 
from point A to point B, and we have 2 options to modify it either remove the entire existing 
road and pave a new road, or modify the existing raods where ever necessary work is needed. 
Here the 1st approach is PUT and the 2nd approach is PATCH.

![image](https://user-images.githubusercontent.com/46045404/189625344-aacf7fd9-976e-4127-a1b0-983bfbe65ab0.png)

![image](https://user-images.githubusercontent.com/46045404/189625450-f5a44c16-a2b9-43fb-8ed2-23f1fd5b672d.png)

# Spring & Spring Boot
## Spring Framework
Spring Framework is a popular, open source, Enterprise-Level Framework for creating Standalone, production grade
Applications that run on Java virtual machine.

## Spring Boot
Spring Boot is a tool that makes developing web applications, Microservices with Spring Framework faster and easier
through following core capabilities:
  * Auto Configuration
  * Production Ready Features
  * Simple Configuration
  * Embedded Server
  * Starter Projects
  * Standalone Spring Apps
  
These features work togetherand allows us to setup a spring based application with minimal configuration and setup.

![image](https://user-images.githubusercontent.com/46045404/189626998-9120c9b0-924f-4ab3-8d54-461212e306bc.png)

* Controller is responsible for handling all ther requests.
* Service is reposible for handling the business logic.
* Repository is responsible for handling the data base.


## Steps - Implementing REST API in Spring Boot
1. Project Setup - Spring Boot & Maven
2. Design the contract: 'API End-Points, Request, Response, Error Codes'
3. API Implementation
  * Create Controller and Map to End Points 
  * Create Service Interface and Implementation classes
  * Create Repositiory
  * Create Entity Class
  * Cross-Cutting Concerns (Logging, Exception Handling, Security)
4. Test API using any REST Clients - Postman

### Project Setup  
![image](https://user-images.githubusercontent.com/46045404/189627958-3c5d4084-160e-49ad-8beb-db7d27f71e34.png)

### Add missing packages to the existing Projects
  * Package: com.credai.empapi
  * Entity ==> Employee
  * Controller ==> EmployeeController
  * Service ==> EmployeeService(Interface), EmployeeServiceImpl
  * Repository ==> EmployeeRepository(Interface)
  
### Designing Contract
![image](https://user-images.githubusercontent.com/46045404/189640016-a4b602ac-d1d3-4209-90e0-d71f29838677.png)

### Create Flow
![image](https://user-images.githubusercontent.com/46045404/189640187-5f8c73ed-c756-4a4c-bd6a-14a0f254f1d4.png)


* To transfer data from one layer to another we use an ENTITY
* These Entity or POJO are mapped to the database by ORM (Object Relation Mapping).
* Advantage of this is we can use different Database and still use the same code.
* JPA is the standard which is followed by all the ORMs, hence the methods are same.


* In java we can make 3 types of bundles
    1. jar - Java Archive, its a kind of zip file. Always contains class files and java files. JVM is enough to run this.
    2. war - Web Archive, it contins web files like ' .class, .html, .js, .jsp.' Web servers are required to run them (web container) Like Tomcat.
    3. ear - Enterprise Archive, contains files like '.war and .jar'. Application servers are required to run them, (Applications servers = EJB container + web container). eg : JBOSS/Wildfly, WebLogic (Oracle), WeBSphere(IBM)

* SOAPUI is the best tool to do performance , stress, Load test.
* Data Transfer Object (DTO) / Value Object (VO)
* Optional Object is introduced in Java 8, its good at null handling.
