/**
 * Clase factura que almacena un código de cliente (id_cliente),
 *  su nombre (nombre_cliente) y los productos comprados (lineas)
 * @author Gustavo Casañ
 * @version 1
 */

package factura;

import java.util.Arrays;

public class Factura {
	
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**
	 * Creador de la clase Factura
	 * @param idCliente identificador (Código) del cliente, tipo String
	 * @param nombreCliente Nombre del cliente, tipo String
	 * @param lineas vector de la clase LineaFactura
	 * @see LineaFactura
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de cada linea
	 * @return precio total de la factura, como un float	 
	 */		
	public float getTotal(){
		float precio = 0; //inicializa el precio a 0
		for (int i = 0; i < this.lineas.length; i++ ){ //recorre la lista de productos comprados
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	/**
	 * Convierte una factura en una cadena, proporcionando la cantidad total
	 * @return devuelve una cadena, como un String
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

	/**
	 * Método principal de la clase
	 * @param args no se emplea
	 */
	public static void main(String[] args){
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{ //lista de productos
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas); //se crea una factura
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
