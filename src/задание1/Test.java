package задание1;

public class Test{
    public static void main(String[] args) {
        Sistema sistema = new Sistema("SystemOfADown",8,"not cool");
        Sistema sistema1 = new Sistema("dk",7,"hg");
        Sistema sistema2 = new Sistema("SystemOfADown",8,"not cool");
        System.out.println(sistema.toString());
        System.out.println(sistema.equals(sistema2));
    }
}
