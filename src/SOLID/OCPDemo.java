package SOLID;

interface Operation{
    public Double perform(int a,int b);
}

class AdditionOperation implements Operation{

    @Override
    public Double perform(int a, int b) {
        return Double.valueOf(a + b);
    }
}

class SubtractionOperation implements Operation{

    @Override
    public Double perform(int a, int b) {
        return Double.valueOf(a - b);
    }
}

public class OCPDemo {
    public static void main(String[] args) {

        Operation add = new AdditionOperation();
        System.out.println(add.perform(10,20));



    }
}
