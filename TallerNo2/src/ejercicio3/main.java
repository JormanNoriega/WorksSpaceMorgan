/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;
/**
 * @author morga
 */
public class main {
    public static void main(String[] args) {
        double costoFijo, porcentajeIVA, porcentajeUtilidad, precioVenta, precioIVA, cantidadIVA;
        char OP = 'S';
        Scanner input = new Scanner(System.in);
        while (OP == 'S') {
            System.out.print("Ingrese el costo fijo del articulo : ");
            costoFijo = input.nextDouble();
            System.out.print("Ingrese el porcentaje de IVA del articulo : ");
            porcentajeIVA = input.nextDouble();
            System.out.print("Ingrese el porcentaje de utilidad del articulo : ");
            porcentajeUtilidad = input.nextDouble();
            precioVenta = ((costoFijo)/(100 - porcentajeUtilidad)) * 100;
            cantidadIVA = (precioVenta * (porcentajeIVA)/100);
            precioIVA = (precioVenta * (porcentajeIVA)/100) + precioVenta;
        
            System.out.printf("El precio de venta es : %.2f\n", precioVenta);
            System.out.printf("La cantidad de IVA es : %.2f\n", cantidadIVA);
            System.out.printf("El precio con IVA es : %.2f\n", precioIVA);
            do {
                System.out.print("Desea continuar ingresando datos S/N : ");
                OP = input.next().charAt(0);
                OP = Character.toUpperCase(OP);
            } while((OP != 'S') && (OP != 'N'));   
    }
}
}
