'''
Write a program that prompts for a file name, 
then opens that file and reads through the file, 
looking for lines of the form:

X-DSPAM-Confidence:    0.8475

Count these lines and extract the floating point 
values from each of the lines and compute the average of 
those values and produce an output as shown below. 
Do not use the sum() function or a variable named sum in your solution.
when you are testing below enter mbox-short.txt as the file name.
'''

# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
fh = open(fname)
#print(fh)
s = 0
count = 0
for line in fh:
    if not line.startswith("X-DSPAM-Confidence:"):
        continue
    #print(line)
    pos = line.find(":")
    fg = line[pos+1:].strip()
    num = float(fg)
    s = s + num
    count = count + 1
    #print(num)
    #print(fg)
    #print(pos)

print("Average spam confidence:",s/count)
