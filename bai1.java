import java.util.Scanner;

import java.util.ArrayList;
class bai1{
    private static final Scanner scanner = new Scanner(System.in);
    abstract class NhanVien {
        protected String maNhanVien;
        protected String tenNhanVien;
        protected String trinhDo;
        protected double luongCoBan;

        

        // Constructor khong tham so
        public NhanVien() {
        this.maNhanVien = "";
        this.tenNhanVien = "";
        this.trinhDo = "";
        this.luongCoBan = 0.0;
        }
        // Constructor co tham so
        public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = 0.0;
        }
        // Getter cho maNhanVien
        public String getMaNhanVien() {
        return maNhanVien;
        }
        
        // Getter cho tenNhanVien
        public String getTenNhanVien() {
        return tenNhanVien;
        }
        // Getter cho trinhDo
        public String getTrinhDo() {
        return trinhDo;
        }
        // Getter cho luongCoBan
        public double getLuongCoBan() {
        return luongCoBan;
        }
        // Setter cho luongCoBan
        public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
        }
        // Phuong thuc nhap thong tin co ban
        public void nhap() {
            
            System.out.print("Nhap ma nhan vien: ");
            this.maNhanVien = scanner.nextLine();
            System.out.print("Nhap ten nhan vien: ");
            this.tenNhanVien = scanner.nextLine();
            System.out.print("Nhap trinh do: ");
            this.trinhDo = scanner.nextLine();
            System.out.print("Nhap luong co ban: ");
            this.luongCoBan = scanner.nextDouble();
        }
        // Phuong thuc xuat thong tin co ban
        public void xuat() {
        System.out.println("Ma nhan vien: " + maNhanVien + ", Ten nhan vien: " +
        tenNhanVien +
        ", Trinh do: " + trinhDo + ", Luong co ban: " + luongCoBan);
        }
        // Phuong thuc tru tuong tinh luong
        public abstract double tinhLuong();
    }
        //Dinh nghia lop QuanLy thua ke tu NhanVien
    class QuanLy extends NhanVien {
        private String chuyenMon;
        private double phuCapChucVu;
        // Hoan thien constructor khong tham so cho QuanLy
        // Goi constructor khong tham so cua lop cha
        public QuanLy() {
            this.chuyenMon = "";
            this.phuCapChucVu = 0.0;
        }
        // Hoan thien constructor co tham so (maNhanVien, tenNhanVien, trinhDo,chuyenMon, phuCapChucVu)
        
        // Goi constructor cua lop cha voi maNhanVien, tenNhanVien, trinhDo, ganchuyenMon, phuCapChucVu
        
        public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, String
        chuyenMon, double phuCapChucVu) {
                super(maNhanVien, tenNhanVien , trinhDo);
                this.chuyenMon = chuyenMon;
                this.phuCapChucVu = phuCapChucVu;
        }
        // Hoan thien getter cho chuyenMon
        public String getChuyenMon() {
            return chuyenMon;
        
        }
        // Hoan thien getter cho phuCapChucVu
        public double getPhuCapChucVu() {
            return phuCapChucVu;
        }
        // Hoan thien phuong thuc nhap() cho QuanLy
        // Goi nhap() cua lop cha va nhap them chuyenMon, phuCapChucVu
        @Override
        public void nhap() {
            super.nhap();
            System.out.println("Nhap chuyen mon: ");
            this.chuyenMon = scanner.nextLine();
            System.out.print("Nhap phu cap chuc vu: ");
            this.phuCapChucVu = scanner.nextDouble();
        }
        // Hoan thien phuong thuc xuat() cho QuanLy
        // Goi xuat() cua lop cha va in them chuyenMon, phuCapChucVu
        @Override
        public void xuat() {
            super.xuat();
            System.out.println("Chuyen mon: "+chuyenMon +"phuc cap chuc vu "+phuCapChucVu );
        
            
        }
        // Hoan thien phuong thuc tinhLuong() cho QuanLy
        // Luong = luong co ban + phu cap chuc vu
        @Override
        public double tinhLuong() {
        // Tự vie t code va o đa y
        return this.luongCoBan + this.phuCapChucVu;
        }
    }
        // Dinh nghia lop NghienCuu thua ke tu NhanVien
    class NghienCuu extends NhanVien {
        private String chuyenMon;
        private double phuCapDocHai;
        // Hoan thien constructor khong tham so cho NghienCuu
        // Goi constructor khong tham so cua lop cha
        public NghienCuu() {
            super();
            this.chuyenMon = "";
            this.phuCapDocHai = 0.0;
        }
        // Hoan thien constructor co tham so (maNhanVien, tenNhanVien, trinhDo,chuyenMon, phuCapDocHai)
        
        // Goi constructor cua lop cha voi maNhanVien, tenNhanVien, trinhDo, ganchuyenMon, phuCapDocHai
        
        public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, String
        chuyenMon, double phuCapDocHai) {
            super(maNhanVien, tenNhanVien, trinhDo );
            this.chuyenMon = chuyenMon ;
            this.phuCapDocHai = phuCapDocHai;
        }
        // Hoan thien getter cho chuyenMon
        public String getChuyenMon() {
        // Tự vie t code va o đa y
        return chuyenMon; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien getter cho phuCapDocHai
        public double getPhuCapDocHai() {
        // Tự vie t code va o đa y
        return phuCapDocHai; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien phuong thuc nhap() cho NghienCuu
        // Goi nhap() cua lop cha va nhap them chuyenMon, phuCapDocHai
        @Override
        public void nhap() {
            super.nhap();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap chuyen mon: ");
            this.chuyenMon = scanner.nextLine();
            System.out.print("Nhap phu cap doc hai: ");
            this.phuCapDocHai = scanner.nextDouble();
        }
        // Hoan thien phuong thuc xuat() cho NghienCuu
        // Goi xuat() cua lop cha va in them chuyenMon, phuCapDocHai
        @Override
        public void xuat() {
            super.xuat();
            System.out.println("chuyen mon: "+chuyenMon + " phu cap doc hai: "+phuCapDocHai);
        }
        // Hoan thien phuong thuc tinhLuong() cho NghienCuu
        // Luong = luong co ban + phu cap doc hai
        @Override
        public double tinhLuong() {
        // Tự vie t code va o đa y
        return luongCoBan + phuCapDocHai;// Chi la gia tri mac dinh, can thay bang cong thuc
        }
    }
        // Dinh nghia lop PhucVu thua ke tu NhanVien
    class PhucVu extends NhanVien {
            // Hoan thien constructor khong tham so cho PhucVu
            // Goi constructor khong tham so cua lop cha
            public PhucVu() {
                super();
            }
            // Hoan thien constructor co tham so (maNhanVien, tenNhanVien, trinhDo)
            // Goi constructor cua lop cha voi maNhanVien, tenNhanVien, trinhDo
            public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
                super(maNhanVien, tenNhanVien, trinhDo);
            }
            // Hoan thien phuong thuc tinhLuong() cho PhucVu
            // Luong = luong co ban
            @Override
            public double tinhLuong() {
            // Tự vie t code va o đa y
            return luongCoBan;// Chi la gia tri mac dinh, can thay bang cong thuc
            }
        }
        public static void main(String[] args) {
                bai1 outer = new bai1();
                Scanner scanner = new Scanner(System.in);
                
                ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
                // Tao mot doi tuong QuanLy voi maNhanVien = "QL001", tenNhanVien ="Nguyen Van A",
                
                // trinhDo = "Dai hoc", chuyenMon = "Quan tri", phuCapChucVu = 2000000
                QuanLy quanLy = outer.new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000 ); // Tự vie t code va o đa y
                // Goi phuong thuc nhap() de nhap thong tin cho quanLy
                quanLy.nhap();
                // Goi phuong thuc xuat() de in thong tin cua quanLy
                quanLy.xuat();
                // In luong cua quanLy
                // Su dung phuong thuc tinhLuong()
                System.out.println("luong cua quan ly = "+quanLy.tinhLuong());
                // Tao mot doi tuong NghienCuu voi maNhanVien = "NC001", tenNhanVien ="Tran Thi B",
                
                // trinhDo = "Thac si", chuyenMon = "Hoa hoc", phuCapDocHai = 1500000
                NghienCuu nghienCuu = outer.new NghienCuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000); // Tự vie t code va o đa y
                // Goi phuong thuc nhap() de nhap thong tin cho nghienCuu
                nghienCuu.nhap();
                // Goi phuong thuc xuat() de in thong tin cua nghienCuu
                nghienCuu.xuat();
                // In luong cua nghienCuu
                // Su dung phuong thuc tinhLuong()
                System.out.println("luong cua nghiencuu = "+nghienCuu.tinhLuong());
                // Tao mot doi tuong PhucVu voi maNhanVien = "PV001", tenNhanVien = "LeVan C",
                
                // trinhDo = "Trung cap"
                PhucVu phucVu = outer.new PhucVu("PV001", "Le Van c", "Trung cap"); // Tự vie t code va o đa y
                
                // Goi phuong thuc nhap() de nhap thong tin cho phucVu
                phucVu.nhap();
                // Goi phuong thuc xuat() de in thong tin cua phucVu
                phucVu.xuat();
                // In luong cua phucVu
                // Su dung phuong thuc tinhLuong()
                System.out.println("luong cua phuc vu = "+phucVu.tinhLuong());
                // Them cac nhan vien vao danh sach
                danhSachNhanVien.add(quanLy);
                danhSachNhanVien.add(nghienCuu);
                danhSachNhanVien.add(phucVu);
                // Xuat thong tin va luong cua tat ca nhan vien trong danh sach
                System.out.println("\nDanh sach nhan vien:");
                for (NhanVien nv : danhSachNhanVien) {
                nv.xuat();
                System.out.println("Luong: " + nv.tinhLuong());
                }
                
            
        
        }
}    