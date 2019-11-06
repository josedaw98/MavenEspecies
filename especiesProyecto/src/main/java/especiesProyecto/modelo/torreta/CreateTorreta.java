package especiesProyecto.modelo.torreta;

import javax.persistence.EntityManager;

import especiesProyecto.util.ConnectionEntityManagerFactory;
import especiesProyecto.negocio.MovimientoBean;

/**
 * Clase que inserta individuos en la base de datos
 * @author carlos
 *
 */

public class CreateTorreta {

	/**
	 * Crea un individuo persistíendolo en la base de datos
	 * @param coche
	 */
	public void create(MovimientoBean movimiento) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(movimiento);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
