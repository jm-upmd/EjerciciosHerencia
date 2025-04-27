package org.example.ejerciciocaja;

public class CajaCarton extends Caja {
    private int resistencia;

    public CajaCarton(double ancho, double alto, double fondo, int resistencia) {
        super(ancho, alto, fondo);
        this.resistencia = resistencia;
    }

    @Override
    public double volumen() {
        return super.volumen() * 0.8;
    }

    public double area() {
        return fondo * ancho;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "resistencia=" + resistencia +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta='" + etiqueta + '\'' +
                '}';
    }
}
