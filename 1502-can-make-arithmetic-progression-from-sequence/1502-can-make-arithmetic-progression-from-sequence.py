from typing import List

class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        # Sort the array to arrange elements in sequential order
        arr.sort()
        
        # The expected common difference
        diff = arr[1] - arr[0]
        
        # Verify if the difference between all consecutive elements is the same
        for i in range(2, len(arr)):
            if arr[i] - arr[i - 1] != diff:
                return False
                
        return True