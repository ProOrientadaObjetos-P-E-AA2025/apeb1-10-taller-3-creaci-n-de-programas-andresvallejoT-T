package taller3;

public class Problema_3_InstitucionesEducativas {

    private String nombre;
    private String tipo;
    private int nalumnos;
    private int ndocentes;
    private int nsedes;
    private double gastoproyecto;
    private double presupuesto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNalumnos(int nalumnos) {
        this.nalumnos = nalumnos;
    }

    public void setNdocentes(int ndocentes) {
        this.ndocentes = ndocentes;
    }

    public void setNsedes(int nsedes) {
        this.nsedes = nsedes;
    }

    public void setGastoproyecto(double gastoproyecto) {
        this.gastoproyecto = gastoproyecto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNalumnos() {
        return nalumnos;
    }

    public int getNdocentes() {
        return ndocentes;
    }

    public int getNsedes() {
        return nsedes;
    }

    public double getGastoproyecto() {
        return gastoproyecto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    public String toString(){
    return "La institucion "+nombre
            +"\nEs de tipo: "+tipo
            +"\nCon " + nalumnos+" alumnos\n"
            + "con "+ndocentes+" docentes\n"
            + "Con "+nsedes+" sedes\n"
            + "Con un gasto de proyectos de $"+gastoproyecto
            +"\nCon un presupuesto de $"+presupuesto;
    }

}
