import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;

import org.jfree.data.xy.XYSeriesCollection;

public class Delitos_sexuales1 {
    public static void main(String[] args) {
        String archivo = "DELITOS_SEXUALES.csv";
        XYSeries series = new XYSeries("DELITOS_SEXUALES");

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean headerSkipped = false;

            while ((linea = lector.readLine()) != null) {
                if (!headerSkipped) {
                    // Skip header line
                    headerSkipped = true;
                    continue;
                }

                String[] datos = linea.split(",");
                String fecha_de_reporte = datos[0];
                String cod_depto = datos[1];
                String departamento = datos[2];
                String cod_muni = datos[3];
                String municipio = datos[4];
                String zona = datos[5];
                String genero = datos[6];
                String cantidad = datos[7];

                System.out.println("Fecha_de_reporte: " + fecha_de_reporte);
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date date = formatter.parse(fecha_de_reporte);
                double x = date.getTime();

                System.out.println("Cod_depto: " + cod_depto);
                System.out.println("Departamento: " + departamento);
                System.out.println("Cod_muni: " + cod_muni);
                System.out.println("Municipio: " + municipio);
                System.out.println("Zona: " + zona);
                System.out.println("Genero: " + genero);
                System.out.println("Cantidad: " + cantidad);

                double y = Double.parseDouble(cantidad);

                // Add data point to the series
                series.add(x, y);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a line chart
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Delitos Sexuales por Departamento",
                "Fecha ",
                "Cantidad",
                dataset
        );

        // Display the chart
        ChartFrame frame = new ChartFrame("Gráfica", chart);
        frame.pack();
        frame.setVisible(true);
    }
}