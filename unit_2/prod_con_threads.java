public class prod_con_threads {
    public static void main(String[] args) {
        Buffer b = new Buffer();
        Thread producer= new Thread(){
        public void run(){
            for(int i =0;i<=10;i++){
                b.produce(i);
                try{Thread.sleep(200);}
                catch(InterruptedException ie){}
            }}
        };
        Thread consumer= new Thread("consumer"){
            public void run(){
                for(int i =0;i<=10;i++){
                b.consume();
                try{Thread.sleep(1000);}
                catch(InterruptedException ie){}}
            }
        };
        producer.start();
        consumer.start();
    }
}
class Buffer{
    int [] buffer=new int[5];
    int count=0,in=0,out=0;
    //in-pos at where new item is produced ,out-consumed from 
    synchronized void produce(int value){
        //buffer full =>make producer wait indefinetly
        while(count==buffer.length){
            try{
                System.out.println("Buffer full.Producer Waiting");
                wait();
            }
            catch(InterruptedException ie){}
        }
        buffer[in]=value;
        System.out.println("Produced "+value+" at "+in);
        in=(in+1)%buffer.length;
        count++;
        notify();
    }
    synchronized void consume(){
        //buffer Empty=> make Consumer Wait Indefinitely
        while(count==0)
        {
            try{
                System.out.println("Buffer Empty.Consumer Waiting");
                wait();
            }catch(InterruptedException ie){}
        }
        int value=buffer[out];
        System.out.println("Consume "+value+" at "+out);
        out=(out+1)%buffer.length;
        count--;
        notify();
    }
}
