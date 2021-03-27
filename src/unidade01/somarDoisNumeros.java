package unidade01;
import java.util.*;
class somarDoisNumeros {
	public static Scanner entrada = new Scanner(System.in);
	public static void main (String args[]) {
		//Declarando variaveis
		int num1,num2,soma;
		
		//Leitura
		
		System.out.println("Digite um numero");
		num1 = entrada.nextInt();
		System.out.println("Digite outro numero");
		num2 = entrada.nextInt();
		
		//Somar 
		soma = num1 + num2;
		System.out.println("Soma :" + soma);
				
		
	}

}
