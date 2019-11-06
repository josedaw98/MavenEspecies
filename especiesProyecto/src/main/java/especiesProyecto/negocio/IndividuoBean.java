package especiesProyecto.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bean de tipo DAO para los individuos
 * @author Carlos
 *
 */

@Entity
@Table(name="individuo")
public class IndividuoBean {
	
	@Id
	@Column
	private long codIndividuo;
	
	@Column
	private String peso;
	
	@Column 
	private String dimensiones;
	
	// Muchos individuos en una especie
	@ManyToOne
	@JoinColumn(name="FK_especie")
	private EspecieBean especie;
	
	// Un individuo tiene muchos movimientos
	@OneToMany(mappedBy="individuo")
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	/**
	 * Clase que añade movimientos a la lista del individuo
	 * y este individuo al movimiento
	 * @param movimiento
	 */
	public void addMovimiento(MovimientoBean movimiento) {
		if(!movimientos.contains(movimiento)) {
			movimientos.add(movimiento);
			
			movimiento.setIndividuo(this);
		}
	}

	public long getCodIndividuo() {
		return codIndividuo;
	}

	public void setCodIndividuo(long codIndividuo) {
		this.codIndividuo = codIndividuo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public EspecieBean getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieBean especie) {
		this.especie = especie;
	}
	
}
