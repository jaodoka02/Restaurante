package restaurante.atendimento;

public class Atendente {
    public void servirMesa() {
		pegarPratoCozinha();
		System.out.println("servindo mesa");
	}
	
	private void pegarPratoCozinha() {
		System.out.println("pegando prato");
	}
	public void receberPagamento() {
		System.out.println("recebendo pagamnto");
	}
	public void trocarGaz() {
		System.out.println("trocando o gaz");
	}
}
