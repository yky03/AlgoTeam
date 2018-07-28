
def solution(NUM_ARR, RESULT):
    import itertools
    answer = []
    combis = itertools.combinations_with_replacement(NUM_ARR, RESULT)
    for i in combis:
        result_sum = sum(i)
        if result_sum == RESULT:
            answer.append(result_sum)
    print(answer)
    return answer


print(solution([1, 2, 5], 10))
