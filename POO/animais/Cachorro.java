package animais;

public class Cachorro extends Mamifero {
    String raca;

    Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = nome;
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo");
    }
}
