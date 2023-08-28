//Para ler e escrever dados em C#, utilizamos os seguintes metodos da classe console:
// - Console.ReadLine: Le uma linha com daddos de entradas inputs do ususario
// - Console.WriteLine imprime um texto de saida (outpu) e pulano linha

using System;

public class Desafio
{
    public static void Main(string[] args)
    {
        float ValorSalario = float.Parse(Console.ReadLine());
        float ValorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (ValorSalario >= 0 && ValorSalario <= 1100)
        {
            valorImposto = 0.05F * ValorSalario;
        }
        else if (ValorSalario >= 1100.01 && ValorSalario <= 2500.00)
        {
            valorImposto = 0.10F * ValorSalario;
        }
        else
        {
            valorImposto = 0.15F * ValorSalario;
        }
        float saida = ValorSalario - valorImposto + ValorBeneficios;
        Console.WriteLine(saida.ToString("0.00");
    }
}