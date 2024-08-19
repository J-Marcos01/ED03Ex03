package view;

import controller.Operacoes;
import java.util.Scanner;
public class Principal 
{

	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		Scanner sc=new Scanner(System.in);
		String palavra = sc.next();
		int tamanho =palavra.length();
		String res=op.inverteLetras(palavra,tamanho-1,tamanho);
		System.out.println(res);
		
	}

}
