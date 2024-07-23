''' 
The program will use urllib to read the HTML from the data files below, 
and parse the data, extracting numbers and compute the sum of the numbers in the file.
http://py4e-data.dr-chuck.net/comments_42.html 
'''

from urllib.request import urlopen
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
html = urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, "html.parser")

count = 0
suma = 0
# Retrieve all of the anchor tags
tags = soup('span')
for tag in tags:
    # Look at the parts of a tag
    #print('TAG:', tag)
    #print('URL:', tag.get('href', None))
    #print('Contents:', tag.contents[0])
    #print('Attrs:', tag.attrs)
    count += 1
    suma = suma + int(tag.contents[0])

print("Count",count)
print("sum",suma)
