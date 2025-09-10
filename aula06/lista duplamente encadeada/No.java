public class NoDuplo<T>{
    private T dado;
    private NoDuplo<T> nextNo;
    private NoDuplo<T> previousNo;
    private int index;

    public NoDuplo(T dado, int index){
        this.dado = dado;
        this.index = index;
        this.nextNo = null;
        this.previousNo = null;
    }
    
    public NoDuplo(T dado, No<T> nextNo){
        this.dado = dado;
        this.nextNo = nextNo;
    }

}