import math

class Solution:
    def pivotInteger(self, n: int) -> int:
        # Calculate the total sum of integers from 1 to n
        total_sum = n * (n + 1) // 2
        
        # Find the integer square root of the total sum
        x = math.isqrt(total_sum)
        
        # If x squared equals the total sum, x is our pivot integer
        if x * x == total_sum:
            return x
            
        return -1

