public class Application {
    public static void main (String[] args) {
        Encrypter e = new Encrypter();
        String str = e.encrypt("6789");
        System.out.printf("%s", str);
    }
}
