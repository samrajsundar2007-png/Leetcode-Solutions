import math
from typing import List

class Solution:
    def maxLength(self, nums: List[int]) -> int:
        n = len(nums)
        max_len = 2
        
        for i in range(n):
            p = nums[i]
            g = nums[i]
            l = nums[i]
            for j in range(i + 1, n):
                p *= nums[j]
                g = math.gcd(g, nums[j])
                l = math.lcm(l, nums[j])
                if p == g * l:
                    max_len = max(max_len, j - i + 1)
                    
        return max_len
        