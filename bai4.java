public class bai4 {
    class Vehicle {
        private String tenChuXe;
        private String loaiXe;
        private int dungTich;
        private float giaXe;

        public Vehicle(){
            this.tenChuXe = "Nguyen Gia Huy";
            this.loaiXe = "Future Neo" ;
            this.dungTich = 100 ;
            this.giaXe = 100000000;
        }
        public Vehicle(String tenChuXe, String loaiXe, int dungTich , float giaXe){
            this.tenChuXe = tenChuXe;
            this.loaiXe = loaiXe ;
            this.dungTich = dungTich;
            this.giaXe = giaXe;
        }
        public float thueMuaXe(){
            if (this.dungTich<100) {
                return giaXe*(1/100);
            }
            else if (this.dungTich< 200) {
                return giaXe*(3/100);
            }
            else if (this.dungTich > 200) {
                return giaXe*(5/100);
            }
            else   return 0;
        }
        
    }
}
