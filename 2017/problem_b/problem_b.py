days = ["Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"]
inputs = []
eingabe = ""
while True:
    eingabe = input("")
    if eingabe == "end":
        break
    inputs.append(eingabe)
    
for a in inputs:
    asdf = a.split(" ")
    valueinteger = int(asdf[1]) - 1
    print(days[valueinteger % 7])
