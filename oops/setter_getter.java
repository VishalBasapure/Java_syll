package oops;
public class setter_getter {
    public static void main(String[] args){
        Car c = new Car();
        Car c1 = new Car("Red", "Model", "Brand", 1999, true);
        System.out.println(c1.getcolor());
        System.out.println(c.getcolor());
        System.out.println(c.getModel());
        System.out.println(c.getisManuakl());
        //after using setter on black object
        c.setColor("black");
        c.setModel("Xtech");;
        System.out.println(c.getModel());
        System.out.println(c.getcolor());
    }
}

class Car{
    //Members / Data / Variables / Properties
    private String color ,model, brand;
    private int engine;
    private boolean isManual; 
    Car() {
        System.out.println("Blank Constructor");
    }
    Car(String color,String model,String brand, int Engine, boolean isManual ) {
        System.out.println("Parameterized Constructor");
        this.setColor(color);
        this.setBrand(brand);
        this.setModel(model);
        this.setEngine(Engine);
        this.setisManual(isManual);
    }
    //Setters
    public void setColor(String color) {this.color = color;}
    public void setModel(String model) {this.model = model;}
    public void setBrand(String brand) {this.brand = brand;}
    public void setEngine(int engine) {this.engine = engine;}
    public void setisManual(boolean isManual) {this.isManual = isManual;}
    //Getters
    public String getcolor() {return this.color;}
    public String getModel() {return this.model;}
    public String getBrand() {return this.brand;}
    public int getEngine() {return this.engine;}
    public boolean getisManuakl() {return this.isManual;}
}