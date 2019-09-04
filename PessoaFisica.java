package HERANÇA;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estado_civil;
	
	
	public PessoaFisica(String nome) {
		super(nome);
	 }
	 
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
		
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length()>=9)
		this.cpf = cpf;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		if(estado_civil.length()>0)
		this.estado_civil = estado_civil;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estado_civil=");
		builder.append(estado_civil);
		builder.append("]");
		builder.append(super.toString());//add o pai ao filho
		return builder.toString();
	}
	
	
}
