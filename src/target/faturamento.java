package target;

import java.util.Locale;

public class faturamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
			
		double[] faturamento = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 
				48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};	
		
		
		double menor = 999999999;
		double maior = 0;
		double soma = 0;
		double media = 0;
		int dia = 0;
			 
    	 for (int y = 0; y < faturamento.length; y++) {
				if(faturamento[y] > maior){
					maior = faturamento[y];
				}
		}
    	 
    	 
		 for (int i = 0; i < faturamento.length; i++) {
				if(faturamento[i] < menor && faturamento[i] > 0 ){
					menor = faturamento[i];
				}
		}
		
		 for ( int j = 0; j < faturamento.length; j++) {
			 soma += faturamento[j];
		 }
		 
		 media = soma / faturamento.length - 9; 
		 
		 for ( int x = 0; x < faturamento.length; x++) {
			 if (faturamento[x] >= media) {
				 dia += 1;
			 }
		 }
		 
		
		System.out.println("O maior Valor: " + maior);
		System.out.println("O menor valor: " + menor);
		System.out.println("O valor da media " + String.format("%.4f", media));
		System.out.println("Numero de dias do mes que foi superior a media: " + dia);
		
	}	
 }



