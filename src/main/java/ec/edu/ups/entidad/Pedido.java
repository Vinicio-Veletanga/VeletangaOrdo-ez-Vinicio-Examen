package ec.edu.ups.entidad;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.inject.Named;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pedido
 *
 */
@Entity 
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numero;
	private Date fecha;
	private String nombrecliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;
	@OneToMany(mappedBy = "pedido")
	private List<Comidas> comidas;
	
	@OneToMany(mappedBy = "pedido")
	private List<Tarjeta> tarjeta; 
	@Transient
	private boolean editable;

	public Pedido() {
	}

	public Pedido(String observaciones) {
		super(); 
		this.observaciones = observaciones; 
	}
	
	/*	public Pedido(int numero, Date fecha, String nombrecliente, double subtotal, double iva, double total,
			String observaciones) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.nombrecliente = nombrecliente;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.observaciones = observaciones; 
	}*/
	

	public List<Tarjeta> getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(List<Tarjeta> tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Comidas> getComidas() {
		return comidas;
	}

	public void setComidas(List<Comidas> comidas) {
		this.comidas = comidas;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comidas == null) ? 0 : comidas.hashCode());
		result = prime * result + (editable ? 1231 : 1237);
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		long temp;
		temp = Double.doubleToLongBits(iva);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nombrecliente == null) ? 0 : nombrecliente.hashCode());
		result = prime * result + numero;
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		temp = Double.doubleToLongBits(subtotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(total);
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
		Pedido other = (Pedido) obj;
		if (comidas == null) {
			if (other.comidas != null)
				return false;
		} else if (!comidas.equals(other.comidas))
			return false;
		if (editable != other.editable)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (Double.doubleToLongBits(iva) != Double.doubleToLongBits(other.iva))
			return false;
		if (nombrecliente == null) {
			if (other.nombrecliente != null)
				return false;
		} else if (!nombrecliente.equals(other.nombrecliente))
			return false;
		if (numero != other.numero)
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (Double.doubleToLongBits(subtotal) != Double.doubleToLongBits(other.subtotal))
			return false;
		if (Double.doubleToLongBits(total) != Double.doubleToLongBits(other.total))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [numero=" + numero + ", fecha=" + fecha + ", nombrecliente=" + nombrecliente + ", subtotal="
				+ subtotal + ", iva=" + iva + ", total=" + total + ", observaciones=" + observaciones + ", comidas="
				+ comidas + ", editable=" + editable + "]";
	}

	 

}
