package especiesProyecto.inicio;

import org.h2.command.ddl.CreateTable;

import especiesProyecto.modelo.biologo.CreateBiologo;
import especiesProyecto.modelo.especie.CreateEspecie;
import especiesProyecto.modelo.individuo.CreateIndividuo;
import especiesProyecto.modelo.informe.CreateInforme;
import especiesProyecto.modelo.movimiento.CreateMovimiento;
import especiesProyecto.modelo.torreta.CreateTorreta;
import especiesProyecto.negocio.BiologoBean;
import especiesProyecto.negocio.EspecieBean;
import especiesProyecto.negocio.IndividuoBean;
import especiesProyecto.negocio.InformeBean;
import especiesProyecto.negocio.MovimientoBean;
import especiesProyecto.negocio.TorretaBean;

public class Start {

	public static void main(String[] args) {
		
		/*
		 * ********************************
		 * C R E A N D O    O B J E T O S
		 * ********************************
		 */
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
		
		TorretaBean torreta1 = new TorretaBean();
		torreta1.setNombre("torreta1");
		torreta1.setUbicacion("Oviedo");
		
		TorretaBean torreta2 = new TorretaBean();
		torreta2.setNombre("torreta2");
		torreta2.setUbicacion("Picos de Europa");
		
		InformeBean informe1 = new InformeBean();
		informe1.setFecha("21/1/2019");
		
		InformeBean informe2 = new InformeBean();
		informe2.setFecha("11/10/2018");
		
		BiologoBean biologo1 = new BiologoBean();
		biologo1.setDireccion("chile");
		biologo1.setFechaTitulacion("21/2/2019");
		biologo1.setNombre("carlos");
		biologo1.setProvincia("Asturias");
		
		BiologoBean biologo2 = new BiologoBean();
		biologo2.setDireccion("bermedez de castro");
		biologo2.setFechaTitulacion("11/12/2018");
		biologo2.setNombre("jose ramon");
		biologo2.setProvincia("Asturias");
		
		
		
		/*
		 * **************************************************
		 * A Ñ A D I E N D O    I N F O R M A C I Ó N
		 * **************************************************
		 */	
		
		lince.addIndividuos(lince1);
		lince.addIndividuos(lince2);
		alce.addIndividuos(alce1);
		lince1.addMovimiento(movimiento1);
		alce1.addMovimiento(movimiento2);
		torreta1.AddMovimiento(movimiento1);
		torreta2.AddMovimiento(movimiento2);
		movimiento1.addInforme(informe2);
		movimiento1.addInforme(informe1);
		movimiento2.addInforme(informe1);
		informe1.addBiologo(biologo2);
		informe1.addBiologo(biologo1);
		informe2.addBiologo(biologo2);

		/*
		 * **************************************************
		 * P E R S I S T I E N D O    L O S     D A T O S
		 * **************************************************
		 */			
	
		
		CreateEspecie createEspecie = new CreateEspecie();
		createEspecie.create(lince);
		createEspecie.create(alce);
		
		CreateIndividuo createIndividuo = new CreateIndividuo();
		createIndividuo.create(lince1);
		createIndividuo.create(lince2);
		createIndividuo.create(alce1);
		
		CreateTorreta createTorreta = new CreateTorreta();
		createTorreta.create(torreta1);
		createTorreta.create(torreta2);
		
		CreateMovimiento createMovimiento = new CreateMovimiento();
		createMovimiento.create(movimiento1);
		createMovimiento.create(movimiento2);
		
		CreateBiologo createbiologo = new CreateBiologo();
		createbiologo.create(biologo1);
		createbiologo.create(biologo2);
		
		CreateInforme createInforme = new CreateInforme();
		createInforme.create(informe2);
		createInforme.create(informe1);
		

		

	}
}
