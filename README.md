COMP204-16B / COMP242-16B Assignment 5
======================================

Due on **Sunday, 11^(th) September at 11:30pm**.


Introduction to Android
=======================

The goal of this exercise is to become accustomed to Android Studio and the basics of Android development.

Android is described in the [documentation supplied by Google, found here](https://developer.android.com/index.html).


Preamble
========

1. Fork this repository using the button at the top of the page.
  * Set the visibility level of the project to Private.
2. Clone your new repository to your computer using Git.
3. Remember to commit and push regularly!


Task 1
======

* To begin, open the '[Building Your First App](https://developer.android.com/training/basics/firstapp/index.html)' tutorial
* Follow through the linked tutorial with the following notes
  * Use API level 23 (Marshmallow)
  * Name your project **PartOne**
* Add the project, and a suitable gitignore file to your repository
  * Remember to commit and push regularly
* Modify the two activities in your project so that both have a [TextView](https://developer.android.com/reference/android/widget/TextView.html) visible that displays your name and ID number
  * We will be marking this on function, not appearance - it can be ugly, but it has to function
  * You may need to experiment with different layouts in order to get all the controls visible
* Take a screenshot of each of your activities running in your emulator, ensuring your name and ID is visible
  * Add your two screenshots below


Task 1 Screenshots
------------------
![alt tag](http://puu.sh/r2Jef/5e721812a4.jpg)
![alt tag](http://puu.sh/r2Jf9/9a29513d0e.jpg)


Task 2
======

* Create a new project named **PartTwo**, using API 23 (Marshmallow), starting with a blank activity
* Add the project, and a suitable gitignore file to your repository
  * Remember to commit and push regularly
* Remove the Hello World TextView from the layout
* Change the layout to be a LinearLayout, with a vertical orientation
* Add a screen-width EditText and a button to the layout
  * Give these controls useful ids
  * Put the text "Toast!" on the button
* In your application code, programmatically add an on-click listener to the button
  * When clicked, the button should create and show a [Toast](https://developer.android.com/reference/android/widget/Toast.html) that contains the contents of the EditText
  * Refer to panopto for assistance
* Update your layout so that the button starts disabled (ie, cannot be clicked)
* In your application code, programmatically add a text-changed listener to the EditText
  * In this listener, check if the EditText is empty
  * If the EditText is **not** empty, enable the button
  * If the EditText is empty, disable the button
* Add 3 buttons to your layout
  * Set the text of one button to Red, another to Green, and the last to Blue
  * Using the android:onClick property in your layout XML, assign **the same onClick listener** to each of these 3 buttons
* Back in your application code, implement the listener code for the buttons
  * When the 'Red' button is pressed, set the Activity background to be Red
  * When the 'Green' button is pressed, set the Activity background to be Green
  * When the 'Blue' button is pressed, set the Activity background to be Blue
* Update your onClick listener code so that once a color has been selected, the button for this color is disabled
  * When a different color is selected, the previous color button should be re-enabled
* Take 4 screenshots of your application running in your emulator
  * One before any color buttons have been pressed
  * One for each of the color button states
  * Add your screenshots below


Task 2 Screenshots
------------------
![alt tag](https://puu.sh/r2IDD/b0f6773cd1.png)
![alt tag](https://puu.sh/r2Itf/560fba85aa.png)
![alt tag](https://puu.sh/r2IvX/2bfb910402.png)
![alt tag](https://puu.sh/r2IC7/95a4e9181e.png)



Submission
==========

Upload a zipped copy of your repository to [moodle in the assignment submission](https://elearn.waikato.ac.nz/mod/assign/view.php?id=570995). 
Please download the zip from GitLab using the download button in the top right 
of the project view rather than zipping it from the copy on your local hard drive.


Grading
=======

| Weighting | Allocated to |
|:---------:|--------------|
| 10% | Correct repository usage and settings |
| 40% | Task 1 |
| 50% | Task 2 |
