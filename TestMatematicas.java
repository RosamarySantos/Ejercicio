  import java.util.Scanner;
  public class TestMatematicas {
    public static void main(String[] args){
     //llamada a los métodos de la clase Matematicas;
      System.out.println("Introduce un número entero:");
      Scanner in = new Scanner(System.in);
      int numero = in.nextInt();
      in.close();
      boolean par               = Matematicas.esPar(numero);
      boolean divisiblePorTres  = Matematicas.esDivisiblePorTres(numero);
      boolean divisiblePorCinco = Matematicas.esDivisiblePorCinco(numero);
      System.out.printf("El número %d ¿es par? %b, ¿es divisible por tres? %b y ¿es divisible por cinco? %b%n", numero, par, divisiblePorTres, divisiblePorCinco);
    }
  }

