package taller3;

public class Problea_5_NotasEstudiantes {

    private String nestudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private String modo;

    public Problea_5_NotasEstudiantes(String nestudiante, double nota1, double nota2, double nota3) {
        this.nestudiante = nestudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcular();
        mob(promedio);
    }

    public void calcular() {
        promedio = (nota1 + nota2 + nota3) / 3;

    }

    public void mob(double promedio) {
        if (promedio >= 6.5) {
            modo = "Aprobado";
        } else {
            modo = "Reprobado";
        }

    }

    public String toString() {
        return "Estudiante " + nestudiante
                + "\nMateria 1: " + nota1
                + "\nMateria 2: " + nota2
                + "\nMateria 3: " + nota3
                + "\nPromedio: " + promedio
                + "\nEStado: " + modo;
    }
}
