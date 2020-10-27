
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 2;
		return super.saca(valorSacar);
	}
	
	@Override
	public void deposita(double valor) {
		
		super.deposita(valor);
	}
	@Override
	public boolean transfere(double valor, Conta destino) {
		double taxaTransferencia = valor + 10.50;
		return super.transfere(taxaTransferencia, destino);
	}
	

	

	

}
