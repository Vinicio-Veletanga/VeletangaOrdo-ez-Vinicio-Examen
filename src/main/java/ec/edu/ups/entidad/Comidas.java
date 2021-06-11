package ec.edu.ups.entidad;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comidas
 *
 */
@Entity

public class Comidas implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int codigo;
	private String nombre;
	private double preciou;
	@ManyToOne
	private Pedido pedido;
	
	public Comidas() {
		 
	}
	
	public Comidas(int codigo, String nombre, double preciou, Pedido pedido) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.preciou = preciou;
		this.pedido = pedido;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPreciou() {
		return preciou;
	}
	public void setPreciou(double preciou) {
		this.preciou = preciou;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preciou);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comidas other = (Comidas) obj;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		if (Double.doubleToLongBits(preciou) != Double.doubleToLongBits(other.preciou))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comidas [codigo=" + codigo + ", nombre=" + nombre + ", preciou=" + preciou + ", pedido=" + pedido + "]";
	}
	
	
	
	 
	
   
}
