package especiesProyecto.modelo.individuo;

import javax.persistence.EntityManager;

import especiesProyecto.util.ConnectionEntityManagerFactory;
import especiesProyecto.negocio.IndividuoBean;

/**
 * Clase que inserta individuos en la base de datos
 * @author carlos
 *
 */

public class CreateIndividuo {

	/**
	 * Crea un individuo persistíendolo en la base de datos
	 * @param coche
	 */
	public void create(IndividuoBean individuo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(individuo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
