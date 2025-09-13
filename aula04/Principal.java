public class Principal{
    public static void main(String[] args) {
        
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");

        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.addInicio("Gabriel");
        lista.imprimeLista();
        lista.addFinal("Daniel");
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
    }
}