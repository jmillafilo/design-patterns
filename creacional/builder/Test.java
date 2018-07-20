package creacional.builder;

/**
 * Created by jmillafilo 
 */
public class Test {

    public static void main(String[] args) {
        Heroe mage = new HeroeBuilder(ProfesionEnum.MAGO, "Aurius")
                .conArma(ArmaEnum.ARCO)
                .build();
        System.out.println(mage);

        Heroe warrior = new HeroeBuilder(ProfesionEnum.GUERRERO, "Esben")
                .conArmadura(ArmaduraEnum.COTA_MALLA)
                .conArma(ArmaEnum.ESPADA).build();
        System.out.println(warrior);

        Heroe thief = new HeroeBuilder(ProfesionEnum.LADRON, "James")
        		.conArmadura(ArmaduraEnum.CUERO).build();
        System.out.println(thief);
    }

}
