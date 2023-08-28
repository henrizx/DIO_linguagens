//Para ler e escrever dados em java, aqui na DIO padronizamos da seguinte forma:
//- new Scanner(System.in): cria um leitor de entradads, com metodos uteis com prefixo "next";
// - System.out.println: imprime um texto de saida output e pulando uma linha

import java.util.Scanner;

public class Desafio{
  public static void main(String[] args){
    //Lê os valores de entrada:
    Scanner leitorDeEntradas = new Scanner (System.in);
    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();

    flaot ValorImposto = 0f;
;
    if (valorSalario >= 0 && valorSalario <=1100){
      //atribuiu a aliquota de 5% mediante o salario:
      ValorImposto = 0.05F * valorSalario;
    } else if(valorSalario >= 1100.01 && valorSalario <=2500.0){
      ValorImposto = 0.15F * valorSalario;
    }else{
      ValorImposto = 0.15F * valorSalario;
    }
    //TODO criar as demais condições para as aliquotas de 10.00% e 15.00%
    //calcular e imprime a saida (com 2 casas decimais):
    float saida = valorSalario - ValorImposto + valorBeneficios;
    System.out.println(String.format("%.2f", saida));
  }
}