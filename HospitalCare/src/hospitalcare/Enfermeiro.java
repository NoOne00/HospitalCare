package hospitalcare;

public class Enfermeiro {
	
	private String nome;
	
	private PrescricaoVerbal prescricaoVerbal;

	public Enfermeiro(String nome, PrescricaoVerbal prescricaoVerbal) {
		super();
		this.nome = nome;
		this.prescricaoVerbal = prescricaoVerbal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PrescricaoVerbal getPrescricaoVerbal() {
		return prescricaoVerbal;
	}

	public void setPrescricaoVerbal(PrescricaoVerbal prescricaoVerbal) {
		this.prescricaoVerbal = prescricaoVerbal;
	}
	
	

}
