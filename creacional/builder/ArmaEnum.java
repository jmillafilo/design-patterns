package creacional.builder;

/**
 * Created by jmillafilo 
 */
public enum ArmaEnum {

    DAGA("Daga"), ESPADA("Espada Larga"), HACHA("hacha de dos manos"), MARTILLO("Martillo de guerra"), ARCO("Arco largo");
	
	 ArmaEnum(String title) {
	    }
    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
