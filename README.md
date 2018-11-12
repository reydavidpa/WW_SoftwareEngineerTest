# WW_SoftwareEngineerTest 

## SET UP
1. Install maven (current version is 3.6.0)
  
      1.1 Set MAVEN_HOME system environment variable to be {absolutePath}\apache-maven-3.6.0\bin
2. Install java (latest version is 11.0.1)
  
      2.1 Set JAVA_HOME system environment variable to be {absolutePath}\Java\jdk-11.0.1\bin
3. Add MAVEN_HOME and JAVA_HOME to the Path system environment variable
4. Verify maven is properly configured by executing the following command 'mvn -v'. Maven and Jave versions will be displayed.
5. Clone github repo at desire location. Execute folloing command 'git clone https://github.com/reydavidpa/WW_SoftwareEngineerTest.git'
6. Enter the WW_SoftwareEngineerTest directory
7. Run the tests by executing command 'mvn clean test' 


## QUESTIONS
Question 1:
 
There is a file containing a word and its possible meanings (like a Dictionary). The contents of the file look like this:
 
Apple – a fruit, a tech firm
Table – an object, contains rows and columns when used in context of computers
Orange – a fruit
 
Given a path to the file, do the following:
 
a)    Create a method called doesFileExist(String path) which takes the path of the file and tells the user if the file exists at that path or not. Assume all paths are relative to your project structure. If the file does not exist, catch the requisite exception.
b)    Read each word and its possible meanings and print them out. Your output should look like this:
 
Word1
Meaning 1
Meaning 2
Word2
Meaning1
Meaning2
 
Use appropriate data structures wherever necessary.
 
Question 2:
 
Write an automated test for this scenario using WebDriver.
The following exercise does not require user login. Please use ID or class as selectors.
 
Steps:
1. Navigate to https://www.weightwatchers.com/us/
2. Verify loaded page title matches “WW (Weight Watchers): Weight Loss & Wellness Help”
3. On the right corner of the page, click on “Find a Studio”
4. Verify loaded page title contains "Find a Studio & Meeting Near You | WW USA"
5. In the search field, search for studios for zip code: 10011
6. Print the title of the first result and the distance
7. Click on the first search result and you should see names of the person conducting the meeting on the scheduled time right under time for each day. Create a method that would take a weekday as parameter e.g. Sun, Mon, Tue....Sat and the method should print out the names(s) and the number of times each person(s) is conducting the meeting that particular day.
e.g.
getScheduleSummary(Sun)
output should be:
Name: <XXXXX> Total: <XX> times
Name: <YYYYY> Total: <YY> times
 
 
 
Question 3:
Generate 500 random numbers and print the nth smallest number in a programming language of your choice.

