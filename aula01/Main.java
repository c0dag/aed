import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Pessoa p1 = new Pessoa ("abu", 2147483647);
        // Pessoa p7 = new Pessoa ("abu", 2147483645);
        // Pessoa p9 = new Pessoa ("abu", 2147483646);

        // System.out.println(p1.toString());

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        // pessoas.add(p1);
        // pessoas.add(p7);
        // pessoas.add(p9);
        pessoas.add(new Pessoa("Ludas",99));
                

        // System.out.println(pessoas);
        // System.out.println(new ArrayList<Pessoa>() {{add(new Pessoa("Ludas", 329));}});
        for (Pessoa auxP : pessoas){
            System.out.println(auxP.toString());
        }
    } 
}