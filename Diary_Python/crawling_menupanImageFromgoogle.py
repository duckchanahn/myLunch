import requests
import time
from selenium import webdriver
# -*- coding: UTF-8 -*-
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys

import pandas as pd
import numpy as np

##################################################################################################################
from selenium.webdriver.chrome import webdriver

chromedriver = './chromedriver.exe'  # 크롬 드라이버 경로
SCROLL_PAUSE_SEC = 1

options = webdriver.ChromeOptions()
options.add_argument('headless')  # 실행했을 때 웹 브라우저를 띄우지 않는 headless chrome 옵션 적용
options.add_argument('disable-gpu')  # GPU 사용 안함 --> headless 설정, gpu 사용 안함 : 속도 향상
options.add_argument('lang=ko_KR')  # 언어 설정
options.add_argument(
    "user-agent=Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko")  # 봇 차단을 막기 위한 우회
driver = webdriver.Chrome(chromedriver, options=options)  # 옵션 적용

driver.implicitly_wait(10)

driver.get(
    "https://www.google.com/search?q=%EB%A9%94%EB%89%B4%ED%8C%90&tbm=isch&ved=2ahUKEwjngOmFqpbvAhVYyIsBHQc8DcsQ2-cCegQIABAA&oq=%EB%A9%94%EB%89%B4%ED%8C%90&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADoFCAAQsQNQ8FhY84YBYKqLAWgBcAB4AIABdYgB6ASSAQMyLjSYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=3qhAYOeZE9iQr7wPh_i02Aw&bih=752&biw=768")

last_height = driver.execute_script("return document.body.scrollHeight")

while True:
    # 끝까지 스크롤 다운
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

    # 1초 대기
    time.sleep(SCROLL_PAUSE_SEC)

    # 스크롤 다운 후 스크롤 높이 다시 가져옴
    new_height = driver.execute_script("return document.body.scrollHeight")
    if new_height == last_height:
        break
    last_height = new_height

driver.find_element_by_class_name("mye4qd").click()

while True:
    # 끝까지 스크롤 다운
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

    # 1초 대기
    time.sleep(SCROLL_PAUSE_SEC)

    # 스크롤 다운 후 스크롤 높이 다시 가져옴
    new_height = driver.execute_script("return document.body.scrollHeight")
    if new_height == last_height:
        break
    last_height = new_height

image = driver.find_elements_by_class_name("rg_i.Q4LuWd")

import urllib
import re

for i in range(0, len(image)):

    url_image = image[i].get_attribute('src')

    try:
        save1 = "D:\Code\Diary\Diary_Python\image_menupan/menu" + str(i) + ".png"

        hdr = {'User-Agent': 'Mozilla/5.0'}

        req = urllib.request.Request(url_image, headers=hdr);
        file_temp = urllib.request.urlopen(req).read()

        file_save = open(save1, 'wb')  # w : 쓰기, r : 읽기 , a : 더하기, wb : 바이너리로 쓰기
        file_save.write(file_temp)
        file_save.close()
    except:
        print(i)
        print(url_image)

# %%

chromedriver = './chromedriver.exe'  # 크롬 드라이버 경로
SCROLL_PAUSE_SEC = 1

options = webdriver.ChromeOptions()
options.add_argument('headless')  # 실행했을 때 웹 브라우저를 띄우지 않는 headless chrome 옵션 적용
options.add_argument('disable-gpu')  # GPU 사용 안함 --> headless 설정, gpu 사용 안함 : 속도 향상
options.add_argument('lang=ko_KR')  # 언어 설정
options.add_argument(
    "user-agent=Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko")  # 봇 차단을 막기 위한 우회
driver = webdriver.Chrome(chromedriver, options=options)  # 옵션 적용

driver.implicitly_wait(10)

driver.get(
    "https://www.google.com/search?q=%EB%A9%94%EB%89%B4%ED%8C%90&tbm=isch&ved=2ahUKEwjngOmFqpbvAhVYyIsBHQc8DcsQ2-cCegQIABAA&oq=%EB%A9%94%EB%89%B4%ED%8C%90&gs_lcp=CgNpbWcQAzIECCMQJzICCAAyAggAMgIIADICCAAyAggAMgIIADICCAAyAggAMgIIADoFCAAQsQNQ8FhY84YBYKqLAWgBcAB4AIABdYgB6ASSAQMyLjSYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=3qhAYOeZE9iQr7wPh_i02Aw&bih=752&biw=768")

last_height = driver.execute_script("return document.body.scrollHeight")

while True:
    # 끝까지 스크롤 다운
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

    # 1초 대기
    time.sleep(SCROLL_PAUSE_SEC)

    # 스크롤 다운 후 스크롤 높이 다시 가져옴
    new_height = driver.execute_script("return document.body.scrollHeight")
    if new_height == last_height:
        break
    last_height = new_height

driver.find_element_by_class_name("mye4qd").click()

while True:
    # 끝까지 스크롤 다운
    driver.execute_script("window.scrollTo(0, document.body.scrollHeight);")

    # 1초 대기
    time.sleep(SCROLL_PAUSE_SEC)

    # 스크롤 다운 후 스크롤 높이 다시 가져옴
    new_height = driver.execute_script("return document.body.scrollHeight")
    if new_height == last_height:
        break
    last_height = new_height

image = driver.find_elements_by_class_name("rg_i.Q4LuWd")

import urllib
import re

for i in range(0, len(image)):

    url_image = image[i].get_attribute('src')

    try:
        save1 = "D:\Code\Diary\Diary_Python\image_menupan/menu" + str(i) + ".png"

        hdr = {'User-Agent': 'Mozilla/5.0'}

        req = urllib.request.Request(url_image, headers=hdr);
        file_temp = urllib.request.urlopen(req).read()

        file_save = open(save1, 'wb')  # w : 쓰기, r : 읽기 , a : 더하기, wb : 바이너리로 쓰기
        file_save.write(file_temp)
        file_save.close()
    except:
        print(i)
        print(url_image)
##################################################################################################################