package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.TaxPayer;

public class Mainapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar?");
		Integer num = Integer.parseInt(sc.nextLine());
		
		ArrayList<TaxPayer> vect = new ArrayList<TaxPayer>();
		
		for(int i=0; i<num; i++) {
			System.out.println("Digite os dados do "+(i+1)+" contribuinte:");
			System.out.print("Renda anual com salário: ");
			Double rendaSal = Double.parseDouble(sc.nextLine());
			System.out.print("Renda anual com prestação de serviço: ");
			Double rendaServ = Double.parseDouble(sc.nextLine());
			System.out.print("Renda anual com ganho de capital:");
			Double rendaCap = Double.parseDouble(sc.nextLine());
			System.out.print("Gastos médicos:");
			Double servMed = Double.parseDouble(sc.nextLine());
			System.out.print("Gastos educacionais:");
			Double servEdu = Double.parseDouble(sc.nextLine());
			
			vect.add(new TaxPayer(rendaSal, rendaServ, rendaCap, servMed, servEdu));
		}
		
		for(int i=0; i<vect.size(); i++) {
			System.out.println("\nResumo do "+(i+1)+" contribuinte:");
			System.out.println("Imposto bruto total: "+vect.get(i).grossTax());
			System.out.println("Abatimento: "+vect.get(i).taxRebate());
			System.out.println("Imposto devido: "+vect.get(i).netTaz());
		}
		
		sc.close();
	}

}
