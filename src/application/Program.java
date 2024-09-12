package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill b1 = new Bill();
		
		System.out.println("Sexo: ");
		b1.gender = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas: ");
		b1.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		b1.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		b1.barbecue = sc.nextInt();
		
		System.out.println("RELATORIO: ");
		System.out.printf("Consumo = R$ %.2f\n", b1.feeding());
		if(b1.cover() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f\n", b1.cover());
			}
		System.out.printf("Ingresso = R$ %.2f\n", b1.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f\n",b1.total());
		
		
		
		sc.close();
	}

}
