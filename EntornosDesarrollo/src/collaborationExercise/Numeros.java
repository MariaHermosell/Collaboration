package collaborationExercise;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero,contador;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el numero(negativo si quieres acabar)");
		numero=sc.nextInt();
		contador=0;
		while(numero>=0) {
			contador=contador+1;//contador++
			System.out.println("por favor, introduce un numero:(negativo si quieres acabar)");
			numero=sc.nextInt();
			
		}
		System.out.println(contador+" Es el numero total de números leidos");

		System.out.println("FIN DEL PROGRAMA");
	}
	}


