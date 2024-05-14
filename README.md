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

* ### Sign in & Sign up & Log out
In order to access the application, users must sign up first by selecting the “Sign Up” button. For those who already have an account, they can sign in by entering their username and password into the respective input fields. The user will have access to the home page if the entered username and password are valid. If the username and password are not valid, a warning modal will be displayed.

* ### Search
By using the "Search" button in the navigation bar, users can access the Search page. The "Search tool box" and the "Capstone project list" can be found once a user accesses the Search page. The user is able to search the capstone projects with various criteria through the search tool box. Options for searching capstone projects include by company, supervisor, and name. The user can also combine several search options to find more accurate results.

* ### View Another User’s Profile

Once the user finds a specific user, it is possible to view that user’s profile by selecting the “Show Info” button, also the profile page can be closed by selecting the “Close button” in the top right  and right button of the profile page.

### Student

* ### Student Profile 
The student profile encompasses various important details about the student, including student name, major, contact, email, group, company, capstone project name, capabilities, bibliography and profile image. If the students belong to a group, the group information will be shown, also the capability section showcases the list of the skills the student possesses. If there is no corresponding information, the information will be shown as “N/A”.

* ### Create Group
By selecting the “Create Group” button, students can create a group. The student must provide the group name in order to create a group.

> It is important to note that to create a group, the student must not be a member of any existing group.

* ### Group Information

The student is able to view their group information by selecting the “Group Info” button in the navigation bar. Once the student moves the Group Info Page, the student is able to view the group name, group members. Also, through the Group Info Page the student can leave the group by selecting the “Leave Group “ button.

* ### Apply a capstone project

In order to apply for a capstone project, a student must be a member of an existing group or they have the option to join another group. The process of applying for a capstone project involves accessing the “Search” page, where students can view and search the capstone projects.

>To apply for a capstone project, the student must be a member of an existing group. Through the Capstone Project Detail Page, their group can apply for a group by selecting the “Apply button”.  The student can move to the Capstone Project Detail Page from the Search page where the student can view and search the capstone project.


### Company


* ### Create Capstone Project
Once the company clicks the “Create Capstone” button, the company is required to fill in a form with relevant information. When the company fills in the form, the company can create a capstone project by selecting “Submit” button. 

* ### Capstone Project Status

The company is able to view their projects’ status. The status is decided by the admin and there are three status which are “Pending”, “Approved” and “Reject”. The pending status is waiting for the review from the admin, approved status is approved by admin and it can be assigned by student group, and rejected status is rejected by admin and it can not be assigned by student group.

### Supervisor

* ### View Capstone Projects in Charge

If the admin decides the supervisor to be a certain project supervisor, the supervisor is able to view their projects on the main page. Also, they can edit the capstone project’s detailed information by selecting the “Edit button” on the capstone project item. 

* ### Edit Capstone Project

### Admin
 
* ### Decide Capstone Project Status

Once a company creates a capstone project, the capstone project will be displayed in the admin’s main page, and the capstone project will be positioned in the request capstone list. The admin is able to view the capstone project information and decide the status by clicking the “Review” button. 

* ### Decide Supervisor


## usecase diagram
