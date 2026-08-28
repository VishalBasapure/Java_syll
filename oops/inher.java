package oops;
class inher{
    public static void main(String[] args){
        vehicle v=new vehicle(2000,"petrol");
        v.start();
        car c= new car("tata","aeo345",5000,"deseil");
        System.out.println("parent through");
        c.start();
    }
}
class vehicle{
    private int eng_cc;
    private String fueltype;
    //constructor
    vehicle(int eng_cc, String fueltype){
        this.setEng_cc(eng_cc);
        this.setFueltype(fueltype);
    }
    //setter
    public void setEng_cc(int eng_cc){
        this.eng_cc=eng_cc;
    }
    public void setFueltype(String fueltype){
        this.fueltype=fueltype;
    }
    //getter
    public int getEng_cc(){
        return this.eng_cc;
    }
    public String getFueltype() {
        return this.fueltype;
    }
    public void start(){
        System.out.println("vehicle started");
        System.err.println("engine_cc: "+this.getEng_cc());
        System.err.println("fueltype: "+this.getFueltype());
        
    }
}
class car extends vehicle{
    private String brand,model;
    //constructor
    car(String brand,String model,int eng_cc,String fueltype){
        super(eng_cc,fueltype);
        System.out.println("car contructor invoked");
        this.setBrand(brand);
        this.setModel(model);
    }
    //setter
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    //getter
    public String getModel(){
        return this.model;
    }
    public String getbrand() {
        return this.brand;
    }
    public void start(){
        System.out.println("car started");
        System.err.println("engine_cc: "+this.getEng_cc());
        System.err.println("fueltype: "+this.getFueltype());
        System.out.println("brand: "+this.brand);
        System.out.println("model: "+this.model);
    }

}