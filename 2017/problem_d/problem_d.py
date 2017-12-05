snow_incr = {   "heavy snowing" : 10,
                "snowing" : 5,
                "light rain" : -3,
                "heavy rain" : -8,
                "cloudy" : 0,
                "sunshine" : -1}

curr_line = ""
snow_height = 0
while True:
    curr_line = input("")
    if curr_line == "end":
        break
    snow_height += snow_incr[curr_line]
    if snow_height < 0:
        snow_height = 0
    print(snow_height)