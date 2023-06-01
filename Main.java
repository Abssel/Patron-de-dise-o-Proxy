
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" === Él, patrón de proxy de muestra de inicio ===");
		ProductoDao productDao = new ProductoDaoImpl();
		
		System.out.println(" 1) Sin muestra proxy ");
		Producto p1 = productDao.findById(10L);
		productDao.save(p1);
		
		System.out.println(" 2) Con muestra de Proxy ");
		ProductoDaoProxy productDaoProxy = new ProductoDaoProxy(productDao);
		Producto p2 = productDaoProxy.findById(10L);
		productDaoProxy.save(p2);
		
	}

}