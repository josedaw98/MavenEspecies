package especiesProyecto.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bean de tipo DAO para las torretas
 * @author Carlos
 *
 */

@Entity
@Table(name="torreta")
public class TorretaBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idTorreta;
	
	@Column
	private String nombre;
	
	@Column
	private String ubicacion;
	
	@OneToMany
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
}
