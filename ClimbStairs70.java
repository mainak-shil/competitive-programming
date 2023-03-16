//70. Climbing Stairs
public class ClimbStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        int a = n;
        int sum = 1;
        while (a != 3) {
            a--;
            sum += a;
        }
        return sum;
    }

}

// 7 = 1+ 6 + 5 + 4+ 3
// 4 = 1+ 3