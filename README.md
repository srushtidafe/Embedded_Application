# Embedded_Application
>## Framework Used 
 * SpringBoot
>## Database Used 
 * Swagger
 * mysql workbench
>## Language Used
* Java
>## For Querying use these
* Crud Repository
* Custom Finder
* Custom Query
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
>## Data Structure used in my project
* **Student** 
@Id
private String ID;
private String name;
private String age;
private String phoneNumber;
private String branch;
private String department;
@OneToOne
private Address address;

* **Laptop**
@Id
private String ID;
private String name;
private String brand;
private Integer price;
@OneToOne
private Student student;

* **Course**
@Id
private String ID;
private String title;
private String description;
private String duration;
@ManyToMany
List<Student> studentList;

* **Book**
@Id
private String ID;
private String title;
private String author;
private String description;
private String price;
@ManyToOne
private Student student;

* **Address**
private Long addressId;private String landmark;
private String zipcode;
private String district;
private String state;
private String country;
>## project summery

*In the order entity class, 
* **@OneToOne**
This annotation to the Laptop attribute, to create a one-to-one mapping between Student and Laptop and 
This annotation to the Address attribute, to create a one-to-one mapping between Student and Address 
* **@ManyToOne**
This annotation to the Book attribute, to create a many-to-one mapping between Student and Book
* **@ManyToMany**
This annotation to the Course attribute, to create a many-to-Many mapping between Student and Course

we create five controller classes UserController, LaptopController, CourseController , BookController and AddressController, with the following methods to handle CRUD operations:

>## Application_properties
spring.datasource.url=jdbc:mysql://localhost:3306/Ecommerce
spring.datasource.username=root
spring.datasource.password=<password>
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true 
