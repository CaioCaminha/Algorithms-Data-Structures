class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l_mult = 1
        r_mult = 1
        n = len(nums)
        l_arr = [0] * n # this will create an array of n 0s
        r_arr = [0] * n # this will create an array of n 0s

        for i in range(n):
            j = -i -1 # when you pass a negative index to an array in python it will give you the item starting from the ending
            l_arr = l_mult
            r_arr = r_mult
            l_mult *= nums[i]
            r_mult *= nums[j]

        return [l*r for l, r in zip(l_arr, r_arr)] ##iterate both arrays at the same time and multiply one by the other