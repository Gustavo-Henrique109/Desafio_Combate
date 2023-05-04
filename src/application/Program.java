package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, name2;
		int life, attack, armor, life2, attack2, armor2, shifts;
		Champion champion;
		Champion champion2;
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		life2 = sc.nextInt();
		System.out.print("Ataque: ");
		attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		armor2 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Quantos turnos você deseja executar? ");
		shifts = sc.nextInt();
		
		for (int i = 1; i <= shifts; i++) {
			
				champion = new Champion(name, life, attack2, armor);
				life = champion.getLife();
				
				champion2 = new Champion(name2, life2, attack, armor2);
				life2 = champion2.getLife();
				
				System.out.println();
				System.out.println("Resultado do turno " + i + ": ");
				System.out.println(champion);
				System.out.println(champion2);
				
				if (life <= 0 || life2 <=0) {
					i = shifts;
				}
		}
		
		System.out.println();
		System.out.print("FIM DO COMBATE");
		
		sc.close();
	}
}
