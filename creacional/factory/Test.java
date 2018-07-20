package creacional.factory;

/**
 * Created by jmillafilo 
 */
public class Test {

    public static void main(String[] args) {

        Factory factory;
        Product productCreated;

        factory = new FactoryConcreto();

        productCreated = factory.createProduct("primer");

        if(productCreated != null){
            System.out.println(productCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        factory = new FactoryConcreto();

        productCreated = factory.createProduct("segundo");

        if(productCreated != null){
            System.out.println(productCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }


    }

}
