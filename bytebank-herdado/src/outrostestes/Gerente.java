package outrostestes;
public class Gerente extends FuncionarioAutenticavel {
	
	public double getBonificacao() {
		System.out.println("Chamado o metodo de bonificação gerente");
		return super.getSalario();
	}

}
