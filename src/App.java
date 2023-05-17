import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Palestra palestra = new Palestra(Luz.ambar);

        System.out.println("Escolha uma cor!\n Vermelho\n Ambar\n Verde");
        String dado = scanner.nextLine();
        palestra.dif(Luz.valueOf(dado)); 
        scanner.close();
    }
}
