package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.EstacionamientoFacade;
import model.Estacionamiento;

@Stateless
public class EstacionamientoFacadeEJB extends AbstractFacade<Estacionamiento> implements EstacionamientoFacade {
	
	
	@PersistenceContext(unitName = "mydbPU")
	private EntityManager em;
	
	public EstacionamientoFacadeEJB() {
		super(Estacionamiento.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
	
	
	

}
