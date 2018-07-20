package comportamiento.strategy;

/**
 * Created by jmillafilo 
 */
public class Viajero {

    private String name;
    private Strategy transportationMode;

    public Viajero(){}

    public Viajero(String name){
        this.setName(name);
    }

    public void setTransportationMode(Strategy transportationMode){
        this.transportationMode = transportationMode;
    }

    public Strategy getTransportationMode(){
        return transportationMode;
    }

    public void salirDeViaje(){
        System.out.println(this.toString() + getTransportationMode().travel());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Yo soy" + getName() + ". ";
    }
}
