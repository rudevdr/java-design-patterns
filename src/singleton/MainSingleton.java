package singleton;

public class MainSingleton {
    public static void main(String[] args) {
        //getting the instance of the class
        Earth planet1 = Earth.getInstance();
        //getting another instance of the class
        Earth planet2 = Earth.getInstance();
        //both instances are same
        System.out.println(planet1+" <-- Planet 1 | Planet 2 --> "+planet2);

    }
}
