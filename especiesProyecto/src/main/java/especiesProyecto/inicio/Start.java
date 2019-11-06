package especiesProyecto.inicio;

import especiesProyecto.modelo.especie.CreateEspecie;
import especiesProyecto.modelo.individuo.CreateIndividuo;
import especiesProyecto.modelo.movimiento.CreateMovimiento;
import especiesProyecto.negocio.EspecieBean;
import especiesProyecto.negocio.IndividuoBean;
import especiesProyecto.negocio.MovimientoBean;

public class Start {

	public static void main(String[] args) {
		EspecieBean lince = new EspecieBean();
		lince.setCodEspecie(0001);
		lince.setNombre("Lince rojo");
		lince.setTipo("Lynx");
		lince.setCaracteristicas("Más pequeño que el lince de Canadá."); 
		
		EspecieBean alce = new EspecieBean();
		alce.setCodEspecie(0002);
		alce.setNombre("Alce");
		alce.setTipo("Alces");
		alce.setCaracteristicas("Los machos presentan astas con formas muy variables.");
		
		IndividuoBean lince1 = new IndividuoBean();
		lince1.setCodIndividuo(01);
		lince1.setDimensiones("1,2m");
		lince1.setPeso("9 kg");
		
		IndividuoBean lince2 = new IndividuoBean();
		lince2.setCodIndividuo(02);
		lince2.setDimensiones("1,1m");
		lince2.setPeso("8,6 kg");
		
		IndividuoBean alce1 = new IndividuoBean();
		alce1.setCodIndividuo(03);
		alce1.setDimensiones("1,8m");
		alce1.setPeso("420 kg");
		
		MovimientoBean movimiento1 = new MovimientoBean();
		movimiento1.setTipo("Caminar 100m");
		
		MovimientoBean movimiento2 = new MovimientoBean();
		movimiento2.setTipo("Correr 500m");
		
		lince.addIndividuos(lince1);
		lince.addIndividuos(lince2);
		alce.addIndividuos(alce1);
		lince1.addMovimiento(movimiento1);
		alce1.addMovimiento(movimiento2);

		
		CreateEspecie createEspecie = new CreateEspecie();
		createEspecie.create(lince);
		createEspecie.create(alce);
		
		CreateIndividuo createIndividuo = new CreateIndividuo();
		createIndividuo.create(lince1);
		createIndividuo.create(lince2);
		createIndividuo.create(alce1);
		
		CreateMovimiento createMovimiento = new CreateMovimiento();
		createMovimiento.create(movimiento1);
		createMovimiento.create(movimiento2);
	}
}
