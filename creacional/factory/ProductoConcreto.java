package creacional.factory;

/**
 * Created by jmillafilo 
 */
public class ProductoConcreto extends Product{

    public ProductoConcreto(String name, String description){
        setName(name);
        setDescription(description);
    }

    public ProductoConcreto(String productType){
        setName(productType);
        setDescription("Producto creado por factory");
    }

    @Override
    public String getInformation() {
        return "productoNombre: " + getName() + " , Description: " + getDescription();
    }

}
