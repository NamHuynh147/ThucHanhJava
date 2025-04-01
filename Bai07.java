import java.util.Scanner;
public class Bai07 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String monhoc[] = {"Ly", "Hoa", "Sinh", "Toan", "May Tinh"};
        int[] diem = new int[5] ;
        float tong = 0;

        System.out.println("nhap diem 5 mon");
        for (int i = 0; i < 5 ; i++){
            while (true) {
            System.out.println("nhap diem mon "+monhoc[i]);
            diem[i] = sc.nextInt();
            tong += diem[i];
            if (diem[i]>=0 && diem[i]<=10){
            break;
            }
            else{
                System.out.println("diem phai thuoc khoang tu 0 den 10");
                }
            }
        }
        int phanTram =(int) (tong/5)*10;
        String hang = null;
        System.out.println(phanTram);
        if (phanTram>90) {
            hang = "hang A";
        }
        else if (phanTram>80){
            hang = "hang B";
        }
        else if (phanTram>70){
            hang = "hang C";
        }
        else if (phanTram>60 && phanTram <=70 ){
            hang = "hang D";
        }
        else if (phanTram>40){
            hang = "hang E";
        }
        else if (phanTram <=40){
            hang = "hang F";
        }
        System.out.println(hang);
    }
}
