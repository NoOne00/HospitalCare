package hospitalcare;

import java.util.ArrayList;
import java.util.Date;


public class AdministracaoMedicacao {
	
	private PreparacaoMedicacao Preparacao;
	ArrayList <Enfermeiro> Enfermeiro;
     
   private Date Data_hora;
 

	public AdministracaoMedicacao(PreparacaoMedicacao preparacao, ArrayList<hospitalcare.Enfermeiro> enfermeiro,
			Date data_hora) {
		super();
		Preparacao = preparacao;
		Enfermeiro = enfermeiro;
		Data_hora = data_hora;
	}


	public Date getData_hora() {
		return Data_hora;
	}


	public void setData_hora(Date data_hora) {
		Data_hora = data_hora;
	}


	public PreparacaoMedicacao getPreparacao() {
		return Preparacao;
	}


	public void setPreparacao(PreparacaoMedicacao preparacao) {
		Preparacao = preparacao;
	}


	public ArrayList<Enfermeiro> getEnfermeiro() {
		return Enfermeiro;
	}


	public void setEnfermeiro(ArrayList<Enfermeiro> enfermeiro) {
		Enfermeiro = enfermeiro;
	}

	

	
    
    
}


