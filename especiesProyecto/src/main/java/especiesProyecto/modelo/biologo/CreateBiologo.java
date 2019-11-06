package especiesProyecto.modelo.biologo;

import javax.persistence.EntityManager;

import especiesProyecto.util.ConnectionEntityManagerFactory;
import especiesProyecto.negocio.BiologoBean;
import especiesProyecto.negocio.InformeBean;
import especiesProyecto.negocio.MovimientoBean;

/**
 * Clase que inserta individuos en la base de datos
 * @author carlos
 *
 */

public class CreateBiologo {

	/**
	 * Crea un individuo persistíendolo en la base de datos
	 * @param coche
	 */
	public void create(BiologoBean biologo) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(biologo);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
