package estructural.facade;

/**
 * Created by luisburgos on 12/08/15.
 */
public class Test {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.doSomethingInOne();
        facade.doSomethingInOTwo();
        facade.doSomethingInOneAndTwo();

    }
}
