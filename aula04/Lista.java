public class Lista<T> {

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

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.println("Removendo o dado: " + primeiroNo.getDado());
            if(primeiroNo == ultimoNo){
                primeiroNo = null; 
                ultimoNo = null;
            }else{
                primeiroNo = primeiroNo.getNextNo();
            }
        }
    }
    
    public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else {
            System.out.println("Removendo o dado: " + ultimoNo.getDado());
            if(primeiroNo == ultimoNo){
                primeiroNo = null; 
                ultimoNo = null;
            }else{
                No<T> aux = primeiroNo;
                while(aux.getNextNo() != ultimoNo){
                    aux = aux.getNextNo();
                }
                aux.setNextNo(null);
                ultimoNo = aux;
            }
        }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if(ultimoNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.println("Dados da lista " + nomeLista);
            No<T> aux = primeiroNo;
            while(aux != null){
                System.out.println(aux.getDado());
                aux = aux.getNextNo();
            }
        }
    }
}