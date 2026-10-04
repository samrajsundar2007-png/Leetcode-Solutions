class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        s = {}

        for i, num in enumerate(nums):
            c = target - num

            if c in s:
                return [s[c], i]
            s[num] = i
        