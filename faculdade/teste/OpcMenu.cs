using System;

public class OpcMenu
{
    public void opcmenu(int opcmn)
    {
        DadosProdutos dprodutos = new DadosProdutos();
        Produtos[] listaProdutos = dprodutos.listadeprodutos();
        Aumentar esca = new Aumentar();
        Diminuir escd = new Diminuir();


        switch (opcmn)
        {
            case 1:
                Console.WriteLine("Você acessou a lista de produtos");

                int y = 0;
                while (y != 13)
                {
                    Console.WriteLine("Nome do produto: " + listaProdutos[y].getNomeProduto());
                    Console.WriteLine("");
                    Console.WriteLine("Preço do produto: " + listaProdutos[y].getPreco());
                    Console.WriteLine("");
                    Console.WriteLine("Quantidade em estoque: " + listaProdutos[y].getQuantidade());
                    Console.WriteLine("---------------------------------");
                    y++;
                }


                break;



            case 2:
                int i = 0;
                Console.WriteLine("agora vc entrou no modo de aumentar o estoque");

                while (i != 13)
                {


                    Console.WriteLine("opc " + "[" + i + "]" + " " + listaProdutos[i].getNomeProduto());

                    i++;
                }
                Console.Write("Digitite um dos intes para mudar o estoque: ");
                esca.aumentar();

                break;

            case 3:

                int b = 0;
                Console.WriteLine("agora vc entrou no modo de diminuir o estoque");
                while (b != 13)
                {


                    Console.WriteLine("opc " + "[" + b + "]" + " " + listaProdutos[b].getNomeProduto());

                    b++;

                }
                Console.Write("Digitite um dos intes para mudar o estoque: ");

                escd.diminuir();

                break;

            case 4:

                break;

            default:

                Console.WriteLine("Voce esta finalizando o sistema");

                break;

        }
        Console.WriteLine("Aperte qualquer tecla para continuar");
        Console.ReadLine();
        Console.Clear();

    }

}

