# Teachers Portal

Welcome to Teachers Portal, an instructive Java application designed specifically for educators to simplify classroom management tasks. 
This tool enables teachers to manage attendance, marksheets, announcements, and file attachments, through a simple and intuitive user interface.

## Features

- **Attendance Management:** Easily track student attendance, mark absences.
- **Marksheet Management:** Create, update, and manage marksheets. 
- **Announcements:** Teachers can post updates, reminders, and important information directly to all students at once.
- **File Attachments:** Simplify file sharing with the ability to attach files. Teachers can send assignments, notes, and other documents to students.

## Technology Stack

- **Java:** The core programming language used to develop the application, ensuring robust performance and scalability.
- **File System Backend:** A simple yet effective backend that utilizes the file system for data storage, making it easy to set up and maintain.


## Usage Manual

When the tool starts it assumes admin.csv file exists, this file is the file where registered teachers will be maintained and therefore should exist at all times, 
if not it ll create a new one.
once a teacher signs-up 2 files will be creates.
#### [teacher-name]+[section] + (Attendance).csv
and
#### [teacher-name]+[section] + (Mark).csv

Notice the teacher name and section name are used in the file naming, this means the username has to be unique which is inforced in the app.

## Screenshot

### SingUp and LogIn
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/sign-up.png)
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/login.png)

## ------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Main DashBoard
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/DashBoard.png)

## ------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Attendance, Marksheet and Student status
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/marksheet.png)
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/marksheet2.png)
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/student-stats.png)

## ------------------------------------------------------------------------------------------------------------------------------------------------------------------
### Sending Attachments and Announcements
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/send-attachments.png)
![Screenshot of the application](https://github.com/Ermi9s/java_project_oop/blob/main/Teacher_Portal/ScreenShots/announcements.png)



