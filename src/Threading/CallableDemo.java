package Threading;


import java.util.concurrent.Callable;

class MyThread implements Callable{

    String name;

    public MyThread(String name){
        this.name = name;
    }


    @Override
    public Object call() throws Exception {
       System.out.println(this.name +" is starting to start calculation");
       Thread.sleep(2000);
       return this.name + "has completed calculation";
    }
}


public class CallableDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("mitul");
    }
}
