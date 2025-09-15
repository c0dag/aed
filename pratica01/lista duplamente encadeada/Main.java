public class Main {
    public static void main(String[] args) {
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");

        Produto p1 = new Produto("Arroz", 10.5);
        Produto p2 = new Produto("Feijão", 8.0);
        Produto p3 = new Produto("Macarrão", 5.5);

        lista.addInicio(p1);
        lista.addFinal(p2);
        lista.addIndex(1, p3);

        System.out.println();
        lista.imprimeLista();

        System.out.println();
        lista.removeIndex(1);
        lista.imprimeLista();


        Produto p4 = new Produto("Farinha", 4.0);
        Produto p5 = new Produto("Açúcar", 3.5);
        lista.addInicio(p4);
        lista.addFinal(p5);
        System.out.println();
        lista.imprimeLista();
    }
}

