package entities;

import model.contract.AparelhoTelefonico;
import model.contract.NavegadorNaInternet;
import model.contract.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

	@Override
	public void ligar() {
		System.out.println("Telefonando");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página web");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba criada");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a música");		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");		
	}

}
