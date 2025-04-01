import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam can kiem tra");
        int nam = sc.nextInt();
        if ((nam % 4 == 0  && nam % 100 !=  0) ||  (nam % 400 == 0)) {
            System.out.println(nam+ " la nam nhuan");
        }
        else {
            System.out.println(nam +" khong phai la nam nhuan");
        }

    }
}
