import java.util.Arrays;
public class FibonacciUsingMemoization {
    public static void main(String[] args) {

        int n = 100;
        long[] memo = new long[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            memo[i] = -1;
        }

        System.out.println(fib(n, memo));
        // System.out.println(Arrays.toString(memo));

    }

    public static long fib(int n, long[] memo){
        if(memo[n] != -1) return memo[n];
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
}
