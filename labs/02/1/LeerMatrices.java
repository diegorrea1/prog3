import java.util.Scanner;

public class LeerMatrices {   

  public static double [][] leerMatriz(){
    System.out.print("ingrese el numero de filas del arreglo");
    int filas = scanner.nextInt();
    System.out.print("ingrese el numero de columnas del arreglo");
    int columnas = Scanner.nextInt();
    Double matR = new double [filas][columnas];
    System.out.println("ingrese los valores del arreglo");
    for(int i = 0; i<filas ; i++){
        for ( int j= 0; j<columnas;j++){
            matR[i][j]= scanner.nextDouble();
        }
    }
    return matR;
  }

 public static void imprimirmatR(double[][] matR){
     int filas = matR.length;
     int columnas = matR[0].length;
     System.out.println("Matriz resultante");
      for(int i = 0; i<filas ; i++){
        for ( int j= 0; j<columnas;j++){
        System.out.print(matR[i][j]+ "\t");
        }
        System.out.println();
    }
 }

}
