//import carrinho.Carrinho;
import java.util.ArrayList;

import cliente.Cliente;

public class CarrinhoTeste {
    public static void main(String[] args) {
        //Carrinho carrinho = new Carrinho();
        Cliente cliente = new Cliente();
        ArrayList<String> lista_carrinho = new ArrayList<String>();

        lista_carrinho.add("Matheus");
        lista_carrinho.add("Paulo");
        lista_carrinho.add("Izaque");

        System.out.println(lista_carrinho);

        cliente.setNome("joao");

        System.out.println(cliente);
    }
}
