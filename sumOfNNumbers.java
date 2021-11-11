package recursion;

public class sumOfNNumbers {
    static  int sum(int n){
        if(n<=1){
            return n;
        }
            return n +sum(n-1);
    }
    public static void main(String[] args) {
        int n=4;
        int res=sum(n);
        System.out.println(res);

    }
}
