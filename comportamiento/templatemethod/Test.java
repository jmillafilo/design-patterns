package comportamiento.templatemethod;
public class Test{
	/**
	 * Created by jmillafilo 
	 */
	public static void main(String... args){

		CajeroAutomaticoTemplateConcreto ca = new CajeroAutomaticoTemplateConcreto("F678AB", 30, 1);
		ca.procesar("F678AB",10,2);

		System.out.println();

		CajeroTemplateConcreto c = new CajeroTemplateConcreto("1234AB", 50, 1);
		c.procesar("1234AB",10,2);
	}
}