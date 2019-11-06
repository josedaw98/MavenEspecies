package especiesProyecto.modelo.informe;

import javax.persistence.EntityManager;

import especiesProyecto.util.ConnectionEntityManagerFactory;
import especiesProyecto.negocio.InformeBean;
import especiesProyecto.negocio.MovimientoBean;

/**
 * Clase que inserta individuos en la base de datos
 * @author carlos
 *
 */

public class CreateInforme {

	/**
	 * Crea un individuo persistíendolo en la base de datos
	 * @param coche
	 */
	public void create(InformeBean informe) {
		
		// Recoge la conexión
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManager().createEntityManager();
		
		// empieza la transacción, persistimos y cerramos
		entityManager.getTransaction().begin();
		entityManager.persist(informe);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
