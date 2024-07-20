'''
Open the file romeo.txt and read it line by line. For each line, 
split the line into a list of words using the split() method. The program 
should build a list of words. For each word on each line check to see if 
the word is already in the list and if not append it to the list. When 
the program completes, sort and print the resulting words in python sort() 
order as shown in the desired output.
'''

fname = input("Enter file name: ")
fh = open(fname)
lst = list()
lst2 = list()
lst3 = list()
#fg = fh.read() #// Alternative code (AC)
for line in fh:
	line = line.rstrip()
	lst = lst + line.split()
#lst = fg.split() #// AC
#print("Printing list 1")
#print(lst)
lst2 = sorted(lst)
#print("\n\nPrinting list 2")
#print(lst2)
#lst.sort()
#print(lst)

for word in lst2:
	if word in lst3:
	    continue
	else:
	    lst3.append(word)
	    #print(lst2)

#print("\n\nPrinting list 3")
print(lst3)
