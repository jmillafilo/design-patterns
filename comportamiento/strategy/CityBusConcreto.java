package comportamiento.strategy;

/**
 * Created by jmillafilo 
 */
public class CityBusConcreto implements  Strategy {

    @Override
    public String travel() {
        return "viajando en: CityBus";
    }

}
