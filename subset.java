import java.util.Scanner;

public class subset {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = 0, n = 0;
        System.out.println("Enter value for m ");
        m = input.nextInt();

        System.out.println("Enter value for n ");
        n = input.nextInt();

        int result = isEvenSubset(m, n);

        System.out.println(result);

    }

    public static int isEvenSubset(int m, int n) {

        for (int i = 1; i <= m; i++) {
            // i % m checks if the value of i is divisable by i that means its a factor
            // i%2 chacks if the factor is even
            if (m % i == 0 && i % 2 == 0) {
                // checks if i is a factor/subset or n

                if (n % i == 0) {

                    return 1;
                }

            }

            else {

                return 0;
            }
        }

        return 1;

    }
}