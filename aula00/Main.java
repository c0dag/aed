public class Main{
    public static void main(String [] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("João", 30);
        Pessoa p3 = new Pessoa("Maria", 25, 12345678901L);
        Professor prof1 = new Professor("Carlos", 40, 98765432100L, 101);
        Aluno aluno1 = new Aluno("Ana", 20, 11223344L, 202);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(prof1.toString());
        System.out.println(aluno1.toString());
    }
}