  import java.util.Scanner;
  public class TestMatematicas {
    public static void main(String[] args){
     //llamada a los métodos de la clase Matematicas;
      System.out.println("Introduce un número entero:");
      Scanner in = new Scanner(System.in);
      int numero = in.nextInt();
      in.close();
      boolean par = Matematicas.esPar(numero);
      System.out.printf("El número %d ¿es par? %b%n", numero, par);
    }
  }

