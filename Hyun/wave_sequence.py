def solution(N):
    arr = [1, 1, 1]
    for i in range(N - 3):
        arr.append(arr[0 + i] + arr[1 + i])
    print(arr)
    return arr[-1]


print(solution(6))
print(solution(12))
