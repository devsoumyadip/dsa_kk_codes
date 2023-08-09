package duck_creek_tech.hackerrank_problems;

public class Tower_Breaker {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        // If height of all towers is 1, Player 2 wins as no moves can be made
        if (m == 1) {
            return 2;
        }

        // If number of towers is even, Player 2 can always mirror Player 1 and win
        if (n % 2 == 0) {
            return 2;
        }

        // If number of towers is odd and height > 1, Player 1 wins
        return 1;

    }

    public static void main(String[] args) {

        System.out.println(towerBreakers(2,1));
    }
}
