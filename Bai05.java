import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] a = new float[3]  ;
        System.out.println("nhap a, b, c de tim so be nhat");
        a[0] = sc.nextFloat();
        a[1] = sc.nextFloat();
        a[2] = sc.nextFloat();
        float min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.printf("min = %.2f" ,min );
    }
}
