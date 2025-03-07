#Strings

collection of characters that are used to represent textual data in programming, object that represents a sequence of characters, immutable(This is handled internally by creating a new string object
whenever a modification is made)

##Create string
1. using literals -> String str1 = "Hello, World!";
2. Using the new Keyword -> String str2 = new String("Hello, World!");

##Escape Sequence "\"
to include special characters in strings. Similar to using "\n" for newline. 
Since we wanted double quotes to be printed and to avoid conflict with String double quotes we have used the escape sequence "\". 

## String Input
next() method -> only one word before space appears
nextLine() -> take the whole line of text as input
trim() -> Inbuilt method in String class, remove all the leading and trailing spaces from the text

##Built-In Methods
trim(): We have already seen this which is essentially to remove all the leading and trailing spaces from the text
length(): finds the length of the string 
charAt(): returns a character from the string
concat():  joins two strings together 
equals():  compares two strings 
toCharArray():  converts the string to a character array
substring(int beginIndex, int endIndex): Returns a string that is a substring of this string. The substring begins at the specified beginIndex and ends at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
toLowerCase(): Converts all of the characters in the text to lower case
toUpperCase(): Converts all of the characters in the text to upper case
indexOf(), lastIndexOf(), .contains() -> search in string
replace(old, new), replaceAll(old, new) -> Replacing Characters/Substrings
split() -> divide string into array where the division is based on the condition/parameter provided in the method 

##ASCII Character Codes
A to Z -> 65 to 90
a to z -> 97 to 122
 difference between a and A is 32

##Exception
unexpected event that occurs during program execution, affects the the flow of the program instructions, cause the program to terminate abnormally.

##Exception Hierarchy 
Java Throwable class is the root class in the hierarchy. It Splits into Error and Exception
1. java.lang.Error - Error represents irrecoverable conditions such as Java virtual machine (JVM) running out of memory, memory leaks, stack overflow errors, library incompatibility, infinite recursion, etc. 
2. java.lang.Exception - Exceptions can be caught and handled by the program. 
When an exception occurs, it creates an object. This object is called the exception object.
It contains information about the exception such as the name and description of the exception and the state of the program when the exception occurred.

##Exception Types
Exception class is further divided into RuntimeException which are Unchecked Exceptions and Checked Exceptions like IOException.
1. java.lang.RuntimeException -> raised during runtime due to programming errors, not checked at compile time, also called unchecked exceptions. 
	eg. Improper use of an API - IllegalArgumentException
	Null pointer access (missing the initialization of a variable) - NullPointerException
	Out-of-bounds array access - ArrayIndexOutOfBoundsException
	Dividing a number by 0 - ArithmeticException
2. java.io.IOException -> unchecked exception, checked by compiler during compile-time and need to be handled by the programmer using the try...catch block, used during the handling of File Operations, user defined exceptions come under this. 

## String Pool 
Java maintains a pool of strings for efficient memory usage. String literals are interned, meaning they are stored in a common pool.
	String str3 = "Hello";
	String str4 = "Hello";
	boolean isSameReference = (str3 == str4); // true, because both refer to the same object in the string pool
