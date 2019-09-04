package HERANÇA;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p =new Pessoa("joao","pouso redondo");
		
		Pessoa p2 =new Pessoa("joao");
		
		
		System.out.println(p);
		
		PessoaFisica pf= new PessoaFisica("joao","pouso redondo");
		pf.setCpf("048.503.659-96");
		pf.setEstado_civil("namorando");
		
		System.out.println(pf);
		
	}

}
