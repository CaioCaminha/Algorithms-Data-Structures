

class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        candidate = None
        count = 0

        for num in nums:
            if count == 0:
                candidate = num

            #Ternary in Python is ridiculous
            count += 1 if candidate == num else -1

        return candidate