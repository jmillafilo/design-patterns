package comportamiento.templatemethod;
/**
 * Created by jmillafilo 
 */
public class CajeroAutomaticoTemplateConcreto extends CuentaBancariaTemplate{
	
	public CajeroAutomaticoTemplateConcreto(String c, int i, int t){
		procesar(c,i,t);
	}

	@Override
	public void saludar(){
		System.out.println("Por favor ingrese los datos...");
	}
}