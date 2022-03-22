# CIS 3515 Assignment 7 (Kotlin Fragments)
The purpose of this lab is to create a new application called AudioBookPlayer, that will incorporate a dynamic
(responsive) user interface UI, that will display a **SINGLE FRAGMENT** at a time if the application is being run
in **portrait mode,** but must display **TWO FRAGMENTS** at a time if the being run in **landscape mode.**

This project is being compiled and tested using the Pixel 3 XL API 30 phone

## Part 1: The Recycler View
This application will contain a list of book items, held inside a RecyclerView, similar to the previous lab, however
this project will incorporate the use of **fragments** to manipulate the data displayed. For the first part, the 
RecyclerView needs to be created, and running properly, with a list of books.

The card_layout.xml file was created. This will hold the card for each book. It will display the cover of the book, as
an image, most likely a drawable, it will contain the book title as a string, and it will contain the book author, also
as a string. This will be populated using the BookObject.kt file, a data class that will hold the values for each of the
books in the project arraylist.

The BookObject will be created when the setDataList() function is called.
1. Book Title: input as a string
2. Book Author: input as a string
3. Book Cover: input as an Integer, for the drawable

## Part 2: Adjust the RecyclerView
The Card Layout and the Adapter have been created. In the Adapter, there is a class called setDataList() which will populate
the mutableListOf() that was created globally within the adapter. These are the values that are added by creating BookObjects.
The next part of this is to add many values, and to create an onClickListener() to make the cards interactive rather than just
a list of books.
