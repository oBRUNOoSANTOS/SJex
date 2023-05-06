using System;

public class senha
{
    public void verificarsn()
    {
        string sn = Console.ReadLine();

        if (sn == "muito pika")
        {
            int opcmn = 0;
            while (opcmn != 10)
            {
                Apresentar apresentar = new Apresentar();
                apresentar.mostrarOpcao();

                Console.WriteLine("Digite a opção que deseja: ");

                opcmn = Convert.ToInt32(Console.ReadLine());

                Console.Clear();

                OpcMenu opc = new OpcMenu();
                opc.opcmenu(opcmn);
            }
        }
        else
        {
            Console.WriteLine("voce não pode acessar o programa, tente novamente!");
        }

    }


}