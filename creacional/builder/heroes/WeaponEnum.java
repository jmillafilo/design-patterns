package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public enum WeaponEnum {

    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
