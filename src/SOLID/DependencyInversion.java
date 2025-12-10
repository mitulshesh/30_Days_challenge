package SOLID;

interface Keyboard{

}

interface Monitor{

}

class WirelessKeyboard implements Keyboard{

}

class WiredKeyboard implements Keyboard{

}

class LCDMonitor implements Monitor{

}

class LEDMonitor implements Monitor{

}


class Computer{

    Keyboard keyboard;
    Monitor monitor;

    public Computer(Keyboard keyboard,Monitor monitor){
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
public class DependencyInversion {
    public static void main(String[] args) {
        Computer c1=new Computer(new WiredKeyboard(),new LEDMonitor());

        Computer c2 = new Computer(new WirelessKeyboard(),new LCDMonitor());
    }
}
