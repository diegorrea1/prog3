import java.util.Scanner;

class Implementacion {   
  public static void main(String args[]) {
      System.out.println("Seleccione operacion");
      System.out.println("1. Suma de matrices ");
      System.out.println("2. Producto de matrices");
      System.out.println("3. Producto de un escalar de una matriz");
      System.out.println("4. Transpuesta de una matriz");
      int opcion = new Scanner (System.in).nextInt();
      double [][] matA = LeerMatrices.leerMatriz();
      double [][] matB = LeerMatrices.leerMatriz();
      switch(opcion){
            case 1:
              if (matA.length == matB.length && matA [0].length == matB[0].length){
                  double[][] suma = Arreglos.suma(matA,matB);
                  LeerMatrices.imprimirmatR(suma);
              } else {
                  System.out.println("No se puede sumar matrices debido a dimensiones distintas");
              }break;
            case 2:
              if (matA[0].length == matB.length){
                  double [][] producto =Arreglos.producto(matA,matB);
                  LeerMatrices.imprimirmatR(producto);
              } else {
                  System.out.println("no se puede multiplicar por las dimensiones de los arreglos");
              } break;
            case 3: 
                  System.out.println("ingrese un escalar: ");
                  double escalar = new Scanner(System.in).nextDouble();
                  double [][] multiplicarescalar = Arreglos.multiplicarescalar(escalar,matA);
                  LeerMatrices.imprimirmatB(multiplicarescalar);
                  break;
            case 4:
                double [][] transpuesta =Arreglos.transpuesta(matA);
                LeerMatrices.imprimirmatR(transpuesta);
                break;
                default:
                System.out.println("Opcion no valida");
      }
  }
}
