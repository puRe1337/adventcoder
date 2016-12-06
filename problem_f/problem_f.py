"""
Testparameter: 3,3,5,3,2
Testergebnis: 92.71
"""
import math

params_string = input("Parameter: ")
params = params_string.split(",")   

diameter = float(params[0])
height = float(params[1])
x = float(params[2])
y = float(params[3])
z = float(params[4])

fieldsToFill = (x - 1) * (y - 1)
marshmallow_volume = diameter * diameter * z * height
negative = math.pi * (diameter / 2) **2 * z * height
positive = (marshmallow_volume - negative ) * fieldsToFill

print(round(positive, 2))
