import requests
import time
from selenium import webdriver
# -*- coding: UTF-8 -*-
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys

import pandas as pd
import numpy as np


# %%

from keras.models import Sequential
from keras.layers import Conv2D
from keras.layers import MaxPooling2D
from keras.layers import Flatten
from keras.layers import Dense

# %%

from PIL import Image
import os, glob, sys, numpy as np
from sklearn.model_selection import train_test_split
from keras.utils import np_utils

path = "image_menupan"

image_w = 64
image_h = 64

pixel = image_w * image_h * 3

X = []
y = []

files = glob.glob(path + "/*.png")

idx = "Menu"

for i, f in enumerate(files):
    try:
        img = Image.open(f)
        img = img.convert("RGB")
        img = img.resize((image_w, image_h))
        data = np.asarray(img)
        # Y는 0 아니면 1이니까 idx값으로 넣는다.
        X.append(data)
        y.append(idx)
    except:
        print(cat, str(i) + " 번째에서 에러 ")
X = np.array(X)
Y = np.array(y)

X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.1)

xy = (X_train, X_test, Y_train, Y_test)
np.save("menuData.npy", xy)

# %%

## 먼저 기존의 np.load를 np_load_old에 저장해둠.
np_load_old = np.load

## 기존의 parameter을 바꿔줌
np.load = lambda *a, **k: np_load_old(*a, allow_pickle=True, **k)

# %%

from keras.models import Sequential
from keras.layers import Conv2D, MaxPooling2D, Dense, Flatten, Dropout
from keras.callbacks import EarlyStopping, ModelCheckpoint
import matplotlib.pyplot as plt

# %%

X_train, X_test, y_train, y_test = np.load('menuData.npy')

# %%

import keras as keras
import keras.backend.tensorflow_backend as K

# %%

image_w = 64
image_h = 64
X_train = X_train.astype('float32') / 255
X_test = X_test.astype('float32') / 255

with K.tf_ops.device('/device:GPU:0'):
    model = Sequential()
    model.add(Conv2D(32, (3, 3), padding="same", input_shape=X_train.shape[1:], activation="relu"))
    model.add(MaxPooling2D(pool_size=(2, 2)))
    model.add(Conv2D(32, (3, 3), padding="same", activation="relu"))
    model.add(MaxPooling2D(pool_size=(2, 2)))

    model.add(Conv2D(64, (3, 3), padding="same", activation="relu"))
    model.add(MaxPooling2D(pool_size=(2, 2)))
    model.add(Dropout(0.25))

    model.add(Conv2D(64, (3, 3), padding="same", activation="relu"))
    model.add(MaxPooling2D(pool_size=(2, 2)))
    model.add(Dropout(0.25))

    model.add(Flatten())
    model.add(Dense(256, activation="relu"))
    model.add(Dropout(0.5))
    model.add(Dense(1, activation="sigmoid"))

    model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

#     model_dir = './model'
#     if not os.path.exists(model_dir):
#         os.mkdir(model_dir)
#     model_path = model_dir + "/dog_cat_classify.model"

#     checkpoint = ModelCheckpoint(filepath=model_path, monitor='val_loss', verbose=1, save_best_only=True)
#     early_stopping = EarlyStopping(monitor='val_loss', patience=7)

# %%

import tensorflow.compat.v1 as tensorflow

# %%

# 레이어 1
model = Sequential()
model.add(Conv2D(32, (3, 3), activation="relu", input_shape=(image_h, image_w, 3)))
model.add(BatchNormalization())
model.add(MaxPooling2D(pool_size=(2, 2)))
model.add(Dropout(0.25))

# 레이어 2
model.add(Conv2D(64, (3, 3), activation="relu"))
model.add(BatchNormalization())
model.add(MaxPooling2D(pool_size=(2, 2)))
model.add(Dropout(0.25))

# 레이어3
model.add(Conv2D(128, (3, 3), activation="relu"))
model.add(BatchNormalization())
model.add(MaxPooling2D(pool_size=(2, 2)))
model.add(Dropout(0.25))

# Fully Connected
model.add(Flatten())
model.add(Dense(512, activation='relu'))
model.add(BatchNormalization())
model.add(Dropout(0.5))

model.add(Dense(2, activation="softmax"))

# %%

import PIL.Image as Image


def resize_img(img, size):
    return img.resize(size)


def load_img(file_path):
    data = []
    print(p + file_path[1:] + '/')
    for f in os.listdir(file_path):
        data.append(resize_img(Image.open(p + file_path[1:] + '/' + f), (64, 64)))
    return data


train_cats = load_img('/image_menupan/*.png')  # img_data_list / element is image not nparray

print(len(train_cats))

# %%

# Initialising the CNN
classifier = Sequential()

# Step 1 - Convolution
classifier.add(Conv2D(32, (3, 3), input_shape=(64, 64, 3), activation='relu'))

# Step 2 - Pooling
classifier.add(MaxPooling2D(pool_size=(2, 2)))

# Adding a second convolutional layer
classifier.add(Conv2D(32, (3, 3), activation='relu'))
classifier.add(MaxPooling2D(pool_size=(2, 2)))

# Step 3 - Flattening
classifier.add(Flatten())

# Step 4 - Full connection
classifier.add(Dense(units=128, activation='relu'))
classifier.add(Dense(units=1, activation='sigmoid'))

# Compiling the CNN
classifier.compile(optimizer='rmsprop', loss='binary_crossentropy', metrics=['accuracy'])
