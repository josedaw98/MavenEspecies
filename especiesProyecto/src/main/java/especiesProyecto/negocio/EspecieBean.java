package especiesProyecto.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bean de tipo DAO para las especies
 * @author Carlos
 *
 */

@Entity
@Table(name="especies")
public class EspecieBean {

	@Id
	@Column
	private long codEspecie;
	
	@Column
	private String nombre;
	
	@Column
	private String tipo;
	
	@Column
	private String periodoMigratorio;
	
	@Column
	private String caracteristicas;

	// Una especie tiene de 0 a N individuos
	@OneToMany(mappedBy="especie")
	private List<IndividuoBean> individuos = new ArrayList<IndividuoBean>();
	
	/**
	 * Clase que añade individuos a la lista de la especie
	 * y esta especie al individuo
	 * @param individuo
	 */
	public void addIndividuos(IndividuoBean individuo) {
		if(!individuos.contains(individuo)) {
			individuos.add(individuo);
			
			individuo.setEspecie(this);
		}
	}
	

	public long getCodEspecie() {
		return codEspecie;
	}

	public void setCodEspecie(long codEspecie) {
		this.codEspecie = codEspecie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeriodoMigratorio() {
		return periodoMigratorio;
	}

	public void setPeriodoMigratorio(String periodoMigratorio) {
		this.periodoMigratorio = periodoMigratorio;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	public List<IndividuoBean> getIndividuos() {
		return individuos;
	}

	public void setIndividuos(List<IndividuoBean> individuos) {
		this.individuos = individuos;
	}
	
}
