package especiesProyecto.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * Bean de tipo DAO para los individuos
 * @author jose
 *
 */

@Entity
@Table(name="informe")
public class InformeBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long idInforme;
	
	@Column 
	private String fecha;
	
	@ManyToMany
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	/*VArias biologoscon Varios Movimientos*/
	@ManyToMany
	private List<BiologoBean> biologos = new ArrayList<BiologoBean>();
	
	/**
	 * Operación que permite añadir biologos al movimiento y esta movimineto a la lista de movimientos
	 * @param biologo
	 */
	public void addBiologo(BiologoBean biologo) {
		
		if(!biologos.contains(biologo)) {
			
			biologos.add(biologo);
			
			// decirle al alumno que añada esta asignatura
			 List<InformeBean> movimientos = biologo.getInformes();
			if(!biologos.contains(this)) {
				
				movimientos.add(this);
			}
		}
	}
	

	public long getIdInforme() {
		return idInforme;
	}

	public void setIdInforme(long idInforme) {
		this.idInforme = idInforme;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<MovimientoBean> getMoviminetos() {
		return movimientos;
	}

	public void setMoviminetos(List<MovimientoBean> moviminetos) {
		this.movimientos = moviminetos;
	}


	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}


	public List<BiologoBean> getBiologos() {
		return biologos;
	}


	public void setBiologos(List<BiologoBean> biologos) {
		this.biologos = biologos;
	}
	
	
	
	
}
