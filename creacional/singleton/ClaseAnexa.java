package creacional.singleton;
/**
 * Created by jmillafilo 
 */
public class ClaseAnexa {
	
	
	public void probarSingleton() {
	        Singleton singletonTwo = Singleton.getInstancia();
	        System.out.println("Objects are the same instance");
	        System.out.println("    Singleton two hash code: " + System.identityHashCode(singletonTwo));
	        
	}

}
