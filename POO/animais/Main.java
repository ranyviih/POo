package animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("fifi", 4, "Labrador");
        cachorro.emitirSom();
        cachorro.mover();
        cachorro.abanarRabo();
        Passaros passaros = new Passaros("mia", 2, "cinza");
        passaros.construirNinho();
        passaros.emitirSom();
        passaros.voar();

    }
}
