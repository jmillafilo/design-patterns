package creacional.builder;

/**
 * Created by jmillafilo 
 */
public class HeroeBuilder {

    private Heroe hero;

    public HeroeBuilder(ProfesionEnum profession, String name) {
        this.hero = new Heroe();
        if (profession == null || name == null) {
            throw new IllegalArgumentException(
                    "profession and name can not be null");
        }
        hero.setProfesion(profession);
        hero.setNombre(name);
    }

    public HeroeBuilder conArmadura(ArmaduraEnum armor) {
        hero.setArmadura(armor);
        return this;
    }

    public HeroeBuilder conArma(ArmaEnum weapon) {
        hero.setArma(weapon);
        return this;
    }

    public Heroe build() {
        return hero;
    }


}
