package taller3;

public class Problema_4_EquipoDeCelulares {

    private String sistemaoperativos;
    private double tamaniopantalla;
    private double costoinicial;
    private double ivaporcentaje = 0.15;
    private double ivacostoinicial;
    private double costofinal;
    private String direccionmac;
    private int inforimei;

    public Problema_4_EquipoDeCelulares(String sistemaoperativos, double tamaniopantalla, double costoinicial, String direccionmac, int inforimei) {
        this.sistemaoperativos = sistemaoperativos;
        this.tamaniopantalla = tamaniopantalla;
        this.costoinicial = costoinicial;
        this.direccionmac = direccionmac;
        this.inforimei = inforimei;
        calcular(ivaporcentaje, costoinicial);
    }

    public void calcular(double ivaporcentaje, double costoinicial) {
        ivacostoinicial = ivaporcentaje * costoinicial;
        costofinal = costoinicial + ivacostoinicial;
    }

    public String toString() {
        return "El celular de sistema operativo " + sistemaoperativos
                + "\nDe una pantalla de " + tamaniopantalla + " pulgadas\n"
                + "De direccion MAC " + direccionmac + "\n"
                + "Con informacion IMEI : " + inforimei + "\n"
                + "Tiene un costo inicial de $" + costoinicial + "\n"
                + "Con un aumto del iva del $" + ivacostoinicial + "\n"
                + "Teniendo un costo final de $" + costofinal;
    }
}
