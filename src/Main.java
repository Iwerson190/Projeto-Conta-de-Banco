
public class Main {

	public static void main(String[] args) {
		
		Cliente fernando = new Cliente();
		fernando.setNome("Fernando");
		
		Conta cc = new ContaCorrente(fernando);
		cc.depositar(500);
		
		Conta cp  = new ContaPoupanca(fernando);
		cc.transferir(250, cp);
		
		cc.ImprimirExtrato();
		cp.ImprimirExtrato();

	}

}
