
class Arreglos
{

  public static double[][] suma (double[][]matA, double[][]matB)
  {
    int filas = matA.length;
    int columnas = matA[0].length;
    double[][] resultado = new double[filas][columnas];
    for (int i = 0; i < filas; i++){
	for (int j = 0; j < columnas; j++)
	  {
	    resultado[i][j] = matA[i][j] + matB[i][j];
	  }
      }
    return resultado;

  }


  public static double[][] producto (double[][]matA, double[][]matB)
  {

    int filas = matA.length;
    int columnas = matA[0].length;
    double[][] matR = new double[filas][columnas];

    for (int i = 0; i < filas; i++)
      {

	for (int j = 0; j < columnas; j++)
	  {

	    matR[i][j] = matA[i][j] * matB[i][j];

	  }
      }
    return matR;
  }
  public static double[][] multiplicarescalar (double[][]matA, double[][]matB)
  {
    int filas = matR.length;
    int columnas = matR[0].length;
    double[][] matR = new double[filas][columnas];
    for (int i = 0; i < filas; i++){
	for (int j = 0; j < columnas; j++){
	    resultado = escalar * matR[i][j];
	  }
      }
  }
    public static double[][] transpuesta (double matA[][])
    {
      int filas = matA.length;
      int columnas = matA[0].length;
      double[][] matR = new double[filas][columnas];
    for (int i = 0; i < filas; i++){
	for (int j = 0; j < columnas; j++){
	    matR[j][i] = matA[i][j];
	  }
      }
    return matR;
  }
}
