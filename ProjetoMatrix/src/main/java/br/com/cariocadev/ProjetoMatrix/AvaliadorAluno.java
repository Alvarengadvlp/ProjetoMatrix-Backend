package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

	public boolean testeEntrada(BigDecimal nota1) {
		BigDecimal zero = new BigDecimal("0");
		BigDecimal dez = new BigDecimal("10");
		if(nota1 == null)
			return true;
		if( (nota1.compareTo(dez) == 1) || (nota1.compareTo(zero) == -1))
			 return true;
		
		return false;
		
		}


	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		if (notas == null)
				throw new IllegalArgumentException();
		if((testeEntrada(notas[0])) || (testeEntrada(notas[1])) || (testeEntrada(notas[2])))
			throw new IllegalArgumentException();
			
		BigDecimal maior = new BigDecimal("0");
		maior = notas[0];
		if (maior.compareTo(notas[1]) == -1 )
			maior = notas[1];
		if (maior.compareTo(notas[2]) == -1 )
			maior = notas[2];

		return maior;
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		if ((testeEntrada(nota1)) || (testeEntrada(nota2)) || (testeEntrada(nota3)))
			throw new IllegalArgumentException();
		
		BigDecimal soma2 = nota3.add(nota1.add(nota2));
		BigDecimal media = soma2.divide(new BigDecimal("3"), 2, BigDecimal.ROUND_HALF_UP);
		return media;
			
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		if ((testeEntrada(nota1)) || (testeEntrada(nota2)) || (testeEntrada(nota3)))
			throw new IllegalArgumentException();
		
		BigDecimal media = getMedia(nota1, nota2, nota3);
		BigDecimal number4 = new BigDecimal("4");
		BigDecimal number6 = new BigDecimal("6");
		
		if (media.compareTo(number4) == -1 )
			return "REPROVADO";
		else 
			if((media.compareTo(number4) == 0) || (media.compareTo(number4) == 1) && (media.compareTo(number6) == -1)) 
				return"PROVA_FINAL";
			else 
				return "APROVADO";
			
	}
			
	}



