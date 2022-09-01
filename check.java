import java.util.Arrays;

public class check {

     static int[] fill(int[] arr, int k, int n)
     {
        int[] arr2 = new int[n];

        if(!(k>0) || !(n>0))
        {
            return null;
        }

        for(int i = 0; i<k ;i++)
        {
         
            arr2[i] = arr[i];
        }
        int i = 0, j=k;
        while(j != n )
        {
            arr2[j] = arr2[i];
            i = j+1;
            j = j+1;
        }
        return arr2;
     }

     public static void main(String[] args) {

        int[] k = {1,2,3,5,9,12,-2,-1};
        int[] result = fill(k,3,10);
      
        System.out.println(Arrays.toString(result));
        
     }
}
