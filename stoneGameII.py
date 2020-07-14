class Solution:
    
    
    def stoneGameII(self, piles: List[int]) -> int:
        dp = {}
        def game_helper(piles, m = 1):
            if not piles:
                return 0
            key = (len(piles), m)
            if key not in dp:
                dp[key] = max([sum(piles) - game_helper(piles[i:],max(i,m)) for i in range(1, 2*m+1)])
            return dp[key]
        return game_helper(piles)
        
