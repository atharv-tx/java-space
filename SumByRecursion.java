public class SumByRecursion {

    public static int sumByRec(int n){
        if(n ==1){
            return 1;
        }
        int snm1 = sumByRec(n-1);
        int Sn = n + snm1;
        return Sn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumByRec(n));

    }
    
}
