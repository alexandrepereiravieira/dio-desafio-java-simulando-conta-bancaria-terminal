import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o seu nome completo:");
        String nomeCliente = scanner.next().concat(" ").concat(scanner.next());
        
        System.out.println("Por favor, insira o número da conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, insira o número da sua agência bancária:");
        String Agencia = scanner.next();
        
        System.out.println("Por favor, insira o valor do seu saldo em conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +Agencia+", conta " +numero+" e seu saldo " 
        +saldo+" já está disponível para saque.");
    }
}
