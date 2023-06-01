
public class ProductoDaoProxy implements ProductoDao {
    private final ProductoDao productoDao;
    public ProductoDaoProxy(ProductoDao productDao) {
        this.productoDao = productDao;
    }
    public Producto findById(Long id) {
        System.out.println("Lógica de proxy antes de encontrar ...");
        Producto p = this.productoDao.findById(id);
        System.out.println("Lógica de proxy después de encontrar...");
        return p;
    }
    public Producto save(Producto product) {
        System.out.println("Lógica del proxy antes de guardar ...");
        Producto p = this.productoDao.save(product);
        System.out.println("Lógica de proxy después de guardar ...");
        return p;
    }
}