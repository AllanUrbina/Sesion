import java.util.Scanner;

public class App1 {

  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("Se necesita la altura y el radio");
    

    int intentosMaximo1;
   double  perimetroBase,areaBase,areaLateral,volumen,areaTotal,radio=0,altura=0;
    for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

      System.out.println("¿Cuál es la altura del cilindro?");
      altura = lector.nextDouble();

      if (altura < 0.1) {
        System.out.println("No se aceptan valores menores a 0.1");

      } else {

        break;

      }

    }

    if (intentosMaximo1 == 3) {
      System.out.println("Demasiados intentos fallidos");
    }

    for (intentosMaximo1 = 0; intentosMaximo1 < 3; intentosMaximo1++) {

      System.out.println("¿Cuál es el radio del cilindro?");
      radio = lector.nextDouble();

      if (radio < 0.1) {
        System.out.println("No se aceptan valores menores a 0.1");

      } else {

        break;
      }
    }

    if (intentosMaximo1 == 3) {

      System.out.println("Demasiados intentos fallidos");

      

    } else {

      perimetroBase = (2 * Math.PI) * radio;

      areaLateral = perimetroBase * altura;

      areaBase = Math.PI * Math.pow(radio, 2);

      areaTotal = 2 * areaBase + areaLateral;

      volumen = areaBase * altura;

      System.out.println("El área lateral de un cilindro es " + areaLateral);

      System.out.println("Area total:" + areaTotal + " centimetro cuadrado.");

      System.out.println("Volumen:" + volumen + "  centimetro al cubo.");


    }


  
  lector.close();
  
  
  }
  }
