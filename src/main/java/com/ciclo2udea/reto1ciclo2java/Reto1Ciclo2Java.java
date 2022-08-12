
package com.ciclo2udea.reto1ciclo2java;

import java.util.Arrays;

public class Reto1Ciclo2Java {

    public static void main(String[] args) {

        int[] resultados = {18, 29, 22, 25, 16, 26, 21, 23, 20};
        int b = resultados.length;
        System.out.println("La longitud del arreglo es: " + b);
        Arrays.sort(resultados);
        for (int i = 0; i < b; i++) {
            System.out.println(resultados[i]);
        }
        int[] arreglo={0,0,0};
        arreglo[0]=b;
        arreglo[1]=resultados[0];
        arreglo[2]=resultados[b-1];
        int lenB=3;
        for (int j = 0; j < lenB; j++) {
            System.out.println("El arreglo final es: "+arreglo[j]);
        }
        
    }
}
