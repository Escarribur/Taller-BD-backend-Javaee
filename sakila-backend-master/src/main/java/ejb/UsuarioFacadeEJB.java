package ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.UsuarioFacade;
import model.Usuario;

@Stateless
public class UsuarioFacadeEJB extends AbstractFacade<Usuario> implements UsuarioFacade {
	
	
	@PersistenceContext(unitName = "mydbPU")
	private EntityManager em;
	
	public UsuarioFacadeEJB() {
		super(Usuario.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}
	
	@Override
	public List<Usuario> cercanos(float ubix,float ubiy){
		return em.createNativeQuery("SELECT  *, ( 3959 * acos( cos( radians("+ ubix +") ) "
				+ "* cos( radians( u.ubi_xUsuario ) ) *  cos( radians( u.ubi_yUsuario ) - radians("+ ubiy +") ) + "
				+ "sin( radians("+ ubix +") ) * sin( radians( u.ubi_xUsuario ) ) ) ) AS distance FROM usuario u  HAVING distance < 0.62  "
				, Usuario.class).getResultList();
		//return em.createNamedQuery("Usuario.cercanos", Usuario.class)
        //		.setParameter("usuarioX", ubix).setParameter("usuarioY", ubiy).getResultList();
	}

}
