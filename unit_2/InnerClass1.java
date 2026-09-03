class InnerClass2{
    public static void main(String[] args){
        Car c= new Car();
        Car.Engine e= c.new Engine();
        e.show();
    }
}

class Car{
    private static int x=10;
    Car(){
        System.out.println("Car Constructor");
    }
    static class Engine{
        Engine(){System.out.println("Engine Constructor");}
        public void show(){
            System.out.println("X=" +x);
        }
    }
}