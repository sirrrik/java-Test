import java.util.Arrays;


public class sumpower {

    static boolean sumIsPower(int[] arr)
    {
       

        int sum =0;
        for(int i=0;i< arr.length;i++)
        {
             sum = sum + arr[i];

        }
        while(sum != 1)
        {
            if (sum % 2  != 0)
                {
                    sum = sum / 2;
                    return false;
                }
              
        }
        return true;
    }
    public static void main(String[] args) {
        int[] k = {8,8,8,8};

        boolean result = sumIsPower(k);
        System.out.println(result);
    }
}
