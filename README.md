# Document Management System (Software Engineering)
## Requirement Specification
In this project, the requirements that should be in a document management system are
used. If we summarize the project, a user logs into the system. Then all the owned
documents are shown. Here, the user can do many things such as create documents, create
folders, deleting, renaming, and returning files (docuents and folders) from trash. In
addition, the user can create a group and add users there. Such users are called admins.
These admins determine which user will have rights/permissions on the documents. They
can add rights and then delete these rights. Users added to a group log into the group and all
the details are shown. In other words, which users are there, which documents are there
and what rights they have. These users can also add comments to a document. These
comments are sent to all users as a message. Users also save after making any changes to
the document they are working on. All versions of these records are kept in the system.

## Use Case Diagram
![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/use_case.png)

## Activity Diagram
![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/activity_diagram.png)

## Class Diagram
![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/class_diagram.png)

## Bridge Design
I used this pattern to seperate file implementations from my file abstract class. When client
want to use methods of documents and folders, file abstract class accesses the main classes
and their methods over the file bridge and delivers to the client. Thus, the implementations
abstracts its classes from the client. So, the client calls methods via abstract class.

## Mediator Design
A user in a group can add comment about a file. This comment must be delivered to all users
in the group. Because of this, I used for delivering messages (comments). Users (objects) can
communicate each other in this patterns.
In this pattern, CommentMediator is an interface and it is a mediator. It defines the interface
for communication between Colleague objects. ConcreteMediator class implements the
CommentMediator and coordinates the communication. User is my Colleague class and it
GroupUser and Admin are Concrete Colleageues. GroupUser and Admin can send comments
other colleagues throug CommentMediator.

## Memento Design
When a user makes a changes in the documents, the user save the file and document
management system store all versions of the file. I chose memento design to do this. My file
class is originator class. It is used for saving which version (state). I have a VersionFile class 
and it is my memento class. It maintains the version of the file (originator). VersionTaker
class is a CareTaker class and it stores all versions of the memento. So, I can access to any
version of the file via VersionTaker.

## Factory Design
In my system, there are Group Users and Admins and they are actually User. For creating
Group User and Admin, I use factory pattern via FactoryUser. Because, by using User class, it
can be cerated another object. So, when we can use User class, we can create Admin and
Group User objects.

## Memento Design Code
File.java

![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/File.PNG)

VersionFile.java

![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/VersionFile.PNG)

VersionTaker.java

![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/VersionTaker.PNG)

Test.java

![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/Test.PNG)

Output

![](https://abdussametkaci.github.io/DocumentManagementSystem_SoftwareEngineering/img/Output.PNG)
