package za.ac.cput.chapter4.Polymorphism;


public class Calculator implements CalculatorInterface{

    @Override
    public int add(int a, int b){ return a + b;}

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
