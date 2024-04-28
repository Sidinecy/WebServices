# WebServices
This repository is dedicated to the Job Searching Web Service project, a comprehensive solution designed to facilitate job search and management via web services.

# Team Members
COULIBALY Sidiné :sidcoulibaly@outlook.fr / sidine.coulibaly3@etu.cyu.fr
# Requirements
This project is built using specific versions of Apache CXF and Apache Tomcat to ensure optimal compatibility and performance:

Apache CXF version 3.5.7
Apache Tomcat version 9.0.85
Please ensure you are using these versions to avoid potential compatibility issues.

# Introduction
The wsproject is developed with the intent to provide a robust web service solution to create university, specialty and manage them. Utilizing RESTful architecture, this project leverages Eclipse IDE's efficient development environment for web services, offering a practical learning experience in web service implementation.

The project showcases two core implementations: a REST-based web service, each complemented by client examples. Despite the difference in implementation, both services offer identical functionalities and interact with a common database for University data management.

# Services Description
The REST implementation is accessible at http://localhost:8080/university.management.web.resource/api/?_wadl, providing an XML object that encapsulates user data from the database.

# REST Services:
Add University: Enables the creation and addition of new user entries. Utilize the POST HTTP method to submit a complete University object, receiving an XML object in response.

Delete University: Facilitates university deletion via university ID. Employ the DELETE HTTP method, which expects an XML object.

Update University: Allows for university data updates by submitting a User object alongside the university ID. This is achieved through the PUT HTTP method, which accepts and returns an XML object.

University Search with Specialty : The client offers functionalities to search for university by submitting a specialty name. This feature exemplifies how the client interfaces with the internal services.

# Clients Description
The project includes client examples for REST implementations. These clients demonstrate how to interact with the web services, showcasing functionalities like adding, updating, and deleting, as well as searching. 

# Use Case Example
A typical use case scenario would involve a user utilizing the client to search for univerties by their specializations. By inputting the name of specialty, they can retrieve relevant universities, showcasing the practical utility of the wsproject in facilitating university search and data management.

In essence, the wsproject serves as an educational tool and a functional web service, offering insights into SOAP and RESTful service development while providing a valuable resource for job search and user management.


