package edu.eci.cvds.servlet;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "guessBean")
@SessionScoped

public class GuessBean {
    public ArrayList<Integer> historial;

    private int premio;
    private String estadoDelJuego;
    private Random aleatorio;
    private int numeroIntentos; 
    private int numeroAdivinar;
    private int valor;
    
    public  GuessBean(){
        restart();
    }

    public void guess(int valor){
        numeroIntentos++; 
        if (valor == numeroAdivinar){
            estadoDelJuego = "Gano";    
        }
        else{
            premio-=10000;
        }
    }

    public void restart(){
        numeroAdivinar = aleatorio.nextInt(100);
        premio = 100000;
        numeroIntentos = 0;
        estadoDelJuego = "No gano";
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public int getPremio() {
        return premio;
    }
    public String getEstadoDelJuego() {
        return estadoDelJuego;
    }
    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }
    public int getNumeroIntentos(){
        return this.numeroIntentos;
    }
  

}