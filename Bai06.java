import java.util.Scanner;

public class Bai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] a = new float[3]  ;
        System.out.println("nhap 3 canh a, b, c");
        a[0] = sc.nextFloat();
        a[1] = sc.nextFloat();
        a[2] = sc.nextFloat();
        float max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        float tong =0 ;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max ){
                tong += a[i];
            }
        }
        if (tong > max){
            System.out.println("3 canh tao thanh 1 tam giac");
        }
        else{
            System.out.println("3 canh khong tao thanh 1 tam giac");
        }
    }
}
