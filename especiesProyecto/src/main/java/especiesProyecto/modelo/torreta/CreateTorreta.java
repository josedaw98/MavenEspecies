package especiesProyecto.modelo.torreta;

import javax.persistence.EntityManager;

import especiesProyecto.util.ConnectionEntityManagerFactory;
import especiesProyecto.negocio.MovimientoBean;
import especiesProyecto.negocio.TorretaBean;

/**
 * Clase que inserta torretas en la base de datos
 * @author jose
 *
 */

public class CreateTorreta {

	/**
	 * Crea un individuo persistíendolo en la base de datos
	 * @param coche
	 */
	public void create(TorretaBean torreta) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(torreta);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
