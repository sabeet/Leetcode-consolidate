# 66. Plus One
# https://leetcode.com/problems/plus-one/
class Solution(object):
    def plusOne(self, digits):
        x = 0
        place = 1
        while len(digits) != 0:
            y = digits[-1] * place
            x += y
            place *= 10
            digits.pop()
        res = [int(i) for i in str(x+1)]
        return res
