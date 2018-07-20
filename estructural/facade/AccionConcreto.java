package estructural.facade;

/**
 * Created by jmillafilo 
 */
public class AccionConcreto implements Action {
	
	private String nombreAccion;
	
	public AccionConcreto(String nombreAccion) {
		this.nombreAccion = nombreAccion;
	}
    @Override
    public void doSomething() {
        System.out.println("Este es el doSomethings de la accion "+nombreAccion);
    }
}
