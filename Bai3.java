public class Bai3 {
    class Coordinate {
        private float x , y;

        public Coordinate(){
            x = 0;
            y = 0;
        }
        public Coordinate(float x , float y){
            this.x = x;
            this.y = y;
        }
        public void tongToaDo(Coordinate A , Coordinate B){
            float tongX = A.x + B.x;
            float tongY = A.y + B.y;
        }
        public void diemDXTrenX(Coordinate A){
            this.x = -A.x;
            this.y = A.y;
        }
    }
}
