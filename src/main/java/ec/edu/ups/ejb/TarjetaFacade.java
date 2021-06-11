package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;
import ec.edu.ups.entidad.Tarjeta;
 
@Stateless
public class TarjetaFacade  extends AbstractFacade<Tarjeta> {
	   @PersistenceContext(unitName = "VeletangaOrdoñez-Vinicio-Examen")
	    private EntityManager em;

	    public TarjetaFacade() {
	        super(Tarjeta.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	

}
