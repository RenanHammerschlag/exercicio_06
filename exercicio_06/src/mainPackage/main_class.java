package mainPackage;

import java.util.Scanner;

public class main_class {
//	1. Faça um programa que leia o preço de 10 produtos. Ao final
//	escreva o somatório dos preços.
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		int preodutos=0;
//		double preco, count = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Porduto [" + (i+ 1) +"]");
//			System.out.println("Preço: ");
//			preco = sc.nextDouble();
//			count += preco;
//		}
//		System.out.println(count);
//		sc.close();
//	}
	
//	2. Faça um programa que calcule e escreva no vídeo o somatório
//	dos números inteiros de 1 até 50.
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num = 0, num2 = 0;
//		
//		for(int i = 0; i <= 50; i++) {
//			num += i ;
//			num2 ++;
//		}
//		System.out.println(num);
//		System.out.println(num2);
//		
//		sc.close();
//	}
	
//	3. Faça um programa que leia a idade de 10 pessoas. Ao final
//	escreva a média das idades.

//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int idade = 0, somaidades = 0;
//		double media;
//		
//		for(int i = 0 ; i < 10; i++) {
//			idade = sc.nextInt();
//			somaidades += idade;
//		}
//		media = somaidades/10;
//		System.out.println(media);
//		sc.close();
//	}
	
////	4. Elabore um programa que leia o sexo de um número indeterminado
////	de pessoas. Ao final escreva a quantidade de pessoas
////	cadastradas e o total de pessoas de cada sexo.
//	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		String sexo = null;
//		
//		int qtd_Masc = 0, qtd_Fem = 0;
//		int continuar = 0;
//		
//		do {
//			System.out.println("Informe o sexo: (M - masculino; F - feminino");
//			sexo = sc.next();
//			if(sexo.equalsIgnoreCase("m")) {
//				qtd_Masc ++;
//			}else if(sexo.equalsIgnoreCase("F")){
//				qtd_Fem ++;
//			}
//			System.out.println("Continuar? (1 - sim)");
//			continuar = sc.nextInt();
//		}while(continuar == 1);
//		
//		System.out.println("Masculino: "+ qtd_Masc);
//		System.out.println("Feminino: "+ qtd_Fem);
//		
//		sc.close();
//	}
	
//	5. Crie um programa que leia a altura de um número indeterminado
//	de pessoas. Ao final o programa deve informar o total de pessoas
//	cadastradas, a quantidade de pessoas com altura inferior a 1,60
//	metros; a quantidade de pessoas com altura entre 1,60 metros e
//	1,80 metros e a quantidade de pessoas com altura superior a
//	1,80 metros.
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int continuar = 0;
		double altura;
		int qtd_maior = 0, qtd_entre = 0, qtd_menor = 0;
		do {
			
			System.out.println("Informe sua altura em CM");
			altura=sc.nextDouble();
			
			if(altura >= 180) {
				qtd_maior ++;
			}else if(altura > 160 && altura < 180) {
				qtd_entre ++;
			}else if(altura <= 160) {
				qtd_menor ++;
			}
			
			
			System.out.println("Continuar? (1 - sim)");
			continuar = sc.nextInt();
		}while(continuar == 1);
		
		System.out.println("Maiores de 180 : " + qtd_maior);
		System.out.println("Na media: " + qtd_entre);
		System.out.println("Menores de 160 : " + qtd_menor);
		sc.close();
	}
	
//	6. Elabore um programa que leia a idade de diversas pessoas e ao
//	final informe: o total de pessoas cadastradas, a porcentagem
//	de pessoas com idade inferior a 18 anos, a porcentagem de
//	pessoas com idade igual ou superior a 18 anos.
//	
//	7. Faça um programa que leia vários números inteiros e ao final
//	escreva o maior.
//	
//	8. Crie um programa que leia o nome e a altura de 10 pessoas e ao
//	final escreva: a altura média do grupo, o nome e a altura da
//	pessoa mais alta.
//	
//	9. A conversão de graus Farenheit para graus centígrados é obtida
//	por : C = 5/9 * (F -32). Faça um programa que calcule e escreva
//	uma tabela de centígrados em função de graus Farenheit, que
//	variam de 100 a 150 de 1 em 1.
//	
//	10.Elabore um programa que leia diversos números e ao final
//	escreva: a quantidade de números digitados, a quantidade de
//	números pares, a quantidade de números ímpares.
//	
//	11.Um determinado material radioativo perde metade de sua massa a
//	cada 50 segundos. Dada a massa inicial, em gramas, fazer um
//	algoritmo que determine o tempo necessário para que essa massa
//	se torne menor do que 0.5 gramas. Escreva a massa final, e o
//	tempo. Observação: o usuário deve digitar a massa inicial.
}
