package org.example.ejerciciohora;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);

        if (validaHora(segundos,false))
                this.segundos = segundos;
        else
            this.segundos = 0;
    }

    public void setSegundos(int segundos) {
        if(validaHora(segundos,false))
            this.segundos = segundos;
    }

    @Override
    public void incrementar(){
        segundos = (segundos + 1) % 60;
        if(segundos == 0) super.incrementar();
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d",segundos);
    }

    @Override
    public boolean equals(Object o) {
       HoraExacta h = (HoraExacta) o;

       return  h.hora == hora && h.minutos == minutos
               && h.segundos == segundos;
    }

}
