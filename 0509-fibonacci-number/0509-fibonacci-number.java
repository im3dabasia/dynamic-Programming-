class Solution {
    int[] dp;
    public int fib(int n) {
        
        if(n <= 1)return n;
        dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        helper(n);
        
        // System.out.println(Arrays.toString(dp));
        
        return dp[dp.length - 1];
    }
    
    private void helper(int n){
        for(int i =2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}

//Tabulation method 
// T = 0(N)
// s = 0(N) can be reduced if we save prev = dp[i - 1] and prev2 = dp[i-2] in some variable instead og array