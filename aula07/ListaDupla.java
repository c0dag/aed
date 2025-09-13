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

    public addFinal (T dado){
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

    public void atualizaIndice(){
        No<T> aux = primeiroNo;
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
;;;;;;;;;;;;;;;;System.out.println("%s", aux.toString());
;;;;;;;;;;;;;;;;aux = aux.getNextNo();
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
