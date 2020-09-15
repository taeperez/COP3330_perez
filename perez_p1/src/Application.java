public class Application {
    public static void main (String[] args) {
        Encrypter e = new Encrypter();
        String str1 = e.encrypt("1234");
        System.out.printf("%s\n", str1);
        Decrypter d = new Decrypter();
        String str2 = d.decrypt("0189");
        System.out.printf("%s\n", str2);
    }
}
