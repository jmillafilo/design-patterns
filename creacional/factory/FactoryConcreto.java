package creacional.factory;

/**
 * Created by jmillafilo 
 */
public class FactoryConcreto extends Factory{

    @Override
    public Product createProduct(String productType) {
        return new ProductoConcreto(productType);
    }
}
