public class hallow {
    static int isHollow(int[] a){
        if(a.length < 9) {
            return 0;
        }
        for(int i = 0, j = a.length - 1; i <= j; i++, j--){
            if(a[i] == 0 && a[j] != 0 || a[i] != 0 && a[j] == 0){
                return 0;
            }
            if(a[i] == 0 && a[j] == 0 && (a.length - (i + j)) > 1){
                return 0;
            }else{
                if(i == j && a[i] != 0) return 0;
            }
     
        }
        return 1;
     }

     public static void main(String[] args) {
        int[] k = {1,2,4,0,0,0,3,4,5};

        int result = isHollow(k);
        if(result == 1)
        {

            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

     }
}
