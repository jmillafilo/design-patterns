package comportamiento.strategy.transportation;

/**
 * Created by luisburgos on 12/07/15.
 */
public class PersonalCar implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: PersonalCar";
    }

}
