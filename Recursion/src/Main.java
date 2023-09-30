
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
       /* int sum=0;
        for(int i= 10; i>=1;i--) {
            sum += i;
        }
        System.out.println(sum);*/

        int sum = sum(10);

        System.out.println(sum);
    }

    public static int sum(int n) {
        if (n == 2) {
            return 2;
        }
        return n + sum(n - 1);
    }


}