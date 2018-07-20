package creacional.singleton;

/**
 * Created by jmillafilo 
 */
public class Singleton {

    static Singleton instance;

    private Singleton () {

    }

    /**
     * The instance gets created only when it is called for first time.
     * Lazy-loading.
     * This way singleton is thread-safe
     * @return
     */
    public synchronized static Singleton getInstancia(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;

    }

}
