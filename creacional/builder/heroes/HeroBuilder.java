package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public class HeroBuilder {

    private Hero hero;

    public HeroBuilder(ProfessionEnum profession, String name) {
        this.hero = new Hero();
        if (profession == null || name == null) {
            throw new IllegalArgumentException(
                    "profession and name can not be null");
        }
        hero.setProfession(profession);
        hero.setName(name);
    }

    public HeroBuilder withArmor(ArmorEnum armor) {
        hero.setArmor(armor);
        return this;
    }

    public HeroBuilder withWeapon(WeaponEnum weapon) {
        hero.setWeapon(weapon);
        return this;
    }

    public Hero build() {
        return hero;
    }


}
