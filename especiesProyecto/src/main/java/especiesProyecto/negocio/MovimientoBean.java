package especiesProyecto.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
}
