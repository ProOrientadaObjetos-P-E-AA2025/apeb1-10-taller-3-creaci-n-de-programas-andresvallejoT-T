package taller3;

public class EjecutarProblema_7_Automotor {

    public static void main(String[] args) {
        int cedula = 564218596, anio = 2016;
        String marca = "BMW";
        double valor=65416;
        

        Problema_7_Automotor conductor1 = new Problema_7_Automotor(cedula, marca, anio, valor);
        System.out.println(conductor1);
    }
}
