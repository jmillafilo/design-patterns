package creacional.builder;

/**
 * Created by jmillafilo 
 */
public enum ProfesionEnum {

    GUERRERO, LADRON, MAGO, SACERDOTE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}
