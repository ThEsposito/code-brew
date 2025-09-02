package exercicios.algoritmoseprogramacaoII.relogio;

import java.util.Scanner;

public class RelogioDigital {
    private int horas;
    private int minutos;
    private int segundos;

    public RelogioDigital() {}
    public RelogioDigital(int horas, int minutos, int segundos) throws IllegalArgumentException {
        if(horas < 0 || minutos < 0 || segundos < 0) throw new IllegalArgumentException();
        if(horas >=24 || minutos >=60 || segundos >= 60) throw new IllegalArgumentException();

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void tick(){
        if(segundos < 59){
            segundos ++;

        } else {
            segundos = 0;
            if(minutos<59){
                minutos++;
            } else {
                minutos = 0;
                horas++;
                if(horas > 23) horas = 0;
            }
        }
    }
    public String getHorario(){
        return String.format("%02d:%02d:%02d",horas, minutos, segundos);
    }

    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setHoras(int horas) throws IllegalArgumentException {
        if(horas<0 || horas >23) throw new IllegalStateException();
        this.horas = horas;
    }
    public void setMinutos(int minutos) throws IllegalArgumentException{
        if(minutos<0 || minutos >59) throw new IllegalStateException();
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) throws IllegalArgumentException{
        if(segundos < 0 || segundos > 59) throw new IllegalStateException();
        this.segundos = segundos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        RelogioDigital ck = new RelogioDigital(23,59,59);
        for(int i=0; i<n; i++){
            System.out.println(ck.getHorario());
            ck.tick();
            try {
                Thread.sleep(500);
            } catch(Exception e){
                System.out.println("Erro na dorminhança da thread");
            }
        }
    }
}
