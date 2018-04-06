package hospitalcare;

import java.util.ArrayList;
import java.util.Date;

public class AltaMedica {
	
	private EntradaHospital entradaHospital;
	ArrayList <Medico> Medico;
	
	private Date Data_hora;

	public AltaMedica(EntradaHospital entradaHospital, ArrayList<hospitalcare.Medico> medico, Date data_hora) {
		super();
		this.entradaHospital = entradaHospital;
		Medico = medico;
		Data_hora = data_hora;
	}

	public EntradaHospital getEntradaHospital() {
		return entradaHospital;
	}

	public void setEntradaHospital(EntradaHospital entradaHospital) {
		this.entradaHospital = entradaHospital;
	}

	public ArrayList<Medico> getMedico() {
		return Medico;
	}

	public void setMedico(ArrayList<Medico> medico) {
		Medico = medico;
	}

	public Date getData_hora() {
		return Data_hora;
	}

	public void setData_hora(Date data_hora) {
		Data_hora = data_hora;
	}
	
	

}
