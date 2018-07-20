package estructural.decorator;

/**
 * Created by jmillafilo 
 */
public class Test {

    public static void main(String[] args) {

        Componente component; 
        component = new DecoratorConcreto(new ComponenteConcreto());
        component.doOperation();
        System.out.println("Salida");
        component = new DecoratorConcreto(new DecoratorConcreto(new ComponenteConcreto()));
        component.doOperation();
    }

}
