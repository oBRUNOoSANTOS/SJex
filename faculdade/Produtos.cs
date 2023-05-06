using System;

public class Produtos
{
    private String descricao;
    private String nomeProduto;
    private String dataValidade;
    private Double preco;
    private int quantidade;


    public Produtos(String nome, String validade, String descricao, Double preco, int quantidade)
    {
        this.nomeProduto = nome;
        this.descricao = descricao;
        this.dataValidade = validade;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    //método GETTERS
    public String getNomeProduto() { return this.nomeProduto; }
    public String getDescricao() { return this.descricao; }
    public String getDataValidade() { return this.dataValidade; }
    public Double getPreco() { return this.preco; }
    public int getQuantidade() { return this.quantidade; }


    //método SETTERS

    public void setNomeProduto(String nome) { this.nomeProduto = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }
    public void setPreco(Double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }


    public void aumentarEstoque(int qtdEntrando)
    {
        if (qtdEntrando >= this.quantidade)
        {
            this.quantidade = this.quantidade + qtdEntrando;
            Console.WriteLine("Estoque depois da venda " + this.quantidade);
        }
    }

    public void diminuirEstoque(int qtdSaindo)
    {
        if (qtdSaindo <= this.quantidade)
        {
            this.quantidade = this.quantidade - qtdSaindo;
            Console.WriteLine("Estoque depois da venda " + this.quantidade);
        }
        else
        {
            Console.WriteLine("A quantidade excede o estoque do produto");
        }


    }

    public int getQuantidade(string senha)
    {
        if (senha == "muito pika")
        {
            return this.quantidade;
        }
        else
        {
            Console.WriteLine("vc não tem acesso ao sistema de deseovlvedor");
            return -256;
        }

    }

    public void fatProdutos()
    {

    }

}
