   def myAtoi(self, str: str) -> int:
        str = str.strip()
        running_val =0
        if str is None or len(str) == 0:
            return 0
        neg = False
        start = 0
        if str[0] == '+' or str[0] == '-':
            start +=1
        if str[0] == '-':
            neg = True
        for c in str[start:]:
            if c <'0' or c>'9':
                break
            else:
                running_val = 10*running_val + (int)(c)
        if neg:
            return -running_val
        else:
            return running_val
