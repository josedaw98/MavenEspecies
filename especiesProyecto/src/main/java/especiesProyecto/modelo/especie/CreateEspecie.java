package especiesProyecto.modelo.especie;

import javax.persistence.EntityManager;

import especiesProyecto.negocio.EspecieBean;
import especiesProyecto.util.ConnectionEntityManagerFactory;

/**
 * Clase que inserta especies en la base de datos
 * @author carlos
 *
 */

public class CreateEspecie {

	/**
	 * Crea un coche persist�endolo en la base de datos
	 * @param coche
	 */
	public void create(EspecieBean especie) {
		
		// Recoge la conexi�n
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacci�n, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(especie);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
