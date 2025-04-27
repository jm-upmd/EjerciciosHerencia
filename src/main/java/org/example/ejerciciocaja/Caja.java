package org.example.ejerciciocaja;

public class Caja {
    double ancho;
    double alto;
    double fondo;
    String etiqueta;

    public Caja(double ancho, double alto, double fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    public double volumen() {
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta) {
        if(etiqueta.length() <= 30)
            this.etiqueta = etiqueta;
        else System.out.println("Tamaño etiqueta incorrecto");
    }

    @Override
    public String toString() {
        return "Caja{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", fondo=" + fondo +
                ", etiqueta='" + etiqueta + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object caja) {
        boolean objetoOK = false;
        if(caja instanceof Caja)
          objetoOK = ((Caja)caja).volumen() == volumen();

        return objetoOK;
    }
}
