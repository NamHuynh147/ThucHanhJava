import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int u = 0 , a = 0 , N =n;
        while (true) {
            u *=10;
            a = n % 10;
            u += a ;
            n = n/10;
            if (n < 1){
                break;
            }
        }
        if (u == N) {
            System.out.println("n la so doi xung");
            
        }
        else {
            System.out.println("n k la so doi xung");
        }
    }
}