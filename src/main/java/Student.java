public class Student implements Gym {

    private String nome;
    private int idade;
    private String cpf;
    private String esportePreferido;



    @Override
    public void training() {
        System.out.println("Bem vindo ao treino!");

    }

    @Override
    public void hydrate() {
        System.out.println("Você precisa de hidratar queridão!");
    }

    @Override
    public void rest() {
        System.out.println("É importante um intervalo durante as séries!!!");
    }

    @Override
    public void start() {
        System.out.println("Bora!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEsportePreferido() {
        return esportePreferido;
    }

    public void setEsportePreferido(String esportePreferido) {
        this.esportePreferido = esportePreferido;
    }
}
