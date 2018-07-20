package creacional.builder;

/**
 * Created by jmillafilo 
 */
public enum ArmaduraEnum {

    CAPA("Capa"), CUERO("Cuero"), COTA_MALLA("Cota de malla"), ARMADURA_METAL("Armadura");

    private String title;

    ArmaduraEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
