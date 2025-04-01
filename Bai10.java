import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        int count =1 ;
        while (true) {
           
            n = n/10;
            count ++;
            if (n < 10){
                break;
            }
        }
        System.out.println("tong so chu so trong n la "+count);
    }
}
