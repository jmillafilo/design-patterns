package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Hero {

    private String name;
    private ProfessionEnum profession;
    private ArmorEnum armor;
    private WeaponEnum weapon;

    public Hero(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(ProfessionEnum profession) {
        this.profession = profession;
    }

    public void setArmor(ArmorEnum armor) {
        this.armor = armor;
    }

    public void setWeapon(WeaponEnum weapon) {
        this.weapon = weapon;
    }

    public ProfessionEnum getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public ArmorEnum getArmor() {
        return armor;
    }

    public WeaponEnum getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ");
        sb.append(profession);
        sb.append(" named ");
        sb.append(name);

        if (armor != null) {
            sb.append(" wearing ");
            sb.append(armor);
        }
        if (weapon != null) {
            sb.append(" and wielding a ");
            sb.append(weapon);
        }

        sb.append(".");
        return sb.toString();
    }

}
