  //las tildes no las tengo en cuenta
  import java.util.Scanner;
  public class TipoDias{
    public static void main(String[] arg){
      System.out.println("Introduce un día de la semana");
      Scanner sc = new Scanner(System.in);
      String diaSemana = sc.next(); 
      sc.close();
      String diaSemanaMinuscula = diaSemana.toLowerCase();
      //System.out.printf("Día de la semana introducido %s%n", diaSemanaMinuscula);
      String mensaje ="";
      switch (diaSemanaMinuscula) {
        case "lunes" :
          mensaje = "es laborable";
          break;
        case "martes" :
          mensaje = "es laborable";
          break;
        case "miercoles" :
          mensaje = "es laborable";
          break;
        case "jueves" :
          mensaje = "es laborable";
          break;
        case "viernes" :
          mensaje = "es laborable";
          break;
        case "sabado" :
          mensaje = "no es laborable";
          break;
        case "domingo" :
          mensaje = "no es laborable";
          break;
        default :
          mensaje = "no es un día";
      }
      System.out.printf("%s %s%n", diaSemanaMinuscula, mensaje);
    }
  }
