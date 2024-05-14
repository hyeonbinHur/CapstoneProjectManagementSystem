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
<div align="center">
<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/57d01990-7e79-4e45-90bd-2e3c12e3629a">
</div>


* ### Search
By using the "Search" button in the navigation bar, users can access the Search page. The "Search tool box" and the "Capstone project list" can be found once a user accesses the Search page. The user is able to search the capstone projects with various criteria through the search tool box. Options for searching capstone projects include by company, supervisor, and name. The user can also combine several search options to find more accurate results.
<div align="center">
<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/1f28b640-89d3-4068-8153-4984bf3c9664">
</div>

|Search title| Images|
|:--:|:--:|
|Stduent|<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/679ad767-0f89-4646-945f-b21b320ec733">|
|Company|<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/400fe262-9375-460b-a447-2975a3fa35fb">|
|Group|<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/fea991e0-192a-4e14-a3d2-242de088856f">|
|Supervisor|<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/4be2a7ab-8a2f-4e43-bd6d-d1f14737cba6">|

* ### View Another User’s Profile

Once the user finds a specific user, it is possible to view that user’s profile by selecting the “Show Info” button, also the profile page can be closed by selecting the “Close button” in the top right  and right button of the profile page.

### Student

* ### Student Profile 
The student profile encompasses various important details about the student, including student name, major, contact, email, group, company, capstone project name, capabilities, bibliography and profile image. If the students belong to a group, the group information will be shown, also the capability section showcases the list of the skills the student possesses. If there is no corresponding information, the information will be shown as “N/A”.
<div align="center">
<img alt="User profile" src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/d4f2e2cc-592a-414f-8ca0-fab4c5a2ac80" width="400">
<img alt="Edit profile" src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/42885b52-3a28-4ec8-92d2-cb4747d5ec1a" width="400">
</div>

* ### Create Group
By selecting the “Create Group” button, students can create a group. The student must provide the group name in order to create a group.

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/23a09d52-ec2e-4eca-a2b5-dab15876aa60">

> It is important to note that to create a group, the student must not be a member of any existing group.

* ### Apply a capstone project

In order to apply for a capstone project, a student must be a member of an existing group or they have the option to join another group. The process of applying for a capstone project involves accessing the “Search” page, where students can view and search the capstone projects.

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/2e92c30c-6da4-42eb-ba8f-365377aca97f">

>To apply for a capstone project, the student must be a member of an existing group. Through the Capstone Project Detail Page, their group can apply for a group by selecting the “Apply button”.  The student can move to the Capstone Project Detail Page from the Search page where the student can view and search the capstone project.

* ### Student Architecture

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/8f35c43a-40e8-4ac0-9506-41de175d4100">

### Company

* ### Create Capstone Project
Once the company clicks the “Create Capstone” button, the company is required to fill in a form with relevant information. When the company fills in the form, the company can create a capstone project by selecting “Submit” button. 

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/74adcb13-623d-4a0f-8819-6c158609dfa8">

* ### Capstone Project Status

The company is able to view their projects’ status. The status is decided by the admin and there are three status which are “Pending”, “Approved” and “Reject”. The pending status is waiting for the review from the admin, approved status is approved by admin and it can be assigned by student group, and rejected status is rejected by admin and it can not be assigned by student group.

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/683f8886-e9f0-445e-b139-eaca5ed8df83">

* ### Company Architecture

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/be1041ae-47e7-41d2-8f00-014bb8d40a96">

### Supervisor

* ### View Capstone Projects in Charge

If the admin decides the supervisor to be a certain project supervisor, the supervisor is able to view their projects on the main page. Also, they can edit the capstone project’s detailed information by selecting the “Edit button” on the capstone project item. 

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/91fb8a25-23b8-4a07-a1ea-2d5caf8e51b7">

* ### Edit Capstone Project

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/5ce46c78-1a1a-425a-aaee-8dcf116366a2">

* ### Supervisor Architecture

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/3e8167f3-e27a-4800-93d5-6a41b8419708">

### Admin
 
* ### Review the project

Once a company creates a capstone project, the capstone project will be displayed in the admin’s main page, and the capstone project will be positioned in the request capstone list. The admin is able to view the capstone project information and decide the status by clicking the “Review” button. 

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/44fe6b86-dfee-4bc7-9a85-b7fd4331354e">

* ### Decide Supervisor & project status

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/0c928636-259a-4ceb-aa55-fcc57e3cffb7" width="400">

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/5a24b5db-f333-4aa6-85c3-df84a377cbe4" width="400">

* ### Admin Architecture

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/7024f805-8c1c-484a-ae77-980719c2127f">


## usecase diagram

* ### Usecase diagram for the basic features
<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/79b23275-0337-4b9a-9249-13df3bc3c7b8">

* ### Usecase diagram for the specific features

<img src="https://github.com/hyeonbinHur/CapstoneProjectManagementSystem/assets/160996936/299182ad-6176-45c9-92c1-5dfa355bf290">
