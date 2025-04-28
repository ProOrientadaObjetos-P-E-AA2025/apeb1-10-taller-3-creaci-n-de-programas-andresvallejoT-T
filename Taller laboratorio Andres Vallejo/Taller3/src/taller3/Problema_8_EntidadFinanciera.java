package taller3;

public class Problema_8_EntidadFinanciera {

    private String nomcliente;
    private String nombanco;
    private double cheque;
    private double comision;

    public Problema_8_EntidadFinanciera(String nomcliente, String nombanco, double cheque) {
        this.nomcliente = nomcliente;
        this.nombanco = nombanco;
        this.cheque = cheque;
        comision(cheque);
    }

    public void comision(double cheque) {

        comision = cheque * (0.003 / 100);
    }

    public String toString() {
        return "Nombre del cliente " + nomcliente
                + "\nNombre del banco " + nombanco
                + "\nCantidad de cheque " + cheque
                + "\nCantidad de comision " + comision;
    }
}
