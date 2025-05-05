import java.util.Scanner;
public class  bai4 {
//Dinh nghia interface Movable voi cac phuong thuc di chuyen
    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
        }
        
        //Dinh nghia lop MovablePoint trien khai Movable
    class MovablePoint implements Movable {
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;
        // Hoan thien constructor cho MovablePoint
        // Gan gia tri cho x, y, xSpeed, ySpeed
        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc nhap thong tin tu ban phim
        // Nhap x, y, xSpeed, ySpeed tu ban phim
        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap toa do x: ");
            this.x = scanner.nextInt();
            System.out.println("Nhap toa do y: ");
            this.y = scanner.nextInt();
            System.out.println("Nhap toc do di chuyen theo x: ");
            this.xSpeed = scanner.nextInt();
            System.out.println("Nhap toc do di chuyen theo y: ");
            this.ySpeed = scanner.nextInt();  
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho x
        public int getX() {
            return x;
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho x
        public void setX(int x) {
            this.x = x;
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho y
        
        public int getY() {
            return y;
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho y
        public void setY(int y) {
            this.y = y;
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho xSpeed
        public int getXSpeed() {
            return xSpeed;
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho xSpeed
        public void setXSpeed(int xSpeed) {
            this.xSpeed = xSpeed;
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho ySpeed
        public int getYSpeed() {
            return ySpeed; 
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho ySpeed
        public void setYSpeed(int ySpeed) {
            this.ySpeed = ySpeed;
        // Tự vie t code va o đa y
        }
        
        // Hoan thien phuong thuc toString
        // Tra ve chuoi: "(x, y), speed=(xSpeed, ySpeed)"
        @Override
        public String toString() {
            return "(" + x + ", " + y + "), speed=(" + xSpeed + ", " + ySpeed + ")";
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveUp
        // Giam y de di chuyen len: y = y - ySpeed
        @Override
        public void moveUp() {
            y += ySpeed;  
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveDown
        // Tang y de di chuyen xuong: y = y + ySpeed
        @Override
        public void moveDown() {
        // Tự vie t code va o đa y
            y -= ySpeed;
        }
        // Hoan thien phuong thuc moveLeft
        // Giam x de di chuyen sang trai: x = x - xSpeed
        @Override
        public void moveLeft() {
            x -= xSpeed;
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveRight
        
        // Tang x de di chuyen sang phai: x = x + xSpeed
        @Override
        public void moveRight() {
            x += xSpeed;
        // Tự vie t code va o đa y
        }
    }
        //Dinh nghia lop MovableCircle trien khai Movable
    class MovableCircle implements Movable {
        private int radius;
        private MovablePoint center;
        // Hoan thien constructor cho MovableCircle
        // Tao doi tuong MovablePoint cho center va gan gia tri cho radius
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.radius = radius;
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc nhap thong tin tu ban phim
        // Nhap thong tin tam (center) va ban kinh (radius) tu ban phim
        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap toa do tam (x, y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Nhap ban kinh: ");
            this.radius = scanner.nextInt();
            this.center = new MovablePoint(x, y, center.getXSpeed(), center.getYSpeed()); 
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho radius
        public int getRadius() {
            return radius;
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho radius
        
        public void setRadius(int radius) {
            this.radius = radius;
        // Tự vie t code va o đa y
        }
        // Hoan thien getter cho center
        public MovablePoint getCenter() {
            return center; 
        // Tự vie t code va o đa y
        }
        // Hoan thien setter cho center
        public void setCenter(MovablePoint center) {
                this.center = center;
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc toString
        // Tra ve chuoi: "Hinh tron tai (x, y), speed=(xSpeed, ySpeed), ban kinh=radius"
        @Override
        public String toString() {
            return "Hinh tron tai " + center.toString() + ", ban kinh=" + radius;
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveUp
        // Goi phuong thuc moveUp cua center
        @Override
        public void moveUp() {
            center.moveUp();
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveDown
        
        // Goi phuong thuc moveDown cua center
        @Override
        public void moveDown() {
            center.moveDown();
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveLeft
        // Goi phuong thuc moveLeft cua center
        @Override
        public void moveLeft() {
            center.moveLeft();
        // Tự vie t code va o đa y
        }
        // Hoan thien phuong thuc moveRight
        // Goi phuong thuc moveRight cua center
        @Override
        public void moveRight() {
            center.moveRight();
        // Tự vie t code va o đa y
        }
    }
    //Lop Main de kiem tra
    public static void main(String[] args) {
         bai4 outer = new  bai4();
    // Tao doi tuong Scanner de nhap tu ban phim
    Scanner scanner = new Scanner(System.in);
    
    // Tao mot doi tuong MovableCircle va nhap thong tin tu ban phim
    
    System.out.println("Nhap thong tin hinh tron:");
    MovableCircle circle = outer.new MovableCircle(0, 0, 0, 0, 0);
    circle.nhap();
    circle.center.nhap();
    // Goi phuong thuc nhap de nhap thong tin
    // Tự vie t code va o đa y
    // In thong tin ban dau
    System.out.println("Vi tri ban dau: " + circle.toString());
    // Di chuyen len
    circle.moveUp();
    System.out.println("Sau khi di chuyen len: " + circle.toString());
    // Di chuyen xuong
    circle.moveDown();
    System.out.println("Sau khi di chuyen xuong: " + circle.toString());
    // Di chuyen sang trai
    circle.moveLeft();
    System.out.println("Sau khi di chuyen sang trai: " + circle.toString());
    // Di chuyen sang phai
    circle.moveRight();
    System.out.println("Sau khi di chuyen sang phai: " + circle.toString());
    // Tự vie t code va o đa y
    }
}
