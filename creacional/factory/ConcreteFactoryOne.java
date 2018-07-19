package creacional.factory;

/**
 * Created by luisburgos on 15/07/15.
 */
public class ConcreteFactoryOne extends Factory{

    @Override
    public Product createProduct(String productType) {
        return new ConcreteProductOne();
    }
}
