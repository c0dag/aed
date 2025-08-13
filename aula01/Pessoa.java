public class Pessoa {
    private String name;
    private int Age;

    public Pessoa (){
        this("", 0);
    }

    public Pessoa (String name, int Age){
        setName(name);
        setAge(Age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String toString(){
        return "Nome: " + getName() + " Idade: " + getAge();
    }


}