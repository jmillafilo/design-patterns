package comportamiento.strategy;

/**
 * Created by jmillafilo 
 */
public class Test {

    public static void main(String[] args) {

        Viajero johnTraveler = new Viajero("John");
        Viajero rickTraveler = new Viajero("Rick");

        johnTraveler.setTransportationMode(new CityBusConcreto());
        rickTraveler.setTransportationMode(new TaxiConcreto());

        johnTraveler.salirDeViaje();
        rickTraveler.salirDeViaje();

    }

}
