package ExerciciosJava1;

import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		
		int totalSegundos, horas, minutos, segundos;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("A seguir voc� me dir� o tempo de dura��o da atividade em segundos:");
		totalSegundos = entrada.nextInt();
		

		entrada.close();
		
		horas = totalSegundos/3600;
		minutos = (totalSegundos%3600)/60;
		segundos = (totalSegundos%3600)%60;
		
		System.out.println("A atividade levou: \n"+horas+" horas, "+ minutos+" minutos e "+segundos+" segundos.");
		
	}
	

}
