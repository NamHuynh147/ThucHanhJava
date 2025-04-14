import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
    public static ArrayList<Integer> ArrayList = new ArrayList<Integer>();
    public static Scanner sc = new Scanner(System.in);
    public static void nhapMang() {
        
        System.out.println("nhap so pt trong mang");
        
        int n = sc.nextInt();
        for (int i = 0; i < n ;i++ ){
            System.out.println("nhap pt thu "+(i+1));
            int input = sc.nextInt();
            ArrayList.add(input);
        }
    }
    public static void xuatMang(){
        System.out.println("----------");
        for (int i : ArrayList) {
            System.out.println(i);
        }
    }
    public static void viTriCuaPT(){
        System.out.println("gia tri cua phan tu can tim la: ");
        int i = sc.nextInt();

        System.out.println("phan tu do nam o vi tri: "+ArrayList.indexOf(i));
    }

    public static void main(String[] args) {
        nhapMang();
        xuatMang();
        viTriCuaPT();
        System.out.println("max cua mang ="+Collections.max(ArrayList));
        System.out.println("min cua mang ="+Collections.min(ArrayList));
        System.out.println("vi tri cua pt lon nhat: "+ArrayList.indexOf(Collections.max(ArrayList)));
        ArrayList.sort(null);
        System.out.println("mang sau khi sap xep tang dan ");
        System.out.println(ArrayList);
    }
}