package especiesProyecto.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 * Bean de tipo DAO para los movimientos
 * @author Carlos
 *
 */

@Entity
@Table(name="movimiento")
public class MovimientoBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long codMovimiento;
	
	@Column
	private String tipo;
	
	@Column
	private String fecha;
	
	@Column
	private String hora;
	
	// Muchos movimientos para un individuo
	@ManyToOne
	@JoinColumn(name="FK_individuo")
	private IndividuoBean individuo;
	
	@ManyToOne
	@JoinColumn(name="FK_torreta")
	private TorretaBean torreta;
	
	/*VArias listas en Varios Movimientos*/
	@ManyToMany(mappedBy="movimientos")
	private List<InformeBean> informes = new ArrayList<InformeBean>();
	
	/**
	 * Operación que permite añadir alumnos a la asignatuta y esta asignatura a la lista de alumnos
	 * @param alumno
	 */
	public void addInforme(InformeBean informe) {
		
		if(!informes.contains(informe)) {
			
			informes.add(informe);
			
			// decirle al alumno que añada esta asignatura
			 List<MovimientoBean> moviminetos = informe.getMoviminetos();
			if(!informes.contains(this)) {
				
				moviminetos.add(this);
			}
		}
	}
	
	

	public long getCodMovimiento() {
		return codMovimiento;
	}

	public void setCodMovimiento(long codMovimiento) {
		this.codMovimiento = codMovimiento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public IndividuoBean getIndividuo() {
		return individuo;
	}

	public void setIndividuo(IndividuoBean individuo) {
		this.individuo = individuo;
	}

	public TorretaBean getTorreta() {
		return torreta;
	}

	public void setTorreta(TorretaBean torreta) {
		this.torreta = torreta;
	}

	public List<InformeBean> getInformes() {
		return informes;
	}

	public void setInformes(List<InformeBean> informes) {
		this.informes = informes;
	}
	
	
	
}
