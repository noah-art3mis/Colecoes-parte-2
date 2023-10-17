import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Colecoes
 */
public class Colecoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Escaneador de sexo da EBAC ");

        List<Pessoa> listaMasculino = new ArrayList<Pessoa>();
        List<Pessoa> listaFeminino = new ArrayList<Pessoa>();

        alocar(pergunta(scanner), listaMasculino, listaFeminino);
        printLists(listaMasculino, listaFeminino);

        alocar(pergunta(scanner), listaMasculino, listaFeminino);
        printLists(listaMasculino, listaFeminino);

        alocar(pergunta(scanner), listaMasculino, listaFeminino);
        printLists(listaMasculino, listaFeminino);

        System.out.println("Obrigado por utilizar o escaneador de sexo da EBAC");
        System.out.println("==========================");
        scanner.close();

    }

    private static void printLists(List<Pessoa> listaMasculino, List<Pessoa> listaFeminino) {
        System.out.println("F:");
        System.out.println(listaFeminino);
        System.out.println("M:");
        System.out.println(listaMasculino);
    }

    private static Pessoa pergunta(Scanner scanner) {

        System.out.println("Digite um nome:");
        String nome = scanner.next();

        System.out.println("Sexo? (M ou F)");
        String sexo = scanner.next();

        return new Pessoa(nome, sexo);
    }

    private static void alocar(Pessoa result, List<Pessoa> m, List<Pessoa> f) {
        if (result.getSexo().equalsIgnoreCase("M")) {
            m.add(result);
        } else if (result.getSexo().equalsIgnoreCase("F")) {
            f.add(result);
        } else {
            System.out.println("Erro!");
        }
    }
}
