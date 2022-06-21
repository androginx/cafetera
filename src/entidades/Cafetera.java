/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Abril
 */
public class Cafetera {

    Scanner leer = new Scanner(System.in);

    //ATRIBUTOS
    public int capacidadMaxima, cantidadActual;

    //CONSTRUCTORES
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    //GET SET
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //METODOS
    public int llenarCafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 250;
        System.out.println("Llenando cafetera...");
        cantidadActual = capacidadMaxima;
        return cantidadActual;
    }

    public int servirTaza() {
        System.out.println("Indique si el tamaño de su taza es grande, mediano, o chico");
        String opcion = leer.next();
        int chico = 200;
        int mediano = 250;
        int grande = 350;
        int op = 0;
        switch (opcion) {
            case "chico":
                op = (cantidadActual - 100);
                System.out.println("Llenando taza pequeña...");
                break;
            case "mediano":
                op = (cantidadActual - 200);
                System.out.println("Llenando taza mediana...");
                break;
            case "grande":
                op = (cantidadActual - 300);
                System.out.println("Llenando taza grande...");
                break;

            default:
                System.out.println("La opción es incorrecta. ¿De qué tamaño es su taza?");
                if (op < cantidadActual) {
                    System.out.println("Su taza no se llenó :( , café insuficiente");
                }
                
        }
        System.out.println(" ");
        System.out.println("su café está listo (:  Cantidad actual de café: "+this.cantidadActual+" ml.");
        return 0;
    }

    /*
 Método vaciarCafetera(): pone la cantidad de café 
actual en cero.
     */
    public int vaciarCafetera() {

        System.out.println(" ");
        System.out.println("Vaciando cafetera...");
        System.out.println("...");
        cantidadActual = 0;
        System.out.println("Cafetera vacía .");
        return this.cantidadActual;
    }

    /*
 Método agregarCafe(int): se le pide al usuario una 
cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café 
indicada.
     */
    public int agregarCafe() {
        int opcion;
        System.out.println("Desea preparar mas café?");
        System.out.println("seleccione la opcion deseada:");
        System.out.println("opcion 1 ----> llenar un tercio de la jarra");
        System.out.println("opcion 2 ----> llenar la mitad de la jarra");
        System.out.println("opcion 3 ---->llenar por completo la jarra");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Llenando un tercio de jarra...");
                cantidadActual = (cantidadActual + 250);
                break;
            case 2:
                System.out.println("Llenando la mitad de la jarra...");
                cantidadActual = (cantidadActual + 500);
                break;
            case 3:
                System.out.println("Llenando jarra hasta su capacidad maxima...");
                cantidadActual = (cantidadActual + 1000);
                break;
        }

        System.out.println("su café está listo (: , cantidad actual de café: "+cantidadActual+" ml.");
        return 0;
    }

}
