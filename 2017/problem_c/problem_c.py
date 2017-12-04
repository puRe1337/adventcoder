candles = ""
results = []

def roundint(value, base=5):
    return int(value) - int(value) % int(base)

def splitup(cancle):
    value = 0
    splitted = cancle.split(" ")
    for d in splitted:
        value += int(d)
    return int(value)


def main():
    first = True
    while True:
        candles = input("")
        if candles == "end":
            break
        results.append(splitup(candles))
    for r in results:
        print(r)

if __name__ == "__main__":
    main()