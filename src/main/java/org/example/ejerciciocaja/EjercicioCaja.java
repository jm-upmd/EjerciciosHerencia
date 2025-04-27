package org.example.ejerciciocaja;

public class EjercicioCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(10, 5, 2);

        caja1.setEtiqueta("C/ Piedra Alta, Madrid ");
        System.out.println(caja1);

        CajaCarton cajaCarton1 = new CajaCarton(caja1.ancho, caja1.alto, caja1.fondo, 3);

        Object cajaCarton2 = new CajaCarton(22,4,1,5);

        System.out.println(cajaCarton1);
        cajaCarton1.setEtiqueta("C/ Huevo frito, n 6");
        System.out.println(cajaCarton1);

        System.out.println("Volumen de la caja: " + caja1.volumen());
        System.out.println("Volumen de la caja: " + cajaCarton1.volumen());
        System.out.println(((CajaCarton) cajaCarton2).volumen());





    }
}