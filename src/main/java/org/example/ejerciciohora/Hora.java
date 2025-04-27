package org.example.ejerciciohora;

public class Hora {
    protected int hora;
    protected  int minutos;

    public Hora(int hora, int minutos) {
        if(validaHora(hora,minutos)){
            this.hora = hora;
            this.minutos = minutos;
        } else {
          this.hora = this.minutos = 0;
        }
  }

    public void incrementar() {
        minutos = (minutos + 1) % 60;
        hora = (minutos == 0 ? (hora + 1) % 24: hora);

    }

    public void setHora(int hora) {
        if(validaHora(hora, true))
            this.hora = hora;
    }

    public void setMinutos(int minutos) {
        if(validaHora(minutos,false))
            this.minutos = minutos;
    }

    protected boolean validaHora(int x, boolean hora) {

        if (hora)  return (x >= 0 && x <=23);

        return (x >= 0 && x <=59);
    }
    protected boolean validaHora(int h, int m) {
        return (h >= 0 && h <=23 && m >= 0 && m <=59);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d",hora,minutos);
    }
}
