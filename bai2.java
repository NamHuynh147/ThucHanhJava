import java.util.Scanner;

public class bai2 {
    private static final Scanner scanner = new Scanner(System.in);
    // Dinh nghia giao dien Hinh voi mot so phuong thuc co ban
    interface Hinh {
        float pi = 3.14f;
        // Phuong thuc nhap
        void nhap();
            
        
        void xuat();
        // Phuong thuc tinh dien tich
        float dienTich();
        }
        //Dinh nghia lop HinhVuong trien khai Hinh
        class HinhVuong implements Hinh {
        private float canh;
        // Hoan thien constructor khong tham so cho HinhVuong
        // Goi constructor mac dinh va gan canh = 0
        public HinhVuong() {
            canh = 0;
        }
        // Hoan thien constructor co tham so (canh)
        // Gan gia tri cho canh
        public HinhVuong(float canh) {
            this.canh = canh;
        }
        // Hoan thien phuong thuc nhap() cho HinhVuong
        // Nhap canh cua hinh vuong (su dung Scanner)
        @Override
        public void nhap() {
            System.out.println("nhap canh cua hinh vuong ");
            canh = scanner.nextFloat();
        }
        // Hoan thien phuong thuc xuat() cho HinhVuong
        // In thong tin canh va dien tich
        @Override
        
        public void xuat() {
            System.out.println("canh cua hinh vuong = "+canh);
        }
        // Hoan thien phuong thuc tinh dien tich cho HinhVuong
        // Dien tich = canh * canh
        @Override
        public float dienTich() {
        // Tự vie t code va o đa y
        return (canh*canh); // Chi la gia tri mac dinh, can thay bang cong thuc
        }
    }
        // Dinh nghia lop HinhChuNhat trien khai Hinh
    class HinhChuNhat implements Hinh {
        private float dai;
        private float rong;
        // Hoan thien constructor khong tham so cho HinhChuNhat
        // Gan dai va rong bang 0
        public HinhChuNhat() {
            dai = 0;
            rong = 0;
        }
        // Hoan thien constructor co tham so (dai, rong)
        // Gan gia tri cho dai va rong
        public HinhChuNhat(float dai, float rong) {
            this.dai = dai;
            this.rong = rong;
        }
        // Hoan thien phuong thuc nhap() cho HinhChuNhat
        
        // Nhap chieu dai va chieu rong (su dung Scanner)
        @Override
        public void nhap() {
            System.out.println("nhap chieu dai ");
            dai = scanner.nextFloat();
            System.out.println("nhap chieu rong");
            rong = scanner.nextFloat();

        }
        // Hoan thien phuong thuc xuat() cho HinhChuNhat
        // In thong tin chieu dai, chieu rong va dien tich
        @Override
        public void xuat() {
            System.out.println("chieu dai = "+dai+"     chieu rong = "+ rong);
        }
        // Hoan thien phuong thuc tinh dien tich cho HinhChuNhat
        // Dien tich = dai * rong
        @Override
        public float dienTich() {
        // Tự vie t code va o đa y
        return dai*rong; // Chi la gia tri mac dinh, can thay bang cong thuc
        }
    }
        // Dinh nghia lop HinhTron trien khai Hinh
    class HinhTron implements Hinh {
        private float banKinh;
        // Hoan thien constructor khong tham so cho HinhTron
        // Gan ban kinh bang 0
        public HinhTron() {
            banKinh = 0f;
        
        }
        // Hoan thien constructor co tham so (banKinh)
        // Gan gia tri cho ban kinh
        public HinhTron(float banKinh) {
            this.banKinh = banKinh;
        }
        // Hoan thien phuong thuc nhap() cho HinhTron
        // Nhap ban kinh cua hinh tron (su dung Scanner)
        @Override
        public void nhap() {
            System.out.println("nhap ban kinh cho hinh tron ");
            banKinh = scanner.nextFloat();
        }
        // Hoan thien phuong thuc xuat() cho HinhTron
        // In thong tin ban kinh va dien tich
        @Override
        public void xuat() {
            System.out.println("ban kinh = "+banKinh+"  dien tich = "+this.dienTich());
        }
        // Hoan thien phuong thuc tinh dien tich cho HinhTron
        // Dien tich = pi * ban kinh * ban kinh
        @Override
        public float dienTich() {
        // Tự vie t code va o đa y
        return banKinh*banKinh*pi; // Chi la gia tri mac dinh, can thay bang cong thuc
        }
    }

    public static void main(String[] args) {
            bai2 outer = new bai2();
            Scanner scanner = new Scanner(System.in);
            // Nhap so luong hinh: Nhap n
            System.out.print("Nhap so luong hinh: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Xoa bo dem sau khi nhap so
            // Khai bao mang
            Hinh ds[] = new Hinh[n];
            // Nhap danh sach hinh
            for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            int chon = 0;
            // Hoan thien code phan nhap lua chon cua nguoi dung
            chon = scanner.nextInt();

            switch (chon) {
            case 1:
            ds[i] = outer.new HinhVuong();
            ds[i].nhap();
            break;
            case 2:
        
            ds[i] = outer.new HinhChuNhat();
            ds[i].nhap();
            break;
            case 3:
            ds[i] = outer.new HinhTron();
            ds[i].nhap();
            break;
            default:
            System.out.println("Ban phai chon 1 trong 3 loai tren");
            }
            }
            // Xuat danh sach hinh
            for (Hinh hinh :ds){
                hinh.xuat();  
            }
            // Tim hinh co dien tich lon nhat
            Hinh hinhDienTichLonNhat = ds[0];
            for (Hinh hinh : ds) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }
            // Xuat thong tin hinh co dien tich lon nhat
            System.out.println("\nHinh co dien tich lon nhat:");
            hinhDienTichLonNhat.xuat();
            
    }
}
