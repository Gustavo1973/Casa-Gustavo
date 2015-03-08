/**
 * Clase LineaFactura que almacena un código del producto (id_producto),
 *  su nombre (nombre_producto), precio (precio), cantidad (cantidad) y descuento (descuento)
 * @author Gustavo Casañ
 * @version 1
 */

package factura;

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 * Creador de la clase LineaFactura
	 * @param idProducto cadena con el identificador del producto
	 * @param nombreProducto cadena con el nombre del producto
	 * @param precio precio por unidad del producto
	 * @param cantidad cantidad de unidades del producto compradas
	 * @param descuento descuento de la unidad
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	 * Convierte una LineaFactura en una cadena, proporcionando la cantidad total
	 * @return devuelve una cadena, de tipo String
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {	
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad
	 * @return devuelve el precio total del producto 
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
