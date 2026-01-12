package CoreJava;


import java.util.concurrent.atomic.AtomicInteger;

class Counter extends Thread{

    AtomicInteger count;

    public Counter(){
        count = new AtomicInteger();
    }


    @Override
    public void run() {
        synchronized (this) {
            int max = 1_000_00_000;

            for (int i = 0; i < max; i++) {
                count.addAndGet(1);
            }
        }

    }
}



public class AtomicVarsDemo {

    public static void main() throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(counter,"thread1");
        Thread t2 = new Thread(counter,"thread2");
        t1.start();
        t2.start();

        t1.join(); //main thread waits till the thread completes
        t2.join();
        System.out.println(counter.count);

    }
}
