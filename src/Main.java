import java.util.Scanner;

/*
Algoritmo que mostra o o peso ideal, utilizando as seguintes fórmulas:

Sexo feminino: peso ideal = (72.7 * altura) - 58
Sexo masculino: peso ideal =  (62.1 * altura) - 44.7

*/

public class Main {

    public static double pesoMasc(double altura){
        return (72.7 * altura) - 58;
    }

    public static double pesoFem (double altura){
        return (62.1 * altura) - 44.7;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Programa para saber seu peso ideal!");

        boolean generoValido = false;
        String genero = " ";

        while(!generoValido) {
            System.out.println("Digite seu gênero: ");
            genero = scanner.nextLine();


            if (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
                System.out.println("Gênero errado");
            }
            else {
                generoValido = true;
            }
        }

        double altura = 0;
        boolean alturaValida = false;

        while (!alturaValida) {
            System.out.println("Digite sua altura: ");
            String alturaConsole = scanner.nextLine();

            try {
                altura = Double.parseDouble(alturaConsole);
                alturaValida = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Altura errada!");
            }
        }

        double peso = 0;

        switch (genero.toUpperCase()) {
            case "M":
                peso = pesoMasc(altura);
                break;

            case "F":
                peso = pesoFem(altura);
                break;

            default:
                System.out.println("Burrão");
                break;
        }

        System.out.println("Seu peso ideal é: " + String.format("%.2f", peso));
        scanner.close();

    }
}




