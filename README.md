# REST-Assured-Customer-API
## Prerequisites
* Install jdk 8 or any LTS version
* Configure **JAVA_HOME** and **GRADLE_HOME**
* Download Allure 2.17.2 and configure environment path
* Stable internet connection
## How to run this project
* Clone the repo
* Open cmd in the root folder
* Give following commands:
```
gradle clean test
```
```
allure generate allure-results --clean -o allure-report
```
```
allure serve allure-results
```
## Screenshots
These are the snapshots of the allure reports:

![Screenshot_1](https://user-images.githubusercontent.com/71173675/151918228-cdcddcdd-2e71-417e-8474-263141f66ca7.png)
![Screenshot_2](https://user-images.githubusercontent.com/71173675/151918238-f114c8b3-94ce-44c3-a78a-a4f381c4e343.png)
