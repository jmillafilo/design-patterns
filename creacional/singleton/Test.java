package creacional.singleton;

/**
 * Created by jmillafilo 
 */
public class Test {

    public static void main(String[] args) {

        Singleton singletonOne = Singleton.getInstancia();
            System.out.println("Objects are the same instance");
            System.out.println("    Singleton one hash code: " + System.identityHashCode(singletonOne));
            ClaseAnexa testTwo = new ClaseAnexa();
            testTwo.probarSingleton();
            
       
    }

}

