using System;

public class Aumentar
{
    public void aumentar()
    {
        DadosProdutos aumt = new DadosProdutos();
        Produtos[] listaProdutos = aumt.listadeprodutos();

        int esca = Convert.ToInt32(Console.ReadLine());

        switch (esca)
        {
            case 0:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[0].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[0].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[0].getQuantidade("muito pika"));
                break;
            case 1:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[1].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[1].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[1].getQuantidade("muito pika"));
                break;
            case 2:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[2].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[2].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[2].getQuantidade("muito pika"));
                break;
            case 3:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[3].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[3].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[3].getQuantidade("muito pika"));
                break;
            case 4:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[4].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[4].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[4].getQuantidade("muito pika"));
                break;
            case 5:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[5].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[5].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[5].getQuantidade("muito pika"));
                break;
            case 6:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[6].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[6].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[6].getQuantidade("muito pika"));
                break;
            case 7:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[7].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[7].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[7].getQuantidade("muito pika"));
                break;
            case 8:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[8].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[8].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[8].getQuantidade("muito pika"));
                break;
            case 9:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[9].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[9].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[9].getQuantidade("muito pika"));
                break;
            case 10:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[10].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[10].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[10].getQuantidade("muito pika"));
                break;
            case 11:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[11].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[11].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[11].getQuantidade("muito pika"));
                break;
            case 12:
                Console.WriteLine("Estoque antes da venda " + listaProdutos[12].getQuantidade("muito pika"));
                Console.Write("Escreva quantos produtos foram vendidos: ");
                listaProdutos[12].aumentarEstoque(Convert.ToInt32(Console.ReadLine()));
                Console.WriteLine("A quantidade atual do estoque é: " + listaProdutos[12].getQuantidade("muito pika"));
                break;
            default:

                break;
        }
    }
}

