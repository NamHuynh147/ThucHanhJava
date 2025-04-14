import java.util.Scanner;
public class bai2 {
    public static class HinhChuNhat{
        private double chieuDai,
        chieuRong;
       

        public double getchieuDai(){
            return chieuDai;
        }
        public void setchieuDai(double chieuDai){
            this.chieuDai = chieuDai;
        }
        public double getchieuRong(){
            return chieuRong;
        }
        public void setchieuRong(double chieuRong){
            this.chieuRong = chieuRong;
        }
        public double dienTich(){
            return chieuDai*chieuRong;
        }
        public double chuVi(){
            return (chieuDai+chieuRong)*2;
        }
        @Override
        public String toString() {
            
            return "[chieu dai ="+this.chieuDai+", chieu rong ="+this.chieuRong 
            +"\ndien tich ="+this.dienTich()+"chu vi ="+this.chuVi()+"]";
        }
    }
        public static void main(String[] args) {
            bai2 outer = new bai2();
            HinhChuNhat hcn = new HinhChuNhat();

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chieu dai: ");
            double a = sc.nextDouble();
            hcn.setchieuDai(a);
            System.out.print("Nhap chieu rong: ");
            double b = sc.nextDouble();
            hcn.setchieuRong(b);

            System.out.println("chieu dai ="+hcn.getchieuDai());
            System.out.println("chieu rong ="+hcn.getchieuRong());
            System.out.println("toString ="+hcn.toString());
        
    }
}
