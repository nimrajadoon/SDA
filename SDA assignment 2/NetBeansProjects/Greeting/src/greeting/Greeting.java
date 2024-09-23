
package greeting;

public class Greeting {

    public static void greet(String language) {
        switch (language.toLowerCase()) {
            case "english":
                System.out.println("Hello!");
                break;
            case "spanish":
                System.out.println("Hola!");
                break;
            case "french":
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Language not supported");
        }
    }

    public static void main(String[] args) {
        
        greet("english");
        greet("spanish");
        greet("french");
    }
}