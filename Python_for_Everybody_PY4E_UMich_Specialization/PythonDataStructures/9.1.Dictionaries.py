'''
Write a program to read through the mbox-short.txt and figure out
who has sent the greatest number of mail messages. The program looks 
for 'From ' lines and takes the second word of those lines as the person 
who sent the mail. The program creates a Python dictionary that maps the
sender's mail address to a count of the number of times they appear in 
the file. After the dictionary is produced, the program reads through the 
dictionary using a maximum loop to find the most prolific committer.
'''

name = input("Enter file:")
if len(name) < 1:
    name = "mbox-short.txt"
handle = open(name)
di = dict()
count = 0

for line in handle:
    line = line.rstrip()
    wds = line.split()
    if len(wds) < 3 or wds[0] != 'From':
       #print("Ignoring") 
       continue
    else:
        di[wds[1]] = di.get(wds[1],0) + 1

#print(di)

largest = -1
theWord = None
for k,v in di.items():
    #print(k,v)
    if v > largest:
        largest = v
        theWord = k

print(theWord,largest)
