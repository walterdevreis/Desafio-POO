package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Iphone;

/**
 *  @author Walter Reis
 *	@version 1.0
 *  @since 15/10/2023
 */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Iphone iphone = new Iphone();
		
		iphone.ligar();
		System.out.println("-------------------------------------------------");
		
		iphone.atender();
		System.out.println("-------------------------------------------------");
		
		iphone.iniciarCorreioVoz();
		System.out.println("-------------------------------------------------");
		
		iphone.exibirPagina();
		System.out.println("-------------------------------------------------");
		
		iphone.atualizarPagina();
		System.out.println("-------------------------------------------------");
		
		iphone.adicionarNovaAba();
		System.out.println("-------------------------------------------------");
		
		iphone.selecionarMusica();
		System.out.println("-------------------------------------------------");
		
		iphone.tocar();
		System.out.println("-------------------------------------------------");
		
		iphone.pausar();		
		
		sc.close();
	}
}
