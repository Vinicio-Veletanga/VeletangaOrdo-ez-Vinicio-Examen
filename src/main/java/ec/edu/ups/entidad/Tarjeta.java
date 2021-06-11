package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tarjeta
 *
 */
@Entity

public class Tarjeta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int numerotarjeta;
	private String nombretitular;
	private Date fechaca;
	private String codigo;
	@ManyToOne
	private Pedido pedido;

	public Tarjeta() {
		super();
	}
	
	
	

	public Tarjeta(int numerotarjeta, String nombretitular, Date fechaca, String codigo, Pedido pedido) {
		super();
		this.numerotarjeta = numerotarjeta;
		this.nombretitular = nombretitular;
		this.fechaca = fechaca;
		this.codigo = codigo;
		this.pedido = pedido;
	}




	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}



	public int getNumerotarjeta() {
		return numerotarjeta;
	}

	public void setNumerotarjeta(int numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public String getNombretitular() {
		return nombretitular;
	}

	public void setNombretitular(String nombretitular) {
		this.nombretitular = nombretitular;
	}

	public Date getFechaca() {
		return fechaca;
	}

	public void setFechaca(Date fechaca) {
		this.fechaca = fechaca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((fechaca == null) ? 0 : fechaca.hashCode());
		result = prime * result + ((nombretitular == null) ? 0 : nombretitular.hashCode());
		result = prime * result + numerotarjeta;
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
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
		Tarjeta other = (Tarjeta) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (fechaca == null) {
			if (other.fechaca != null)
				return false;
		} else if (!fechaca.equals(other.fechaca))
			return false;
		if (nombretitular == null) {
			if (other.nombretitular != null)
				return false;
		} else if (!nombretitular.equals(other.nombretitular))
			return false;
		if (numerotarjeta != other.numerotarjeta)
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Tarjeta [numerotarjeta=" + numerotarjeta + ", nombretitular=" + nombretitular + ", fechaca=" + fechaca
				+ ", codigo=" + codigo + ", pedido=" + pedido + "]";
	}
   
	
}
