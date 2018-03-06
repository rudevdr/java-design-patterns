package singleton;

/**
 * The below class is singleton because:
 * 1. it is accessible to every class in every package because THE CLASS IS PUBLIC
 * 2. No class can create instance of it because CONSTRUCTOR IS PRIVATE
 * 3. the one and the only way to get instance of the class is through getInstance() method which is
 *    PUBLIC and returns the instance of class (NOT AN INSTANCE of class but THE INSTANCE)
 * 4. All instances of the class will be same because getInstance() is STATIC (class member)
 *
 * So: public class, private constructor, no-args public static method which returns THE INSTANCE of class
 */

public class Earth {    //PUBLIC class so it can be accessed by any other class in any other package
    private static Earth earth = null;  //PRIVATE( no one can access it) STATIC (only 1)
                                        // instance of Earth defined but not created yet

    private Earth(){}       //PRIVATE CONSTRUCTOR so that no one can create instance of the class

    public static Earth getInstance(){ //PUBLIC STATIC no args method which returns the instance
        if (earth == null){             //check if instance exist, can be ignored but speeds up things
            synchronized(Earth.class){  //for THREAD SAFETY so class is locked so no 2 class access @same time
                earth = new Earth();    //creates a new instance if these requirements are met:
                                        //1. No instance already present (static and null)
                                        //2. Only one class is working with the instance at one time
            }
        }
        return earth;                   //finally returns the instance
    }
}

