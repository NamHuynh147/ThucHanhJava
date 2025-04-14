import java.util.Scanner;

public class bai3 {
    public class sinhVien {
        private int maSV;
        private String hoTen;
        private float diemLT, diemTH;

        public sinhVien(){
        this.maSV = 110;
        this.hoTen = "Huynh T Luc";
        this.diemLT = 6.5f;
        this.diemTH = 5.25f;
        }
        public sinhVien(int maSV , String hoTen, float diemLT, float diemTH){
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.diemLT = diemLT;
            this.diemTH = diemTH;
        }
        public int getMaSV(){
            return maSV;
        }
        public void setMaSV(int maSV){
            this.maSV = maSV;
        }
        public String getHoTen(){
            return hoTen;
        }
        public void setHoTen(String HoTen){
            this.hoTen = HoTen;
        }
        public float getDiemLT(){
            return diemLT;
        }
        public void setDiemLT(float diemLT){
            this.diemLT = diemLT;
        }
        
        public float getDiemTH(){
            return diemTH;
        }
        public void setDiemTH(float diemTH){
            this.diemTH = diemTH;
        }
        public float diemTB(){
            return ((diemLT+diemTH)/2);
        }
        @Override
        public String toString() {
            
            return "[maSV ="+this.maSV+", hoTen ="+this.hoTen 
            +"\ndiemLT ="+this.diemLT+"diemTH ="+this.diemTH+" diem tb"+diemTB()+"]";
        }
    }
    public static void main(String[] args) {
        bai3 outer =new bai3();
        sinhVien sv1 = outer.new sinhVien();
        sinhVien sv2 = outer.new sinhVien(69, "Huynh Quoc Huy", 7.75f , 9.5f );
        sinhVien sv3 = outer.new sinhVien();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mssv cua sv 3");
        int mssv3 = sc.nextInt();
        sc.nextLine();
        sv3.setMaSV(mssv3);
        System.out.println("nhap ten cua sv 3");
        String tensv3 = sc.nextLine();
        sv3.setHoTen(tensv3);
        System.out.println("nhap diem LT cua sv 3");
        float diemLTSv3 = sc.nextFloat();
        sv3.setDiemLT(diemLTSv3);
        System.out.println("nhap diem TH cua sv 3");
        float diemTHSv3 = sc.nextFloat();
        sv3.setDiemTH(diemTHSv3);

        System.out.println("masv "+sv1.getMaSV()+ "ten la "+sv1.getHoTen());
        System.out.format("%5s%20s%16s%16s%16s%n", "maSV", "hoTen", "diemLT", "diemTH", "diemTB");
        System.out.format("%5d%20s%16.2f%16.2f%16.2f%n", sv1.getMaSV(), sv1.getHoTen(), sv1.getDiemLT(), sv1.getDiemTH(), sv1.diemTB());
        System.out.format("%5d%20s%16.2f%16.2f%16.2f%n", sv2.getMaSV(), sv2.getHoTen(), sv2.getDiemLT(), sv2.getDiemTH(), sv2.diemTB());
        System.out.format("%5d%20s%16.2f%16.2f%16.2f%n", sv3.getMaSV(), sv3.getHoTen(), sv3.getDiemLT(), sv3.getDiemTH(), sv3.diemTB());
    }
}
