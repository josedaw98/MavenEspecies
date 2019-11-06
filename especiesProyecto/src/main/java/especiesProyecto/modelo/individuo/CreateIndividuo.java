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
	 * Crea un individuo persist�endolo en la base de datos
	 * @param coche
	 */
	public void create(IndividuoBean individuo) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(individuo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
