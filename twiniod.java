import java.util.Scanner;

public class twiniod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a[] = new int[6];
        System.out.println("Enter 6(six) array values: ");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter value : "+i);
             a[i] = input.nextInt();

        }

        int result = isTwiniod(a);
        System.out.println(result);
    }

    public static int isTwiniod(int[] a) {
        int count = 0;

        int prev;
        for (int i = 0; i <= 5; i++) {
            
            // holds the previos value
            prev = a[i];
            // checks if there are more than two even numbers
            if (a[i] % 2 == 0) {

                count = count + 1;

            }
        //   check if there are two even numbers following each other

        if(a[i] %2 ==0 && prev %2 ==0)
        {
            // if the the current and previos are even then array is a twiniod
           int follow = 0;
           follow = follow++;
           if(follow ==1 && count<2)
           {

            return 1;

           }
           else{
            return 0;
           }

        }

        }
        return 0;
    }

}