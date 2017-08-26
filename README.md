# PART1_Strings
One type of variable is particularly special in Java, and that's none other than the String.

In this code snippet, we take a good look at what the String class has to offer.
- We learned that on top of using the "+" operator, the concat() function is way to
combine two Strings into one larger String. 
- From this, we also discerned that String literals (text explicitly typed in quotes) 
are full String objects, and capable of having any of the functions in the String 
class called on them, just like a String variable. 
- We learned that you can use the toUpperCase() and toLowerCase() functions to change
a String's capitalization.
- We learned how to convert an int, or any other Integer literal, into a String
representation of itself using valueOf(), and that this is essentially what println()
does whenever we pass it an argument that is not a String.
- We used length() to - you guessed it - get a String's length.
- We trimmed a string of its leading and ending whitespace with trim(), and compared that String
to the original text using equals() and stored that comparison in a boolean variable. We'll
formally look at booleans soon, but in essence booleans are just a type of data that can only ever be
true or false. When we run the code, our comparison shows that the original text and the text
without the whitespace are the same thing; equals() returned "true".

There's a lot more to learn with Strings - particularly comparing Strings - but for now
go forward confidently. We'll be using Strings in almost every program we write from here
on out, so make sure you have a good understanding of what a String is now and how they operate
in Java.

