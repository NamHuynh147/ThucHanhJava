public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();
        hs1.output();
        HocSinh hs2 = new HocSinh(111 , "nguyen ngoc lan", 8.5f);
        hs2.output();
        HocSinh hs3 = new HocSinh(hs2);
        hs3.output();
        hs3.setHoTen("pham chau tuan");
        hs3.output();

        float max = hs1.getDiemTB();
        String ht = hs1.getHoTen();
        if (max <hs2.getDiemTB()){
            max = hs2.getDiemTB();
            ht = hs2.getHoTen();
        }
        if (max <hs3.getDiemTB()){
            max = hs3.getDiemTB();
            ht = hs3.getHoTen();
        }
        System.out.println("hoc sinh "+ht+ " co diem TB lon nhat la "+max);
    }
}
