import java.util.Scanner;
public class ContarVogais {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int contadorVogais = 0;

    System.out.println("Digite uma palavre ou frase: ");
    String texto = sc.nextLine();

    for(int i = 0; i < texto.length(); i++){
        char c = Character.toLowerCase(texto.charAt(i));

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            contadorVogais++;
        }
    }
    System.out.println("Quantidade de vogais: " + contadorVogais);
    sc.close();
}
}
