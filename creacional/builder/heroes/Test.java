package creacional.builder.heroes;

/**
 * Created by luisburgos on 22/07/15.
 */
public class Test {

    public static void main(String[] args) {
        Hero mage = new HeroBuilder(ProfessionEnum.MAGE, "Riobard")
                .withWeapon(WeaponEnum.DAGGER)
                .build();
        System.out.println(mage);

        Hero warrior = new HeroBuilder(ProfessionEnum.WARRIOR, "Amberjill")
                .withArmor(ArmorEnum.CHAIN_MAIL)
                .withWeapon(WeaponEnum.SWORD).build();
        System.out.println(warrior);

        Hero thief = new HeroBuilder(ProfessionEnum.THIEF, "Desmond")
                .withWeapon(WeaponEnum.BOW).build();
        System.out.println(thief);
    }

}
