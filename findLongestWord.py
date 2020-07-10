    def findLongestWord(self, s: str, d: List[str]) -> str:
        d = sorted(d, key= lambda x: (-len(x), x))
        for word in d:
            max_ind = 0
            for i in range(len(word)):
                let = word[i] 
                if s.find(let, max_ind) != -1: 
                    max_ind = s.find(let,max_ind) + 1
                    if i == len(word)-1:
                        return word
                else:
                    break
        return ""
            
