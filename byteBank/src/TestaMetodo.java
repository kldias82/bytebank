
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo da conta do Paulo: " + contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Saldo da conta do Paulo: " + contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Saldo da conta da Marcela: " + contaDaMarcela.saldo);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo); 
		if(sucessoTransferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println("Saldo da conta do Paulo: " + contaDoPaulo.saldo);
		System.out.println("Saldo da conta da Marcela: " + contaDaMarcela.saldo);
		
		contaDoPaulo.titular = "Paulo SIlveira";
		System.out.println(contaDoPaulo.titular);
	}
}
