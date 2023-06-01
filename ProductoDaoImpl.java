
public class ProductoDaoImpl implements ProductoDao {
    public Producto findById(Long id) {
        System.out.println("Encontrar producto con id = " + id);
        return new Producto(id, "Muestra");
    }
    public Producto save(Producto product) {
        System.out.println("Producto de ahorro ...." );
        return product;
    }
}
