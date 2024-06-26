The Reverse Hash Application
============================

This application uses a very simple brute force attack to 
"reverse" an MD5 hash.  It is really not reversing the hash
at all as that would be impossible.  Instead it knows that 
the original pre hash text was a lower case character string with 
exactly four numbers. It is a modification of the example two letter 
cracker.

So the application uses four nested loops and tests all
combinations of four numbers, and computes the
hashes of those values and checks to see if the computed hash
matches.

You can play with the original example code taken to do this application at:

http://www.wa4e.com/code/crack

This is a lesson in how easy it is to crack short passwords
with a limited alphabet.  While this works well to crack 
very short passwords it is not practical as password 
length grows.

A more sophisticated attack to reverse hashes which uses a 
lot of storage to pre-compute lots of hashes and look them up
quickly is called "Rainbow Tables".  This tiny application
is *not* using a Rainbow Table approach.

