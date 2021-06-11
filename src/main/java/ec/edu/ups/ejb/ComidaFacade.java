package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;
 
@Stateless
public class ComidaFacade  extends AbstractFacade<Comidas> {
	   @PersistenceContext(unitName = "VeletangaOrdoñez-Vinicio-Examen")
	    private EntityManager em;

	    public ComidaFacade() {
	        super(Comidas.class);
	    }
	    
	    @Override
	    protected EntityManager getEntityManager() {
	        return em;
	    }
	

}
