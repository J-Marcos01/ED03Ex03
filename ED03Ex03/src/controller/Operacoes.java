package controller;

public class Operacoes 
{
	public Operacoes() 
	{
		super();
	}

	public String inverteLetras(String palavra,int posRef,int posFinal)
	{
		String novaPalavra="";
		if(posFinal==0) //condição de parada será quando o maior indice (posiçãofinal ) do substring for ==0 retorne a palavra invertida.
		{
			return novaPalavra;
		}
		else
		{
			novaPalavra=palavra.substring(posRef,posFinal);
			return novaPalavra+inverteLetras(palavra,posRef-1,posFinal-1);  //invertendo a chamada da concatenação já obtemos o valor inverso.
			
		}
		
	}
	
}
