package estructural.decorator;

/**
 * Created by jmillafilo 
 */
public abstract class Decorator implements Componente {

    protected Componente component;

    public Decorator(Componente component){
        this.component = component;
    }

    @Override
    public void doOperation() {
    	
        component.doOperation();
    }
}
