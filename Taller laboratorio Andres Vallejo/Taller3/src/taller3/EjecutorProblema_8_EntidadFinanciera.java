
package taller3;


public class EjecutorProblema_8_EntidadFinanciera {
    public static void main(String[] args) {
        String nombre="Pepe", banco="Banco de loja";
        double cheque = (double)(Math.random()*1000)+1;
        Problema_8_EntidadFinanciera cliente1 = new Problema_8_EntidadFinanciera(nombre, banco, cheque);
        System.out.println(cliente1);
    }
}
