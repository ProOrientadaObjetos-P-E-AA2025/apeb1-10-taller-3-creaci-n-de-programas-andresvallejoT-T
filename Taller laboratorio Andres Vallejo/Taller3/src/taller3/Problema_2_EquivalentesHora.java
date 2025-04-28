package taller3;

public class Problema_2_EquivalentesHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public Problema_2_EquivalentesHora(double horas) {
        this.horas = horas;
        calculadora();
    }

    public void calculadora() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;

    }

    public String toString() {
        return "Transformacion de " + horas + " horas \n"
                + minutos + " Minutos\n"
                + segundos + " Segundos\n"
                + dias + " Dias\n";

    }
}
