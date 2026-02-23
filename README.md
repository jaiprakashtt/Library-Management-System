📚 Library Management System

A Library Management System developed using Java to automate and manage basic library operations such as adding books, issuing books, returning books, searching books, and managing records.

This project demonstrates Object-Oriented Programming (OOP) concepts and system design principles used in real-world applications.

📌 Project Overview

The Library Management System is designed to simplify library operations digitally. It helps administrators manage book records and user information efficiently.

This project was built as a placement-oriented project to demonstrate skills in:

Java programming

Object-oriented design

File handling

System architecture

Version control using Git & GitHub

🚀 Features
🔐 Admin Login

Secure login system to allow only authorized administrators to manage the system.

📖 Book Management

Add new books

View available books

Delete books

Search books by title

👥 User Management

Add new users

View user records

📤 Issue Book

Allows issuing books to users and tracks issued books.

📥 Return Book

Handles returning books and updates book availability.

💰 Fine Calculation

Automatically calculates fine if the book is returned after the allowed time period.

🛠️ Technologies Used
Technology	Purpose
Java	Core programming language
OOP Concepts	System design
ArrayList	Data storage
File Handling	Permanent data storage
Git	Version control
GitHub	Code hosting
Visual Studio Code	Development environment
📂 Project Structure
Library-Management-System
│
├── src
│   ├── Main.java
│   ├── Book.java
│   ├── User.java
│   ├── AdminService.java
│   ├── LibraryService.java
│   └── IssueRecord.java
│
├── data
│   ├── books.dat
│   ├── users.dat
│   └── issues.dat
│
└── README.md
🏗️ System Architecture
User / Admin
      │
      ▼
Application Interface
      │
      ▼
Service Layer
      │
      ▼
Data Storage (Files / Collections)
⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/jaiprakashtt/Library-Management-System.git
2️⃣ Navigate to the Project Directory
cd Library-Management-System
3️⃣ Compile the Java Files
javac src/*.java
4️⃣ Run the Application
java -cp src Main
💻 Example Menu
===== Library Management System =====

1 Add Book
2 Show Books
3 Issue Book
4 Return Book
5 Search Book
6 Exit
🔄 Workflow
Admin Login
     │
     ▼
Library Dashboard
     │
     ▼
Add Book / View Books / Search Books
     │
     ▼
Issue Book → Return Book → Fine Calculation
📖 Learning Outcomes

Through this project I learned:

Object-Oriented Programming (OOP)

Java project structuring

File handling

Data management using collections

Software system design

Version control with Git & GitHub

🔮 Future Enhancements

Future improvements for this system include:

Web-based interface using Spring Boot

Database integration using MySQL

Admin dashboard UI

REST API support

Cloud deployment

📸 Screenshots

(Add screenshots of your project here)

Example:

screenshots/
 ├── menu.png
 ├── add-book.png
 └── issue-book.png
👨‍💻 Author

Jai Prakash Tiwari

🎓 B.Tech – Computer Science & Engineering
🔐 Specialization: Cyber Security

GitHub Profile
https://github.com/jaiprakashtt
