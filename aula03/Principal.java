public class Principal{
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>("Aluno");
        lista.imprimeLista();
        lista.addFim("Carlos");
        lista.addInicio("Beletate");
        lista.addInicio("Glauber");
        lista.addInicio("Eduardo");
        lista.imprimeLista();

    }    
}