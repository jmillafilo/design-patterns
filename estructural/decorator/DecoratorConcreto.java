package estructural.decorator;

/**
 * Created by jmillafilo 
 */
public class DecoratorConcreto extends Decorator {

    public DecoratorConcreto(Componente component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doAdditionalOperation();
    }

    public void doAdditionalOperation() {
        System.out.println("DecoradorConcreto");
    }

}
