package main;

import java.util.Scanner;

import features.TelefoneTranslator;

/**
 * Classe simples de execução da aplicação
 * 
 * Created by Vitor on 29/11/2015.
 * @author Vitor
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tel = sc.nextLine();

		TelefoneTranslator telTrans = new TelefoneTranslator();
		tel = telTrans.translateTelefone(tel);

		System.out.println(tel);
	}
}