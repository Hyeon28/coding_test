from itertools import combinations

def solution(nums):
    answer = 0

    result = [sum(comb) for comb in combinations(nums, 3)]
    print(result)
    
    for sum_value in result:
        is_Prime = True
        for i in range(2, sum_value-1):
            if sum_value % i == 0:
                is_Prime = False
                break
        if is_Prime:
            answer += 1
    return answer