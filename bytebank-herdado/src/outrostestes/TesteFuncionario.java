package outrostestes;
public class TesteFuncionario {

	public static void main(String[] args) {
			
		
		
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(2222);
		
		SistemaInterno sistemaIn = new SistemaInterno();
		sistemaIn.autentica(gerente);
		sistemaIn.autentica(administrador);
		
		
		
	}

}
