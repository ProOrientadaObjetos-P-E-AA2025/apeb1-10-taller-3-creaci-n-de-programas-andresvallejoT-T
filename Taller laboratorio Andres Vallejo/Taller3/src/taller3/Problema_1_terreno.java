package taller3;

public class Problema_1_terreno {

    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    // Método para calcular el costo del terreno
    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    
    public String toString() {
        return "Terreno:\n"
                + "Ancho: " + ancho + " metros\n"
                + "Largo: " + largo + " metros\n"
                + "Área: " + area + " metros cuadrados\n"
                + "Valor del metro cuadrado: $" + valorMetroCuadrado + "\n"
                + "Costo total del terreno: $" + costoTerreno;
    }

}
