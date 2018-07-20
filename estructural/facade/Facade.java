package estructural.facade;

/**
 * Created by jmillafilo 
 */
public class Facade {

    private AccionConcreto one;
    private AccionConcreto two;

    public Facade() {
        System.out.println("Este es Facade Padre...");
        this.one = new AccionConcreto("Uno");
        this.two = new AccionConcreto("Dos");
    }

    public void doSomethingInOne() {
        System.out.println("Llamando al doSomething:");
        one.doSomething();
    }

    public void doSomethingInOTwo() {
        System.out.println("Calling doSomething in action TWO:");
        two.doSomething();
    }

    public void doSomethingInOneAndTwo() {
        System.out.println("Calling doSomething in action ONE and TWO:");
        one.doSomething();
        two.doSomething();
    }
}
