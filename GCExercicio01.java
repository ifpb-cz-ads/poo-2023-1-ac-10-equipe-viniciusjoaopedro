public class Animal {
    public void comer() {
        System.out.println("O animal está comendo.");
    }
    
    public void respirar() {
        System.out.println("O animal está respirando.");
    }
}

public class Mamifero extends Animal {
    @Override
    public void comer() { // sobrescrevendo metodo comer() da superclasse Animal
        System.out.println("O mamífero está mamando.");
    }
    
    public void amamentar() { // atribuindo novo metodo para a classe Mamifero
        System.out.println("O mamífero está amamentando seus filhotes.");
    }
}

public class Reptil extends Animal {
    @Override
    public void respirar() {
        System.out.println("O réptil está respirando pelo pulmão.");
    }
    
    public void rastejar() {
        System.out.println("O réptil está rastejando.");
    }
}

public class Cobra extends Reptil {
    @Override
    public void rastejar() {
        System.out.println("A cobra está rastejando silenciosamente. :o");
    }
    
    public void trocarDePele() {
        System.out.println("A cobra está trocando de pele. :o");
    }
}

public class Gato extends Mamifero {
    @Override
    public void comer() {
        System.out.println("O gato está comendo ração.");
    }
    
    public void miar() {
        System.out.println("O gato está miando. Que botitinho <3");
    }
}

public class Cachorro extends Mamifero {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo ração.");
    }
    
    public void latir() {
        System.out.println("O cachorro está latindo. Cala a boca cachorro.");
    }
}
