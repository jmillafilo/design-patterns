package comportamiento.strategy;

/**
 * Created by jmillafilo 
 */
public class TaxiConcreto implements Strategy {

    @Override
    public String travel() {
        return "viajando en : Taxi";
    }

}
