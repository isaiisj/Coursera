'''
In this assignment you will read through and parse a file with text and numbers.
You will extract all the numbers in the file and compute the sum of the numbers.
it should work with regex_sum.txt file 
'''

import re

name = input("enter the file name: ")
handle = open(name)

suma = 0
for line in handle:
	line = line.rstrip()
	x = re.findall("[0-9]+",line)
	if len(x) == 0:
		continue
	#print(x)
	for i in x:
		suma = suma + int(i)
	    
print("The sum is",suma)
