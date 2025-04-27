package org.example.ejerciciohora;

import java.util.Scanner;

public class HoraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hora;

        do {
            System.out.println("Dame la hora en formato \"hh:mm\"");
            hora = sc.nextLine();
        } while (!hora.matches("\\d{2}:\\d{2}"));

        //"12:25"
        int[] aux = conversorHora(hora);
        Hora hora1 = new Hora(aux[0],aux[1]);
        System.out.println(hora1);

        System.out.println("Cuanto incrementas?");
        int cuenta = sc.nextInt();
        for (int i = 1; i <= cuenta ; i++) {
            hora1.incrementar();
        }

        System.out.println(hora1);

        // main ej4

        System.out.println("1.");
        HoraExacta horax1 = new HoraExacta(23, 12, 45);
        System.out.println("2.");
        System.out.println(horax1);
        System.out.println("3.");
        horax1.setHora(10);
        horax1.setMinutos(22);
        horax1.setSegundos(33);
        System.out.println("4.");
        System.out.println(horax1);
        System.out.println("5.");
        horax1.incrementar();
        System.out.println("6.");
        System.out.println(horax1);
        System.out.println("7.");
        HoraExacta horax2 = new HoraExacta(horax1.hora, horax1.minutos, 34);
        HoraExacta horax3 = new HoraExacta(21, 12, 34);
        System.out.println("8.");
        System.out.println(horax2.equals(horax3) ? "Son iguales" : "No son iguales");
        System.out.println("9.");
        System.out.println(horax1.equals(horax2) ? "Son iguales" : "No son iguales");










    }

    private static int[] conversorHora(String h) {
        String[] aux = h.split(":");
        int[] aux2 = new int[aux.length];
        for(int i= 0; i< aux.length; i++){
            aux2[i] = Integer.parseInt(aux[i]);
        }
        return aux2;
    }
}