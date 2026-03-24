import java.util.Scanner;

public class CincoPatinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, patinhos;

        do{
            System.out.println("Informe o número dos patinhos: ");
            n = sc.nextInt();
        }
        while(n <= 0);
        patinhos = n;

        while (patinhos > 0 ) {
            System.out.print("\n" + patinhos + (patinhos == 1 ? " patinho foi passear\n" : " foram passear\n"));
            System.out.println("""
                    Além das montanhas
                    Para brincar
                    A mamã e gritou: Quá, quá, quá, quá
                    """);

        if (--patinhos > 0) {
            System.out.println("Mas só" + patinhos + (patinhos == 1 ? " Patinho voltou de lá" : " Patinhos voltaram de lá"));       
        } else{ 
            System.out.println(" Mas nenhum patinho voltou de lá");
        }
        System.out.println("""
                A mamãe patinha foi procurar
                Além das montanhas
                Na beira do mar
                A mamãe gritou: Quá, quá, quá, quá 
                """);
        System.out.println("E" + (n == 1
            ? " o patinho voltou"
            : "os " + n + " patinhos voltaram")+ " de lá");

        }
        sc.close();
    }
}
