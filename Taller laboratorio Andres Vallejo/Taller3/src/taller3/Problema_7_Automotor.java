package taller3;

public class Problema_7_Automotor {

    private int cedula;
    private String marca;
    private int anio;
    private double valorvehiculo;
    private double valormatricula;

    public Problema_7_Automotor(int cedula, String marca, int anio, double valorvehiculo) {
        this.cedula = cedula;
        this.marca = marca;
        this.anio = anio;
        this.valorvehiculo = valorvehiculo;
        calculo(valorvehiculo);
    }

    public void calculo(double valor) {
        valormatricula = valor * (0.002 / 100);

    }

    public String toString() {
        return "Cedula del propietario " + cedula
                + "\nMarca " + marca
                + "\nAnio " + anio
                + "\nValor del bvehiculo: " + valorvehiculo
                + "\nValor de la matricula: " + valormatricula;

    }
}
