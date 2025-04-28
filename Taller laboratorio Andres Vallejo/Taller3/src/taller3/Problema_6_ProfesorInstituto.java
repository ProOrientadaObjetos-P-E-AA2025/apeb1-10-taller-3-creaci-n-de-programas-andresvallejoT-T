package taller3;

public class Problema_6_ProfesorInstituto {

    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldobasico = 450;
    private double sueldototal;

    public Problema_6_ProfesorInstituto(String nombre, String apellido, int celula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = celula;
        calculosueldo(sueldobasico);

    }

    public void calculosueldo(double sueldobasico) {
        sueldototal = sueldobasico * 0.15 + sueldobasico;
    }

    public String toString() {
        return "Nombre y Apellido del profesor: " + nombre + " " + apellido
                + "\nCedula: " + cedula
                + "\nsueldo: " + sueldototal;
    }

}
