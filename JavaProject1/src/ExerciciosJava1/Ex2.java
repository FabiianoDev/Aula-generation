package ExerciciosJava1;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		
		int totalDias, anos, meses, dias;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("A seguir voc� me dir� sua idade em dias:");
		totalDias = entrada.nextInt();
		
		entrada.close();
		
		anos = totalDias/365;
		meses = (totalDias%365)/30;
		dias = (totalDias%365)%30;
		
		System.out.println("Voc� tem: " + anos + " anos, " + meses + " meses e " + dias + " dias");
	}
	
}
