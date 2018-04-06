package hospitalcare;

import java.util.ArrayList;

public class PrescricaoVerbal {
	
	private AutorizacaoPrescricao autorizacaoPrescricao;
	ArrayList <Enfermeiro> Enfermeiro;
	

	public PrescricaoVerbal(AutorizacaoPrescricao autorizacaoPrescricao,
			ArrayList<hospitalcare.Enfermeiro> enfermeiro) {
		super();
		this.autorizacaoPrescricao = autorizacaoPrescricao;
		Enfermeiro = enfermeiro;
	}


	public AutorizacaoPrescricao getAutorizacaoPrescricao() {
		return autorizacaoPrescricao;
	}


	public void setAutorizacaoPrescricao(AutorizacaoPrescricao autorizacaoPrescricao) {
		this.autorizacaoPrescricao = autorizacaoPrescricao;
	}


	public ArrayList<Enfermeiro> getEnfermeiro() {
		return Enfermeiro;
	}


	public void setEnfermeiro(ArrayList<Enfermeiro> enfermeiro) {
		Enfermeiro = enfermeiro;
	}

}
