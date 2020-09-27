from urllib.request import urlopen
from bs4 import BeautifulSoup as soup

my_url = 'https://finviz.com/screener.ashx'
uClient = urlopen(my_url)
page_html = uClient.read()
uClient.close

page_soup = soup(page_html, "html.parser")
