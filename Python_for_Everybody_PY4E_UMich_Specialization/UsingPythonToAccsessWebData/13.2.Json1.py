'''The program will prompt for a URL, read the JSON data from
that URL using urllib and then parse and extract the comment
counts from the JSON data, compute the sum of the numbers 
in the file and enter the sum below:'''

import urllib.request, urllib.parse, urllib.error
import json

json_url = input("Enter location:")
print("Retrieving", json_url)
data = urllib.request.urlopen(json_url).read()
print('Retrieved', len(data), 'characters')
json_obj = json.loads(data)


sum = 0
count = 0

for comment in json_obj["comments"]:
    sum += int(comment["count"])
    count +=1

print('Count', count)
print("Sum", sum)
