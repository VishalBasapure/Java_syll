words = [
    "hello",
    "vishal",
    "good",
    "morning",
    "how",
    "are",
    "you",
    "python",
    "java",
    "coding",
    "programming",
    "developer",
    "student",
    "computer",
    "software",
    "engineer",
    "learning",
    "practice",
    "success",
    "career"
]
words.sort()
sor={}
for word in range(len(words)):
    if(len(words[word])>5):
        sor[words[word]]=len(words[word])

print(sor)
        
