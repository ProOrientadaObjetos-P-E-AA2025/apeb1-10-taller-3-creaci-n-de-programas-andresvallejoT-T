package taller3;

public class EjecutorProblea_5_NotasEstudiantes {

    public static void main(String[] args) {
        String name = "Pepe";
        double nota1 = (double) Math.random() * 10, nota2 = (double) Math.random() * 10, nota3 = (double) Math.random() * 10;
        Problea_5_NotasEstudiantes estudiante1 = new Problea_5_NotasEstudiantes(name, nota1, nota2, nota3);
        System.out.println(estudiante1);
    }
}
