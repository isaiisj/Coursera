'''
The program will prompt for a URL, read the XML 
data from that URL using urllib and then parse and 
extract the comment counts from the XML data, compute
the sum of the numbers in the file.
'''

import urllib.request, urllib.parse, urllib.error
import xml.etree.ElementTree as et

url = input('Enter location: ')
print('Retrieving', url)
xml = urllib.request.urlopen(url).read()
print('Retrieved', len(xml), 'characters')

total = 0
sum = 0

tree = et.fromstring(xml)
counts = tree.findall('.//count')
for count in counts:
    sum += int(count.text)
    total += 1

print('Count:', total)
print('Sum:', sum)
