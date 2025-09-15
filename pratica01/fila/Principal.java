public class Principal {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<String>("Fila de alunos");
        System.out.println(fila.getNome());
        fila.enfileirar("Josezinho");
        fila.enfileirar("Joaozinho");
        fila.enfileirar("Jonaszinho");
        fila.imprimeFila();
        System.out.println();
        System.out.println(fila.getNome());     
        fila.desenfileirar();
        fila.imprimeFila();
        System.out.println();
        fila.enfileirar("Fabio");
        fila.enfileirar("Conrado");
        System.out.println(fila.getNome());     
        fila.imprimeFila();


    }
}