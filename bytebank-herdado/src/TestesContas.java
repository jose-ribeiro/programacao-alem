
public class TestesContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrent = new ContaCorrente(1010, 357);
		contaCorrent.deposita(100.0);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(1011, 357);
		contaPoupanca.deposita(150.0);
		
		contaCorrent.transfere(10.0, contaPoupanca);
		
		
		System.out.println("cc: " + contaCorrent.getSaldo());
		System.out.println("CP: " + contaPoupanca.getSaldo());
		
	}

}
