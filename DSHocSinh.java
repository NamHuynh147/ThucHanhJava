import java.util.Scanner;
public class DSHocSinh{
    private HocSinh ds[];
    private int soLuong;
    public void nhapDS(){
        System.out.println("nhap so luong hoc sinh");
        Scanner sc = new Scanner(System.in);
        soLuong = sc.nextInt();
        ds = new HocSinh[soLuong];
        for (int i= 0; i<soLuong;i++){
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }
    public void xuatDS(){
        System.out.println("Danh sach hoc sinh la");
        for (int i= 0; i<soLuong;i++){
            ds[i].output();
        } 
    }
    public void sapXep(){
        for (int i = 0; i < soLuong-1; i++){
            for (int j = i+1; j < soLuong ; j++){
                if(ds[i].getDiemTB()<ds[j].getDiemTB()){
                    HocSinh temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}

