public class Fila<T> {
    private No<T> primeirNo;
    private No<T> ultimoNo;
    private String nome;

    public Fila(){
        this("");
    }

    public Fila(String nome){
        this.nome = nome;
        primeirNo = null;
        ultimoNo = null;
    }

    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);

        if(ultimoNo == null){
            ultimoNo = novoNo;
            primeirNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar(){
        if(primeirNo == null){
            return null;
        }
        No<T> tempNo = primeirNo;
        primeirNo = primeirNo.getNextNo();
        if(primeirNo == null){
            ultimoNo = null;
        }
        return tempNo.getDado();
    }

    public void imprimeFila(){
        if(primeirNo == null){
            System.out.println("vazia");
        }  
        No<T> aux = primeirNo;
        while(aux != null){
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
    }

    public String getNome(){
        return this.nome;
    }

}