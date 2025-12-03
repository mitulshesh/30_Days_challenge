package SOLID;

interface Multifunction{
    void print();
    void scan();
    void fax();
}

interface Print{
    void print();
}

interface Scanner{
    void scan();
}

interface Fax{
    void fax();
}

class BasicPrinter implements Print{

    @Override
    public void print() {
        System.out.println("I can print");
    }
}

class OfficePrinter implements Print,Scanner,Fax{

    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}

public class InterfaceSegregation {
}
