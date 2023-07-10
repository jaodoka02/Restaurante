package restaurante.área.cliente;
public class Cliente {
    
	public void escolhePrato() {
		System.out.println("Escolhendo prato");
	}
	
	public void fazerPedido() {
		System.out.println("Cliente realizando pedido");
		}
	
	public void pedirConta() {
		System.out.println("solcitando conta");
		}
	public void pagar() {
		consultarSaldo();
		System.out.println("Pagando");
		}
	private void consultarSaldo() {
		System.out.println("Consultando saldo no aplicativo");
		}
}


