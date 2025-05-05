public class bai3 {
    // Dinh nghia lop tru tuong Shape voi mot so thuoc tinh va phuong thuc co ban
    abstract class Shape {
        protected String color;
        protected boolean filled;
        // Constructor khong tham so
        public Shape() {
            this.color = "red";
            this.filled = true;
        }
        // Constructor co tham so
        public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        }
        // Getter cho color
        public String getColor() {
            return color;
        }
        // Setter cho color
        public void setColor(String color) {
            this.color = color;
        }
        // Getter cho filled
        public boolean isFilled() {
            return filled;
        
        }
        // Setter cho filled
        public void setFilled(boolean filled) {
        this.filled = filled;
        }
        // Phuong thuc tru tuong tinh dien tich
        public abstract double getArea();
        // Phuong thuc tru tuong tinh chu vi
        public abstract double getPerimeter();
        // Phuong thuc tru tuong toString
        public abstract String toString();
        // Phuong thuc equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Shape shape = (Shape) obj;
            return filled == shape.filled && color.equals(shape.color);
        }
    }
        // Dinh nghia lop Circle thua ke tu Shape
        class Circle extends Shape {
        private double radius;
        // Hoan thien constructor khong tham so cho Circle
        // Goi constructor khong tham so cua lop cha va gan radius = 0
        public Circle() {
            super();
            radius = 0;
        
        }
        // Hoan thien constructor co tham so (radius)
        // Goi constructor khong tham so cua lop cha va gan gia tri cho radius
        public Circle(double radius) {
            super();
            this.radius = radius;
        }
        // Hoan thien constructor co tham so (radius, color, filled)
        // Goi constructor co tham so cua lop cha va gan gia tri cho radius
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius =  radius;
        }
        // Hoan thien getter cho radius
        public double getRadius() {
        // Tự vie t code va o đa y
        return radius; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien setter cho radius
        public void setRadius(double radius) {
            this.radius = radius;
        }
        // Hoan thien phuong thuc tinh dien tich cho Circle
        // Dien tich = pi * radius * radius
        @Override
        public double getArea() {
            
        
        return  3.14f*radius*radius; // Chi la gia tri mac dinh, can thay bang cong thuc
        }
        // Hoan thien phuong thuc tinh chu vi cho Circle
        // Chu vi = 2 * pi * radius
        @Override
        public double getPerimeter() {
        // Tự vie t code va o đa y
        return 2*3.14f*radius; // Chi la gia tri mac dinh, can thay bang cong thuc
        }
        // Hoan thien phuong thuc toString cho Circle
        // Tra ve chuoi: "Hinh tron [radius=<radius>, color=<color>, filled=<filled>]"
        @Override
        public String toString() {
        // Tự vie t code va o đa y
        return "Hinh tron [radius=<"+radius+">, color=<"+color+">, filled=<"+filled+">]"; // Chi la gia tri mac dinh, can thay bang chuoi
        }
    }
        // Dinh nghia lop Rectangle thua ke tu Shape
    class Rectangle extends Shape {
        private double width;
        private double length;
        // Hoan thien constructor khong tham so cho Rectangle
        // Goi constructor khong tham so cua lop cha va gan width = length = 0
        public Rectangle() {
            super();
            width = 0;
            length = 0;
        }
        
        // Hoan thien constructor co tham so (width, length)
        // Goi constructor khong tham so cua lop cha va gan gia tri cho width, length
        public Rectangle(double width, double length) {
            super();
            this.width = width;
            this.length = length;
        }
        // Hoan thien constructor co tham so (width, length, color, filled)
        // Goi constructor co tham so cua lop cha va gan gia tri cho width, length
        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }
        // Hoan thien getter cho width
        public double getWidth() {
        // Tự vie t code va o đa y
        return width; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien setter cho width
        public void setWidth(double width) {
            this.width = width;
            
        }
        // Hoan thien getter cho length
        public double getLength() {
        // Tự vie t code va o đa y
        return length; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien setter cho length
        public void setLength(double length) {
        
            this.length = length;
        }
        // Hoan thien phuong thuc tinh dien tich cho Rectangle
        // Dien tich = width * length
        @Override
        public double getArea() {
        // Tự vie t code va o đa y
        return width*length; // Chi la gia tri mac dinh, can thay bang cong thuc
        }
        // Hoan thien phuong thuc tinh chu vi cho Rectangle
        // Chu vi = 2 * (width + length)
        @Override
        public double getPerimeter() {
        // Tự vie t code va o đa y
        return 2 * (width + length); // Chi la gia tri mac dinh, can thay bang cong thuc
        }
        // Hoan thien phuong thuc toString cho Rectangle
        // Tra ve chuoi: "Hinh chu nhat [width=<width>, length=<length>, color=<color>,filled=<filled>]"
        
        @Override
        public String toString() {
        // Tự vie t code va o đa y
            return "Hinh chu nhat [width=<"+width+">, length=<"+length+">, color=<"+color+">,filled=<"+filled+">]"; 
        }
    }
        // Dinh nghia lop Square thua ke tu Rectangle
        
    class Square extends Rectangle {
        // Hoan thien constructor khong tham so cho Square
        // Goi constructor khong tham so cua lop cha
        public Square() {
            super();
        }
        // Hoan thien constructor co tham so (side)
        // Goi constructor co tham so cua lop cha voi width = length = side
        public Square(double side) {
            super(side,side);
            
        }
        // Hoan thien constructor co tham so (side, color, filled)
        // Goi constructor co tham so cua lop cha voi width = length = side
        public Square(double side, String color, boolean filled) {
            super(side,side,color,filled);
            
        }
        // Hoan thien getter cho side
        public double getSide() {
        // Tự vie t code va o đa y
        return super.length; // Chi la gia tri mac dinh, can sua lai
        }
        // Hoan thien setter cho side
        public void setSide(double side) {
            super.setLength(side);
            super.setWidth(side);
        }
        // Hoan thien setter cho width
        
        // Gan gia tri cho ca width va length
        @Override
        public void setWidth(double width) {
            super.setLength(width);
            super.setWidth(width);
        }
        // Hoan thien setter cho length
        // Gan gia tri cho ca width va length
        @Override
        public void setLength(double length) {
            super.setLength(length);
            super.setWidth(length);
        }
        // Hoan thien phuong thuc toString cho Square
        // Tra ve chuoi: "Hinh vuong [side=<side>, color=<color>, filled=<filled>]"
        @Override
        public String toString() {
        // Tự vie t code va o đa y
        return "Hinh vuong [side=<"+super.getLength()+">, color=<"+color+">, filled=<"+filled+">]"; // 
        }
    }    
    public static void main(String[] args) {
            bai3 outer = new bai3();
            // Tao mot doi tuong Circle voi radius = 5, color = "blue", filled = true
            Circle circle = outer.new Circle(5,"blue", true); // Tự vie t code va o đa y
            // Tao mot doi tuong Rectangle voi width = 4, length = 6, color = "green", filled= false
            
            
            Rectangle rectangle = outer.new Rectangle(4,6,"green",false); // Tự vie t code va o đa y
            // Tao mot doi tuong Square voi side = 3, color = "yellow", filled = true
            Square square = outer.new Square(3,"yellow", true); // Tự vie t code va o đa y
            // In thong tin cac hinh
            System.out.println("Thong tin hinh tron:"+circle.toString());
            
            System.out.println("\nThong tin hinh chu nhat:"+rectangle.toString());
            
            System.out.println("\nThong tin hinh vuong:"+square.toString());
            
            // Kiem tra equals giua cac hinh
            System.out.println("\nKiem tra equals:");
            System.out.println("Circle va Rectangle co bang nhau khong? " +
            circle.equals(rectangle));
            System.out.println("Rectangle va Square co bang nhau khong? " +
            rectangle.equals(square));
            
        
    }
}
