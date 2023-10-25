'''The program will use urllib to read the HTML from the data
files below, extract the href= vaues from the anchor tags, scan
for a tag that is in a particular position relative to the first 
name in the list, follow that link and repeat the process a number 
of times and report the last name you find.'''

import urllib.request, urllib.parse, urllib.error
import urllib
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
repeat = int(input('Enter number of repeatations: '))
position = int(input('Enter the link position: '))

# Retrieve all of the anchor tags
'''tags = soup('a')
for tag in tags:
    print(tag.get('href', None))'''

for i in range(repeat):
    html = urllib.request.urlopen(url, context=ctx).read()
    soup = BeautifulSoup(html, 'html.parser')
    tags = soup('a')
    count = 0
    for tag in tags:
        count+= 1
        if count <= position:
            url = tag.get('href', None)
            name = tag.contents[0]
        else:
            break

print(name)
