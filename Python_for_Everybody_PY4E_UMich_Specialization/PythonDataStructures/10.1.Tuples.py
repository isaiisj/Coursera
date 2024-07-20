'''
Write a program to read through the mbox-short.txt 
and figure out the distribution 
by hour of the day for each of the messages. 
You can pull the hour out from the 'From ' line by finding 
the time and then splitting the string a second time using a colon.

From stephen.marquard@uct.ac.za Sat Jan  5 09:14:16 2008

Once you have accumulated the counts for each hour, 
print out the counts, sorted by hour as shown below.
'''
name = input("Enter file:")
if len(name) < 1:
    name = "mbox-short.txt"
handle = open(name)
di = dict()

for line in handle:
    line = line.rstrip()
    wds = line.split()
    if len(wds) < 3 or wds[0] != 'From': 
       continue
    else:
        w = wds[5].split(":")
        #print(w)
        di[w[0]] = di.get(w[0],0) + 1

#print(di)

tmp = list()

for k,v in di.items():
    newt = (k,v)
    tmp.append(newt)

#print(tmp)
tmp = sorted(tmp)
#print(tmp)

for k,v in tmp:
    print(k,v)
#fh = handle.read()
#print(fh)
