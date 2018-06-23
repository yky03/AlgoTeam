def solution(s, n):
    answer = ''   
    for i in range(0, len(s)):
        x = ord(s[i])
        if x >=97 and x<= 122 :
            answer += chr( (x-97+n)%26 + 97 )
        if x>=65 and x<=90:
            answer += chr( (x-65+n)%26 + 65)
        if x== 32:
            answer += chr(x)
    return answer
