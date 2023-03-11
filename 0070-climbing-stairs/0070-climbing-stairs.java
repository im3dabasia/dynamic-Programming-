// class Solution {
//     public int climbStairs(int n) {
//         int[] dp = new int[n+2];
//         dp[0] = 0;
//         dp[1] = 1;
        
//         for(int i = 2; i <= (n+1); i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         // System.out.println(Arrays.toString(dp));
//         return dp[n + 1];
//     }
// }

// Memoizatiton 
class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n + 2];
        Arrays.fill(dp ,-1);
        // System.out.println(Arrays.toString(dp));
        
        
        int a = helper(n + 1, dp);
        // System.out.println(Arrays.toString(dp));
        // System.out.println(a);
        return a;
        
    }
    private int helper(int n, int[] dp){
        
        if(n <=1)return n;
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        
        return dp[n] = helper(n-1, dp) + helper(n-2 , dp);
        // System.out.println(Arrays.toString(dp));
        
    }
}