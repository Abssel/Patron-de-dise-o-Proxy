

/**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author: Armando Talavera Rosas

 * @version: 30/05/2023

 */




public class Producto {
    private Long id;
    private String nombre;
    public Producto(Long id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
        /**

         *Creamos la clase 

         * Va contener una variable de tipo long  y un string \
         * A continuacion utilizamos los get y set 
         */
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + "]";
    }
}