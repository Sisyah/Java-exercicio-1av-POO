public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Buddy", 3);
        Gato gato = new Gato("Whiskers", 2);

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom()); 
    }
}