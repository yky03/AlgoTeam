
def solution(NUM_ARR, RESULT):
    import itertools
    answer = []

    for j in range(1, RESULT + 1):

        combis = [*itertools.combinations_with_replacement(NUM_ARR, j)]

        for i in combis:
            result_sum = sum(i)

            if result_sum == RESULT:
                answer.append(i)

    return len(answer)


print(solution([1, 2, 5], 10))
