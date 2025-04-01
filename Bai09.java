import java.util.Scanner;
public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nha so de tinh tong va tich");
        int tong = 0, tich = 1, n ,a;
        n = sc.nextInt();
        while (true) {
            a = n%10;
            n = n/10;
            tong += a;
            tich *= a;
            if (n < 10){
                break;
            }
        }
        System.out.println("tong = "+ tong);
        System.out.println("tich = "+tich);
    }
}
