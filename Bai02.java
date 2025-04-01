import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai hinh chu nhat");
        a = sc.nextFloat();
        System.out.println("nhap chieu rong ");
        b = sc.nextFloat();
        c = a*b;
        System.out.println("Dien tich hinh chu nhat ="+c);
    }
}
