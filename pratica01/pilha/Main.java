public class Main{
    public static void main(String [] args){
        Pilha<String> pilha = new Pilha<String>("Linguagens de Programação");

        System.out.println(pilha.getNome());

        pilha.push("Elixir");
        pilha.push("Holy C");
        pilha.push("Bash");

        pilha.imprimePilha();
        System.out.println();
        pilha.pop();
        pilha.imprimePilha();

        System.out.println();
        pilha.push("G");
        pilha.push("C");
        pilha.imprimePilha();

    }
}