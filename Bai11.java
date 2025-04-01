import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int u = 0 , a = 0;
        while (true) {
            u *=10;
            a = n % 10;
            u += a ;
            n = n/10;
            if (n < 1){
                break;
            }
        }
        System.out.println("so dao nguoc cua n la "+u);
    }
}
