public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;

        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo.setPreviousNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            novoNo.setPreviousNo(ultimoNo);
            ultimoNo = novoNo;
        }
        ultimoNo.setIndex(tamanho);
        tamanho++;
    }
    public void addIndex(int index, T dado) {
        if (index <= 0) {
            addInicio(dado);
        } else if (index >= tamanho) {
            addFinal(dado);
        } else {
            NoDuplo<T> aux = primeiroNo;
            for (int i = 0; i < index - 1; i++) {
                aux = aux.getNextNo();
            }
            NoDuplo<T> novoNo = new NoDuplo<T>(dado);
            NoDuplo<T> next = aux.getNextNo();
            aux.setNextNo(novoNo);
            novoNo.setPreviousNo(aux);
            novoNo.setNextNo(next);
            if (next != null) {
                next.setPreviousNo(novoNo);
            }
            atualizaIndice();
            tamanho++;
        }
    }
    public T removeIndex(int index) {
        if (index < 0 || index >= tamanho || primeiroNo == null) {
            System.out.println("Índice inválido ou lista vazia");
            return null;
        }
        NoDuplo<T> aux = primeiroNo;
        for (int i = 0; i < index; i++) {
            aux = aux.getNextNo();
        }
        T dado = aux.getDado();
        NoDuplo<T> prev = aux.getPreviousNo();
        NoDuplo<T> next = aux.getNextNo();
        if (prev != null) {
            prev.setNextNo(next);
        } else {
            primeiroNo = next;
        }
        if (next != null) {
            next.setPreviousNo(prev);
        } else {
            ultimoNo = prev;
        }
        atualizaIndice();
        tamanho--;
        return dado;
    }

    public void atualizaIndice(){
        NoDuplo<T> aux = primeiroNo;
        int index = 0;
        while(aux != null){
            aux.setIndex(index); 
            aux = aux.getNextNo();
            index++;
        }
    }
    // public void atualizaIndice2(){
    //     No<T> aux = ultimoNo;
    //     int index = tamanho-1;
    //     while(aux != null){
    //         aux.setIndex(index); 
    //         aux = aux.getPreviousNo();
    //         index--;
    //     }
    // }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getNextNo();
            }
        }

    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        } else {
            System.out.println();
            // T temp;
            primeiroNo = primeiroNo.getNextNo();
            if(primeiroNo != null){
                primeiroNo.setPreviousNo(null);
            } else{
                ultimoNo = null;
            }
        }
        atualizaIndice();
        tamanho--;
        
    }

    public void removeFinal(){
        if (ultimoNo == null ){
            System.out.println("vazialista");
        }else{
            ultimoNo = ultimoNo.getPreviousNo();
            if(ultimoNo != null){
                ultimoNo.setNextNo(null);
            } else{
                primeiroNo = null;
            }
            tamanho--;
        }
    }
}
