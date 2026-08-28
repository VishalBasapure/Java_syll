package oops;
public class constructor_overload {
    public static void main(String[] args) {
        Shape s1 = new Shape(10);
        Shape s2 = new Shape(10, 20);
        Shape s3 = new Shape(3,4,5);
        //Shape s4 = new Shape();//compile error
    }
}

class Shape{
    private int side, x,y,a,b,c;
    Shape(int side){
        System.out.println("Square");
        this.side = side;
    }
    Shape(int x , int y){
        System.out.println("Rectange");
        this.x=x;
        this.y = y;
    }
    Shape(int a, int b , int c){
        System.out.println("Triangle");
        this.a =a;
        this.b = b;
        this.c = c;
    }
}

