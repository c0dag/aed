public class Lista<T>{
    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Lista(){
        this("Lista");
    }

    public Lista(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    private boolean isEmpty(){
        return this.primeiroNo == null;
    }
    
    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if (isEmpty()){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(this.primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void addFim(T dado){
        No<T>novoNo = new No<T>(dado);
        if (ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            this.ultimoNo.setNextNo(novoNo);
            this.ultimoNo = novoNo;
        }
    }

    public void imprimeLista(){
        if(isEmpty()){
            System.out.println("Lista vazia");
        }else{
            System.out.println(this.nomeLista);
            No<T> aux = primeiroNo;
            while(aux != null){
                System.out.println(aux.getDado());
                aux=aux.getNextNo();
            }
        }
    }
}