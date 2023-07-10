

import restaurante.atendimento.Atendente;
import restaurante.atendimento.cozinha.Cozinheiro;
import restaurante.área.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
		//ações que não rpecisam estar disponíveis
		Cozinheiro cozinheiro = new Cozinheiro();
		//cozinheiro.baterSuco();
		//cozinheiro.fritarIngredientesPrato();
		//cozinheiro.pedirIngredientes(almoxarife));
		
		
		//ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarCombo();
		cozinheiro.adicionarPrato();
		cozinheiro.adicionarSuco();
	
	
	//Almoxarife almoxarife = new Almoxarife();
	//ações que não rpecisam estar disponíveis
	//almoxarife.controlarsaida();
	//ações que somente a cozinha precisa conhecer
	//almoxarife.trocarGaz();
	//almoxarife.entregarIngredientes();
	
	Atendente atendente = new Atendente();
	atendente.servirMesa();
	atendente.receberPagamento();
	//ação que somente o pacote cozinha deve ver
	//atendente.trocarGaz();
	
	Cliente cliente = new Cliente();
	cliente.fazerPedido();
	cliente.escolhePrato();
	cliente.pedirConta();
	
	//ação sigilosa
	//cliente.consultarSaldo();
	
	//imaginem clientes ouvindo o cozinheiro
	//cozinheiro.pedirTrocarGaz(atendente);
	
	}
}
