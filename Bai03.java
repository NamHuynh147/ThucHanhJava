import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        System.out.println("nhap do F");
        Scanner sc = new Scanner(System.in);
        Float F = sc.nextFloat();
        Float C = (float) ((F-32)/1.8);
        System.out.printf("%.2f do F ="+"%.2f do C",F, C);
    }
}
