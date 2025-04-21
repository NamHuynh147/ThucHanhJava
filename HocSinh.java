import java.util.Scanner;


    public class HocSinh {
        private int maSo;
        private String hoTen;
        private float diemTB;
        public int getMaSo(){
            return maSo;
        }
        public void setMaSo(int maSo){
            this.maSo = maSo;
        }
        public String getHoTen(){
            return hoTen;
        }
        public void setHoTen(String hoTen){
            this.hoTen = hoTen;
        }
        public float getDiemTB(){
            return diemTB;
        }
        public void setDiemTB(float diemTB){
            this.diemTB = diemTB;
        }
        public HocSinh(){
            maSo = 1 ;
            hoTen = "Huynh Quoc Huy";
            diemTB = 7.5f;
        }
        public HocSinh(int maSo , String hoTen , float diemTB){
            this.maSo = maSo;
            this.hoTen = hoTen;
            this.diemTB = diemTB;
        }
        public HocSinh (HocSinh tmp){
            this.maSo = tmp.maSo;
            this.hoTen = tmp.hoTen;
            this.diemTB = tmp.diemTB;
        }
        public void input (){
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap ma so ");
            maSo = sc.nextInt();
            System.out.println("nhap Ho Ten ");
            sc.nextLine();
            hoTen = sc.nextLine();
            System.out.println("nhap diem TB ");
            diemTB = sc.nextFloat();
        }
        public void output(){
            System.out.println(maSo+ "-" + hoTen + "- "+diemTB);
        }
        public void rank (){
            if (diemTB < 5){
                System.out.println("xep loai yeu");
            }
            else  if (diemTB >= 5 && diemTB < 6.5){  
                    System.out.println("xep loai TB ");
            }
            else  if (diemTB >= 6.5 && diemTB < 8){  
                System.out.println("xep loai kha ");
            }
            else  if (diemTB >= 8 && diemTB < 10){  
                System.out.println("xep loai gioi ");
            }
        }
    }
   