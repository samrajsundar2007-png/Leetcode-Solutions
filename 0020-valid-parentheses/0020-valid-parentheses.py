class Solution:
    def isValid(self, s: str) -> bool:
        matching = {')':'(','}':'{',']':'['}
        stack = []

        for char in s:
            if char in matching:
                top_ele = stack.pop() if stack else '#'

                if matching[char] != top_ele:
                    return False
            else:
                stack.append(char)
        return not stack
        
        