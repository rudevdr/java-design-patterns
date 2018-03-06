package observer;

public class MainObserver {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addObserver(new Handler()); //adding a new handler which will observe the change
        calculator.addObserver(new Handler()); //adding a new handler which will observe the change
       calculator.calculator();
        System.out.println("Printing here works ok");
    }

}
