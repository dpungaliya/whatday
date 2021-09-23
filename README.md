# WhatDay

A.

Name of the project-WhatDay
Name-Dhaval Pungaliya
BITS ID-2018B2A70662G
Email ID-f20180662@goa.bits-pilani.ac.in

B.This simple Android app asks the user for a date in the Gregorian calendar and returns the day of the week for that date.It is using Java Calendar API in the backend.
We need to enter three fields where date, month and year.
On clicking the button,the day of the week corressponding to that particulare date gets displayed.However,if in invalid date is entered, the app shows the error of invalid input.Also,for non-leap years, entering the date as "29" for the month of "February(2)" throws an error.

Bugs:It isnt able to use the spacebar. It isnt allowing to use Strings(characters etc) but only numbers.
I need to refresh/relaunch the app everytime,while checking for a new date.This was the case originally,when i was using a different approach(have added it in the comments)
Also,this does not work for "B.C",ie year<0. Maybe the feature of AD/BC can be added.

C.
Task 1-Designing the DateModel Class
I updated the 'DateModel.java'file and modified its methods.
Used the library : java.util.Calendar. 
Created a static variable msg, which will contain the error message or the day to be displayed. The getMessage() method returns this variable message.
Declared the variables in the initialize() method.
Validation was done in the getMessage() methosd.The validation had a precedence order of Year then Month and then Date. Given year, month, date,check if they are numerical values or not(used try-catch for this and display the message if an error).
If the date is 31 and months are 2,4,6,9,11(checked using an array) displays the message : "This month does not have 31 days"
For february, display error message if date is 30 (>30 cases already covered above). If date is 29, check if the year is a leap year. If not then display error.
If the Inputs are valid, the Calendar API is called.Calender object is created and we set its year,month and date. We then use the "getDisplayName()" method to get our day of the week,and it is stored in the msg variable and is returned.


Task 2-Calling and Connecting the UI in MainActivity.java
Made minor changes to UI including color change, size changes(mentioned in Task3 b-Accessibility Scanner). 
In 'MainActivity.java' , referenced those UI elements and set an onClickListener() on check button click to call the initialize() and getMessage() method of 'DateModel.java'.
Values from the EditTexts are read, converted to string and sent to the DateModel class,and then we display the message recieved on the TextField.

Task 3:Accessibility-
a)Talkback-Experience was great with this.All the view elements are properly labelled,and audio prompts are also clearly audible.All the input fields had enough information to make a decision. Even using keyboard experience on talkback was smooth. The button too was easily navigatable 
b)Accessibility Scanner-The following hints/suggestions were given: 
Insufficient text color contrast ratio(2.68:1) while the recommended one is at least 4.5:1,
It asked to change the color to a better one. Was fixed using this- <item name="android:textColorHint">#757575</item> (added in EditText of each ID).
Touch target size too small:It was 45dp,but the recommended size is 48dp,so i resolved this by using attribute android:minHeight="48dp"


D.Testing Process-
Test Driven Development(TDD) was used in the project.I used the tests given in "DateModelTests" along with a few custom tests to complete the DateModel.java file.Following tests were used-
Given year, month, date,check if they are numerical values or not.
Empty string, then considered not numerical
Given year,check if it is a positive value or not.
Check if month is between 1 and 12.
Check if given date is between 1 and max number of days possible for that month(30/31).If not,then throw an exception.
Special case of February 29th and Leap Year.
Tests with valid inputs and compared results with actual days



E.It took me roughly 12-15 hours to do this assignment. Had to take help from the internet and some of my friends(satej,harman,karan and fdcm-ayush)

F.Difficulty-7/10(tough if you are new to development,became easier due to the lecture videos)


References
https://swaroopjoshi.in/courses/mobile-app-dev
https://en.wikipedia.org/wiki/Gregorian_calendar
https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
https://stackoverflow.com
https://google.com
https://www.programiz.com/java-programming/examples/check-string-numeric
https://java2blog.com/get-day-name-from-date-java/
https://www.geeksforgeeks.org/calendar-set-method-in-java-with-examples/
https://www.programcreek.com/java-api-examples/?class=java.util.Calendar&method=getDisplayName