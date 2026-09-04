class MultiThread {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment(Thread.currentThread().getName());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "T1");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment(Thread.currentThread().getName());
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "T2");
        t1.start();
        t2.start();
    }
}
class Counter {
    int count = 0;
    void increment
    synchronized(this){
        count++;
    }
    
        System.out.println(threadName + " inc to " + (++count));
    
}