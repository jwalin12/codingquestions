    def reverseWords(self, s: str) -> str:
        s = s.strip()
        words = s.split(' ')
        words.reverse()
        
        final = ""
        for i in words:
            i = i.strip()
            if i != "":
                final += i + " "
        print(words)
        return final[:len(final) - 1]
