'''
Title: Devito: A personal assistant
Author: Riley Carpenter
TODO: Location Services, Opening apps, More Dynamic Responses
'''

import os
import sys
import re
import time
import socket


def clearScreen():
   os.system("clear")

def getTime():
    Currenttime = time.ctime()
    Hours1 = int(Currenttime[11:13])
    Minutes1 = int(Currenttime[14:16])
    return str(Hours1) + ":" + str(Minutes1)


def stripString(string):
    string = re.sub(r'[^\w\s]','',string)

    return string


def response(question):
    question = stripString(question)
    response = ""
    if question.upper() == "HOW ARE YOU":
        response = ("I'm an A.I. written in python. I really only have one emotion")
        #clearScreen()
    elif question.upper() == "WHAT IS THE TIME" or question.upper() == "TIME" or question.upper() == "WHAT TIME IS IT":
        response = ("The current time is " + getTime())
        #clearScreen()
    elif question.upper() == "WHO ARE YOU" or question.upper() == "WHAT IS YOUR NAME":
        response = "I'm Devito! Your personal assistant!"
        #clearScreen()



    return response


#Main method
question = input("Hello what can I help you with today? ")
print(response(question))
while question.upper() != "BYE" or "GOODBYE" or "BYE DEVITO":
    question = input("Hello what can I help you with today? ")
    print(response(question))

print("Goodbye!")
