package feira;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Tênis");
        produto.setPreco(100.00);

        System.out.println(produto.precoEmCentavos);


    }
}
