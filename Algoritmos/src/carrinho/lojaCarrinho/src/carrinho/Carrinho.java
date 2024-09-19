package carrinho;
import java.util.ArrayList;

public class Carrinho {
    String cliente;
    Double preco;
    Integer quantidade;
    String produto;
    ArrayList <String > Produto;

    public void setProduto(String produto){
        this.produto = produto;
    }
}