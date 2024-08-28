package br.com.sistema.cmd;

import java.util.Scanner;

public class holerite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		salariobruto salario = new salariobruto();
		valetransporte vale = new valetransporte();
		inss aposentadoria = new inss();
		descontos irrf = new descontos();
		salarioliquido liquido = new salarioliquido();
		dadospessoais dados = new dadospessoais();
		
		System.out.println("Insira seu salário: ");
		salario.setSalario(scan.nextDouble());
		
		System.out.println("Você recebe vale transporte? (1 - SIM | 2 - NÃO)");
		vale.setVale(scan.nextDouble());
		
		System.out.println("Primeiro Nome: ");
		dados.setPrimeironome(scan.next());
		
		System.out.println("Segundo Nome: ");
		dados.setSegundonome(scan.next());
		
		System.out.println("CPF: ");
		dados.setCpf(scan.next());
		
		System.out.println("Função: ");
		dados.setFuncao(scan.next());
		
		System.out.println("Endereço: ");
		dados.setEndereco(scan.next());
		
		System.out.println("Cidade: ");
		dados.setCidade(scan.next());
		
		System.out.println("Estado: ");
		dados.setEstado(scan.next());
		
		System.out.println("Matrícula: ");
		dados.setMatricula(scan.next());
		
		System.out.println("PIS: ");
		dados.setPis(scan.next());
		
		vale.setVt(salario.getSalario());
		aposentadoria.setInss(salario.getSalario());
		irrf.setIrrf(salario.getSalario());
		liquido.setVt(vale.getResultado());
		liquido.setBruto(salario.getSalario());
		liquido.setDescontos(irrf.getCalculo());
		liquido.setInss(aposentadoria.getConta());

		
		System.out.println("O desconto do INSS é: " + aposentadoria.getConta());
		System.out.println("O desconto do vale transporte é: " + vale.getResultado());
		System.out.println("O desconto do IRRF é: " + irrf.getCalculo());
		System.out.println("O valor líquido é: " + liquido.getValorliquido());
			
	}
}
