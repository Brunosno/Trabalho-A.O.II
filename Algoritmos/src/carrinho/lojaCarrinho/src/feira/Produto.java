package feira;

public class Produto {

    Integer precoEmCentavos;
    Integer quantidadeEmEstoque;
    Integer faturamento;
    String nome;

    void setNome(String nome){
        this.nome = nome;
    }

    void setPreco(Double preco){
        this.precoEmCentavos = preco.intValue();
    }

    void setQuantidade(Integer quantidade){
        if (quantidade > 0){
            this.quantidadeEmEstoque = quantidade;
    }
        else{
            System.out.println("O preço do produto deve ser maior que zero");
        }
    }

    void vender(Integer quantidade){
        if (quantidade <= quantidadeEmEstoque){
            this.quantidadeEmEstoque = this.quantidadeEmEstoque - quantidade;
            this.faturamento = this.faturamento + (quantidade * this.precoEmCentavos);
        }
    }

    void verFaturamento(Integer quantidade){
        this.faturamento = this.faturamento + (quantidade * (precoEmCentavos.intValue() / 100) );
    }
}
