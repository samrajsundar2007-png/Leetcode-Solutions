class Solution(object):
    def sumOfSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        total_sum = 0

        for i , val in enumerate(nums):
            if n % (i + 1) == 0:
                total_sum += val * val
        return total_sum