import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String name = scanner.next();
        
        System.out.println("Digite seu sobrenome:");
        String lastName = scanner.next();
        
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt(); 
        
        System.out.println("Digite sua altura (em metros):");
        double height = scanner.nextDouble();
        
        System.out.println("Ola, me chamo " + name + " " + lastName);
        System.out.println("Tenho " + age + " anos");
        System.out.println("e minha altura é " + height + " cm.");
        
        scanner.close();
    }
}