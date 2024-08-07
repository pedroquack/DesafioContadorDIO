import java.util.Scanner;

public class DesafioContador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("PARAMETRO 1: ");
        int param1 = scanner.nextInt();
        System.out.println("PARAMETRO 2: ");
        int param2 = scanner.nextInt();

        try {
            contar(param1,param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parametro 1 não pode ser maior que o parametro 2");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametro2 - parametro1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
