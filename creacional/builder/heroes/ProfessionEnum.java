package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum ProfessionEnum {

    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}
