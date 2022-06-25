package veiculo;

import java.util.Scanner;

import metodoVeiculo.Veiculo;

public class VeiculoExec {
	
	public static void main(String[] args) {
		
		Veiculo a = new Veiculo();
		Veiculo b =  new Veiculo();
		
		entrada(a);
		System.out.println(a);
		
		entrada(b);
		System.out.println(b);
		
		}
		public static void entrada(Veiculo dados) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite a capacidade do tanque do veiculo em Litros: ");
			dados.capacidade = sc.nextDouble();
			System.out.println("Digite a taxa de consumo de combustivel do veiculo em Km/L: ");
			dados.consumo = sc.nextDouble();
			System.out.println("Digite a quantidade de passageiros: ");
			dados.passageiro = sc.nextInt();
			System.out.println("Digite a quilometragem a ser percorrida na viagem: ");
			dados.quilometro = sc.nextDouble();
			System.out.println("Digite o preço do litro de combustivel: ");
			dados.combustivel = sc.nextDouble();
	}
}
