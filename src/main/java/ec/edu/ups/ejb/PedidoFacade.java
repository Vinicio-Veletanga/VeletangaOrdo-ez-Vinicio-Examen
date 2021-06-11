package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;
import ec.edu.ups.entidad.Pedido;
 
@Stateless
public class PedidoFacade  extends AbstractFacade<Pedido> {
	   @PersistenceContext(unitName = "VeletangaOrdo�ez-Vinicio-Examen")
	    private EntityManager em;

	    public PedidoFacade() {
	        super(Pedido.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	

}
