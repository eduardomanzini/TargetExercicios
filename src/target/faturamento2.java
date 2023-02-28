package target;

import java.util.Locale;

public class faturamento2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double SP = 67836.43;
		double RJ  = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;
		
		double total = SP + RJ + MG + ES + outros;
		
		
		double porcentualSp = SP / total * 100;
		double porcentualRJ = RJ / total * 100;
		double porcentualMG = MG / total * 100;
		double porcentualES = ES / total * 100;
		double porcentualOutros = outros / total * 100;
		
		
		System.out.println(String.format("%.2f", porcentualSp) + "%");
		System.out.println(String.format("%.2f",porcentualRJ) + "%");
		System.out.println(String.format("%.2f",porcentualMG) + "%");
		System.out.println(String.format("%.2f",porcentualES) + "%");
		System.out.println(String.format("%.2f",porcentualOutros) + "%");
		
	}

}
