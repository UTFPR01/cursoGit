public class Animal {
    private String raca;
    private  int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int geraIdade(){
        this.idade = this.getIdade() + 2;
        return idade;
    }
}
