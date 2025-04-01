import java.util.Scanner;
public class Bai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so bat ki");
        int soDau, soCuoi, n ;
        n = sc.nextInt();
        soCuoi = n % 10 ;
        System.out.println("chu so dau tien la "+soCuoi);

        while (true) {
            n = n/10;
            if (n < 10){
                break;
            }
        }
        soDau = n %10;
        System.out.println("chu so dau tien la "+soDau);
    }
}
