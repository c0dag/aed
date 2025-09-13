public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> nextNo;
    private NoDuplo<T> previousNo;
    private int index;
// , int index
    public NoDuplo(T dado){
        this.dado = dado;
        this.index = index;
        this.nextNo = null;
        this.previousNo = null;
    }
    
    // public NoDuplo(T dado, No<T> nextNo){
    //     this.dado = dado;
    //     this.nextNo = nextNo;
    // }

    public T getDado(){
        return this.dado;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public NoDuplo<T> getNextNo(){
        return this.nextNo; 
    }

    public void setNextNo(NoDuplo<T> nextNo){
        this.nextNo = nextNo;
    }

    public NoDuplo<T> getPreviousNo(){
        return this.previousNo;
    }

    public void setPreviousNo(NoDuplo<T> previousNo){
        this.previousNo = previousNo;
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
        
    }

    @Override
    public String toString(){
        return "{Indice: " + getIndex() + "Dado: " + getDado() + "}";
    }
}