package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {

    public void Ejercicio1() {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numero;
        int posible;


        numero = aleatorio.nextInt(100) + 1;

        int intentos = 10;

            System.out.println("Intenta adivinar el número.");
            posible = entrada.nextInt();


                while (intentos>0) {

                    if (posible > numero) {
                        intentos--;
                        System.out.println("El número que buscamos es menor a " + posible + ". Te quedan " + intentos + " intentos.");
                        break;
                    } else if (posible < numero) {
                        intentos--;
                        System.out.println("El numero que buscamos es mayor a " + posible + ". Te quedan " + intentos + " intentos.");
                        break;

                    } else if (posible == numero) {
                        System.out.println("ADIVINASTE EL NÚMERO!");
                        break;


                    } else {
                        System.out.println("FORMATO INCORRECTO");



                        }
                    if (intentos == 0) {
                        System.out.println("Se te han acabado los intentos.");

                    }

                }
        }



            public void Ejercicio2() {





            }
    }


