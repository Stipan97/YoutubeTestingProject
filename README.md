# YoutubeTestingProject

## Overview
This repository contains Selenium functionality tests for the [YouTube](https://www.youtube.com/) web page. Details of each test is on the bottom of README.

## Getting started
With these instructions you can clone project to your local computer machine and run up it for testing purposes.

### Prerequisites
You will need:
* [Chrome driver](https://chromedriver.chromium.org/downloads) or [Gecko driver - (Firefox driver)](https://github.com/mozilla/geckodriver/releases)
* [Development Kit](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
* [IntelliJ IDE](https://www.jetbrains.com/idea/download/#section=windows)
* [TestNG](https://mvnrepository.com/artifact/org.testng/testng) and [Maven](http://maven.apache.org/surefire/download.cgi)

### Installation
#### 1. Install JDK [(Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
#### 2. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
#### 3. Download [Chrome driver](https://chromedriver.chromium.org/downloads) or [Gecko driver](https://github.com/mozilla/geckodriver/releases)
* 3.1 Extract drivers in [../webdrivers](https://github.com/Stipan97/YoutubeTestingProject/tree/master/webdrivers) and you will not need to change path for drivers in [WebDriverSetup](https://github.com/Stipan97/YoutubeTestingProject/blob/master/src/test/java/tests/WebDriverSetup.java) class
#### 4. Download project
* 4.1 Clone the repository
    * Open Terminal and type in this line:
```
git clone https://github.com/Stipan97/YoutubeTestingProject.git
```
* 4.2 Open IntelliJ and navigate to path of downloaded folder

## How to run tests
1. You need to have opened IntelliJ with project
2. Right click on testng.xml file
<img src="https://user-images.githubusercontent.com/44756029/75101075-5c1dae00-55d7-11ea-9e94-1e32b5742dac.png" width="75%">

### Annotation
Sometimes test for likes or dislikes can fail. Because of bot prevention.

# Test description
Previews are on 50% of speed.
### LoginTest
This test logins in test account over a google gmail account. Test inputs e-mail and password of account.
<img src="https://user-images.githubusercontent.com/44756029/75101627-9ab76680-55df-11ea-8366-0a7a6c8361eb.gif" width="100%">
### SearchTestFERIT
This test contains two tests. First one searches for "We Are FERIT" and looking is there any video that have href of that video if there is one test will open it. Second test searches for same video but with another search input this time we are searching for video with "FERIT Osijek" input search.
<img src="https://user-images.githubusercontent.com/44756029/75101628-9db25700-55df-11ea-84db-28575ab0c4b0.gif" width="100%">
### LikeDislikeTest
This test contains four tests. Tests for like, unlike, dislike and undislike. This test in every test will click like or dislike and check like/dislike counter to see is there any change to verify that server accepts action.
<img src="https://user-images.githubusercontent.com/44756029/75101652-06013880-55e0-11ea-86ce-7c513d7266bf.gif" width="50%"><img src="https://user-images.githubusercontent.com/44756029/75101653-07326580-55e0-11ea-9a1a-658e95932fbf.gif" width="50%">
### SubscribeTest
This test contains three tests. Tests for subscribe, unsubscribe and turn on all notifications.
<img src="https://user-images.githubusercontent.com/44756029/75101635-af93fa00-55df-11ea-9860-bdd65de4de4a.gif" width="50%"><img src="https://user-images.githubusercontent.com/44756029/75101631-a73bbf00-55df-11ea-9acb-b37f6a52be45.gif" width="50%">
