package taller3;

import java.util.Scanner;

public class EjecutorProblema_2_EquivalentesHora {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);
        System.out.println("Cuanbtas horas desea transformar");
        double horas = tcl.nextDouble();
        Problema_2_EquivalentesHora calculadora = new Problema_2_EquivalentesHora(horas);

        System.out.println(calculadora);
    }
}
