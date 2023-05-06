using System;

public class DadosProdutos
{
    public Produtos[] listadeprodutos()
    {
        Produtos[] produtos = new Produtos[13];

        produtos[0] = new Produtos("Brigadeiro", "7 dias", "Bolinha de chocolate com granulado", 1.50, 30);
        produtos[1] = new Produtos("Bolinho de chuva", "2 dias", "Bolinho com açucar e canela/ vendido em 5 unidades", 0.2, 10);
        produtos[2] = new Produtos("Doce de abóbora", "4 dias", "Docinho de festa junina", 2.00, 13);
        produtos[3] = new Produtos("Empadão de frango com requeijão", "5 dias", "Tortinha de frango", 3.00, 10);
        produtos[4] = new Produtos("Gelatina fantasia", "10 dias", "Gelatina dos sonhos", 2.50, 20);
        produtos[5] = new Produtos("Mousse de maracujá", "4 dias", "Mousse pra te deixar calminho", 2.50, 20);
        produtos[6] = new Produtos("Mousse de abacaxi", "4 dias", "Mousse pra te deixar alegre", 2.50, 20);
        produtos[7] = new Produtos("Mousse de chocolate", "4 dias", "Mousse para curar a tristeza", 2.50, 20);
        produtos[8] = new Produtos("Pudim de leite", "3 dias", "pudimmmmm", 2.50, 14);
        produtos[9] = new Produtos("Risole de frango", "5 dias", "Salgadinho para festa", 2.00, 30);
        produtos[10] = new Produtos("Risole de camarão", "5 dias", "Salgadinho para festa", 2.00, 30);
        produtos[11] = new Produtos("Sanduíche", "5 dias", "Sanduichinho", 3.00, 30);
        produtos[12] = new Produtos("Cesta de café da manhã", "15 dias", "Cesta para deixar seu amado(a) contente", 20.00, 10);

        return produtos;
    }

}

	 