public class ListaCircular<T>{
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeListaCircular;
    private int tamanho;

    public ListaCircular(String nomeLista){
        this.nomeListaCircular = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public int tamanhoLista(){
        return this.tamanho;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
            primeiroNo.setNextNo(primeiroNo);

        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
            ultimoNo.setNextNo(primeiroNo);
        }
         tamanho++;
    }

    public void addFim(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null){
            ultimoNo = novoNo;
            primeiroNo = novoNo;
            ultimoNo.setNextNo(ultimoNo);
        } else {
            ultimoNo.setNextNo(novoNo);
            novoNo.setNextNo(primeiroNo);
            ultimoNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia. Nada a remover");
        } else {
            if(primeiroNo.getNextNo() == primeiroNo){
                primeiroNo = null;
                ultimoNo = null;
            } else {
                ultimoNo.setNextNo(primeiroNo.getNextNo());
                primeiroNo = primeiroNo.getNextNo();
            }
        }
        tamanho --;
    }

    public void removeFim(){

    }

}
