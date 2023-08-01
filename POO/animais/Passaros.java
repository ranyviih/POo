package animais;
public class Passaros extends Aves{
    String nome;
    int idade = 0;
    String cor;

    Passaros(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public void construirNinho() {
        System.out.println("Construindo ninho");  
    }
}
