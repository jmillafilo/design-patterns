package comportamiento.templatemethod;
/**
 * Created by jmillafilo 
 */
public class CajeroTemplateConcreto extends CuentaBancariaTemplate{
	public CajeroTemplateConcreto(String c, int i, int t){
		procesar(c,i,t);
	}

	@Override
	public void auditoria(){

		System.out.println("Espere un momento, hacemos la gestion");
		super.auditoria();
		System.out.println("Con mucho gusto, vuelva pronto.");
	}

	@Override
	public void saludar(){
		System.out.println("Bienvenido a su banco, en que le puedo ayudar?");
	}
}