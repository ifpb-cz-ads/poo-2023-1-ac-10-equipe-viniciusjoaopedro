class RegistraAluno {
    private String nome;
    private int idade;
    private String endereco;

    public RegistraAluno(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
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
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
    }

    public void imprimir(double mNota, double pNota, double gNota) {
        System.out.println("Nome: " + this.nome);
        System.out.println("-- Notas --");
        System.out.println("Matematica: " + mNota);
        System.out.println("Portugues: " + pNota);
        System.out.println("Geografia: " + gNota);
    }
}

public class AppRegistraAluno {
    public static void main(String[] args) {
        RegistraAluno aluno1 = new RegistraAluno("João", 19, "Rua");
        aluno1.imprimir();
    }
}

public class AppRegistraAluno2 {
    public static void main(String[] args) {
        RegistraAluno aluno2 = new RegistraAluno("João", 19, "Rua");
        double mNota = 9.9, pNota = 1.9, gNota = 2.9;
        aluno2.imprimir(mNota, pNota, gNota);
    }
}
