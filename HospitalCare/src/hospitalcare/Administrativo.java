package hospitalcare;

public class Administrativo {
	
	private ServicoEnfermeiro servicoEnfermeiro;
	private EntradaHospital entradaHospital;
	
	private String nome;

	public Administrativo(ServicoEnfermeiro servicoEnfermeiro, EntradaHospital entradaHospital, String nome) {
		super();
		this.servicoEnfermeiro = servicoEnfermeiro;
		this.entradaHospital = entradaHospital;
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public ServicoEnfermeiro getServicoEnfermeiro() {
		return servicoEnfermeiro;
	}


	public void setServicoEnfermeiro(ServicoEnfermeiro servicoEnfermeiro) {
		this.servicoEnfermeiro = servicoEnfermeiro;
	}


	public EntradaHospital getEntradaHospital() {
		return entradaHospital;
	}


	public void setEntradaHospital(EntradaHospital entradaHospital) {
		this.entradaHospital = entradaHospital;
	}
	
	
	
	

	

}
