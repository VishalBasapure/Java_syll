public class race_condition {
    public static void main(String[] args) throws InterruptedException{
        CounterNew c= new CounterNew();
        Thread t1= new Thread()
        {        public void run(){
            for(int i=0;i<1000;i++)
            {c.increment(this.getName());}
        }};
        Thread t2=new Thread(){
        public void run(){
            for(int i=0;i<1000;i++)
            {
                c.increment(this.getName());
            }
        }};
        t1.start();t2.start();
        try{t1.join();t2.join();}
        catch(InterruptedException ie){}

    }
}
class CounterNew{
    int count=0;
    void increment(String name){
        int old= count; //Obtain old count when thread entered 
        System.out.println(name +"READ count" +old);
        try{Thread.sleep(500);}
        catch(InterruptedException ie){};
        if(count!=old)
        {
            System.out.println("RACE");
            System.out.println("Thread"+name);
            System.out.println("old="+name+"\t NEW="+count);
        }
    count++;
    System.out.println("Thread"+name+"\t Count="+count);}
}