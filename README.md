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

D.Testing Process-
Test Driven Development(TDD) was used in the project.I used the tests given in "DateModelTests" along with a few custom tests to complete the DateModel.java file.Following tests were used-
Given year, month, date,check if they are numerical values or not.
Empty string, then considered not numerical
Given year,check if it is a positive value or not.
Check if month is between 1 and 12.
Check if given date is between 1 and max number of days possible for that month(30/31).If not,then throw an exception.
Special case of February 29th and Leap Year.
Tests with valid inputs and compared results with actual days


Accessibility-
Talkback-Experience was great with this.All the view elements are properly labelled,and audio prompts are also clearly audible.
Accessibility Scanner-The following hints/suggestions were given: 
Insufficient text color contrast ratio(2.68:1) while the recommended one is at least 4.5:1,
It asked to change the color to a better one. Was fixed using this- <item name="android:textColorHint">#757575</item> (added in EditText of each ID).
Touch target size too small:It was 45dp,but the recommended size is 48dp,so i resolved this by using attribute android:minHeight="48dp"


E.It took me roughly 12-15 hours to do this assignment. Had to take help from the internet and some of my friends(satej,harman,karan and fdcm-ayush)

F.Difficulty-7/10(tough if you are new to development,became easier due to the lecture videos)
