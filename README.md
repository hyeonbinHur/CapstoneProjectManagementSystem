<p>
<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css3-1572B6?style=for-the-badge&logo=css3&logoColor=white">
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=white">
<img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
<img src="https://img.shields.io/badge/amazonrds-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white">
<img src="https://img.shields.io/badge/postgresql-4169E1?style=for-the-badge&logo=postgresql&logoColor=white">
</p>
<br>
<br>
<br>

<div align="center">
    <img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/bc69961b-24e9-4b76-99ac-9ba9e052e0c7"  width="300">
</div>

<details>
    <summary> Table of Contents </summary>
    <ul>
    <li> <a href="#about-the-project"> About Project </a>
    <li> <a href="#functional-requirement"> Functional Requirement </a>
    <li> <details> <summary> <a href="#features">Featues </a></summary>
    <ul>
    <li><a href="#student">Student</a></li>
    <li><a href="#company">Company</a></li>
    <li><a href="#supervisor">Supervisor</a></li>
    <li><a href="#admin">Admin</a></li>
    </ul> 
    </details> 
    <li> usecase diagram
</details>

## About The Project

At RMIT, final-year engineering students will have to participate in capstone projects for enterprises, but there is no complete system to assist them manage these projects and the interactions among related individuals. Recognizing this need, we developed an all-in-one web application specifically designed for RMIT University. This application provides an user-friendly interface and a robust platform that makes it simpler to manage and coordinate the components in the system. This application is designed for students, supervisors, companies and administrators of the system.

## Front-end Functional Requirement

The front-end of the Capstone Project Management is required achieve the several criterias: 

* The frontend should provide a sign-in/sign-up web page before accessing the main page system. 
* The frontend is required to display dashboard-view suited to user role: 

    * Admin dashboard: (Admin is the university account)

        * The frontend needs to display all requested capstones from the companies.

        * The frontend can present a button for the admin to review the capstone.

        * The frontend can display capstone’s information in the form of a modal which allows the admin to approve or reject.

        * Inside the modal, the frontend needs to present a small area to assign the supervisor for the capstone. 

    * Student dashboard: 
        * The front end of the student’s dashboard needs to display the current registered capstone project.
    * Supervisor dashboard: 
        * The frontend needs to display all the capstone projects that were assigned from the admin account.
    * Company dashboard:
        * The frontend can display all the pending(waiting for reviewed)/approved/reject capstone lists.


## Features

### Basics

There are 7 basic features which are the “Sign Up” , “Sign In”, “Log out”, “View Profile”, “Edit Profile”, “Search”, “View Capstone Project Detail”, and “View Other User’s Profile” . For the admin, “Sign In”, “Log out”, “Search”,“View Capstone Project Detail'' and “View Other User’s Profile” are provided, and for the student, company, and supervisor, all 7 features are provided. 

### Student

The features that are only available to students will be described in this section. “Create Group”, “Leave Group”,”Apply Capstone Project”, “View Group Information”, and “Join Group” are among the features. Additionally, the “View Profile Page”, and “Edit Profile” are also explained.

* ### Create Group
* ### Join Group
* ### Leave Group
* ### Belongs to Group
* ### View Group info
* ### Apply Capstone Project

### Company

he features for the company will be explained, such as “Create Capstone Project”, “View Capstone Project Status”, and “Delete Capstone Project”. Also, the distinct company’s profile view and edit profile view will be explained.

* ### Create Capstone Project
* ### View Project Status
* ### Delete Capstone Project

### Supervisor

 the supervisor’s specific features will be explained such as “View their responsible capstone project”, “Edit Capstone project”. Also, the supervisor’s Profile Page and Edit Profile Page will be explained.

* ### View Project in Charge
* ### Edit Capstone Project

### Admin

the admin’s specific features in the application will be explained, such as “Decide Capstone Project Status” ,“Decide Supervisor”, and “View All  Users”. 
* ### Decide Capstone Project Status
* ### Decide Supervisor
* ### View All Users

## usecase diagram
