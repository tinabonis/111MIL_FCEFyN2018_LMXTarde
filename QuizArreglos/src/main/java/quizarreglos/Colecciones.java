/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizarreglos;

/**
 *
 * @author steve-urbit
 */
public class Colecciones {
    public static char[] apilar(char[] palabraOriginal,char letra){
		char[] nuevaPalabra = new char [palabraOriginal.length+1];
		int contador=0;
		for (int i=0;i<palabraOriginal.length;i++){
		nuevaPalabra[i]=palabraOriginal[i];
		contador++;
		}
		nuevaPalabra[contador]=letra;
		
        return nuevaPalabra;
    }
    public static char[] desapilar(char[] palabraOriginal){
        char[] desapilar = new char [palabraOriginal.length-1];
		
		for (int i=0;i<desapilar.length;i++){
		desapilar[i]=palabraOriginal[i];
		}
		
		return desapilar;
    }
    public static char[] encolar(char[] palabraOriginal,char letra){
		char[] nuevaPalabra = new char [palabraOriginal.length+1];
		int contador=0;
		nuevaPalabra[contador]=letra;
		
		for (int i=1;i<nuevaPalabra.length;i++){
		nuevaPalabra[i]=palabraOriginal[i-1];
		
		}
		
		
        return nuevaPalabra;
    }
    public static char[] desencolar(char[] palabraOriginal){
		char[] desencolar = new char [palabraOriginal.length-1];
		
		for (int i=0;i<desencolar.length;i++){
		desencolar[i]=palabraOriginal[i+1];
		}
		
		
        return desencolar;
    }
}