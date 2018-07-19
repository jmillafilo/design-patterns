package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum ArmorEnum {

    CLOTHES("clothes"), LEATHER("leather"), CHAIN_MAIL("chain mail"), PLATE_MAIL("plate mail");

    private String title;

    ArmorEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
