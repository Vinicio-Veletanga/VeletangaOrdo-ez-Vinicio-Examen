package ec.edu.ups.controlador;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PedidoFacade;
import ec.edu.ups.entidad.Pedido;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class PedidoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@EJB
	private PedidoFacade ejbPedidoFacade;
	private List<Pedido> list;
	private Date fecha;
	private String nombrecliente;
	private double subtotal;
	private double iva;
	private double total;
	private String observaciones;

	public PedidoBean() {
	}

	@PostConstruct
	public void init() {
		list = ejbPedidoFacade.findAll();

	}

	public Pedido[] getList() {
		return list.toArray(new Pedido[0]);
	}

	public void setList(List<Pedido> list) {
		this.list = list;
	}

	public String add() {
		ejbPedidoFacade.create(new Pedido(this.observaciones));
		list = ejbPedidoFacade.findAll();
		return null;
	}

	public String delete(Pedido c) {
		ejbPedidoFacade.remove(c);
		list = ejbPedidoFacade.findAll();
		return null;
	}

	public String edit(Pedido c) {
		c.setEditable(true);
		return null;
	}

	public String save(Pedido c) {
		ejbPedidoFacade.edit(c);
		c.setEditable(false);
		return null;
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

}
