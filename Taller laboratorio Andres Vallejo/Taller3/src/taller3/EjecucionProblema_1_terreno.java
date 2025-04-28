package taller3;


public class EjecucionProblema_1_terreno {

    public static void main(String[] args) {
        Problema_1_terreno terreno1 = new Problema_1_terreno();

        double ancho = (double) (Math.random() * 15)+5;
        double largo =(double)(Math.random()*100)+50;
        double metro =(double)(Math.random()*400)+100;
        terreno1.setAncho(ancho);
        terreno1.setLargo(largo);
        terreno1.setValorMetroCuadrado(metro);

        terreno1.calcularArea();
        terreno1.calcularCostoTerreno();

        System.out.println(terreno1);
    }

}
