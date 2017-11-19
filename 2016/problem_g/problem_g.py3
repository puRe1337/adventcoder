"""
Problem G - Code by Simon
"""

EnteredString = "Not Empty"
while (EnteredString != ""):
	EnteredString = input()
	words = EnteredString.split(" ")
	SentenceEnd=0
	i=0
	CorrectedString = ""
	while (i<len(words)):
		checkQ = words[i].split("?")
		checkE = words[i].split("!")
		checkP = words[i].split(".")
		if (len(checkQ) > 1 and checkQ[1] != ""):
			words[i]=checkQ[1]
			words.insert(i,checkQ[0]+"?")
		if (len(checkE) > 1 and checkE[1] != ""):
			words[i]=checkE[1]
			words.insert(i,checkE[0]+"!")
		if (len(checkP) > 1 and checkP[1] != ""):
			words[i]=checkP[1]
			words.insert(i,checkP[0]+".")
		if (words[i]==""):
			i=i+1
			continue
		wordLen = len(words[i])-1
		#if (words[i][0].isupper() and words[i][1].islower()):
		#	words[i] = words[i].capitalize()
		if(words[i].isupper()):
			words[i] = words[i].upper()
		else:
			words[i] = words[i].lower()
		if(SentenceEnd == 1):
			SentenceEnd = 0
			if(words[i].isupper()):
				words[i] = words[i].upper()
			else:
				words[i] = words[i].capitalize()
		if(words[i][wordLen] == "." or words[i][wordLen] == "!" or words[i][wordLen] == "?"):
			SentenceEnd = 1
		if(i==len(words)-1):
			CorrectedString = CorrectedString+words[i]
		else:
			CorrectedString = CorrectedString+words[i]+" "
		i=i+1
	print(CorrectedString)
