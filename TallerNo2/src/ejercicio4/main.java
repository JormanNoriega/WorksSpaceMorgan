/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 * @author morga
 */
public class main {
    public static void main(String[] args) {
        int numDays;
        double totalKM, costoLitro, promKM, pagoEstacionamiento, pagoPeaje, costoTotal, valorTotalLitro, valorTotalEstacionamiento, valorTotalPeaje;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el No de dias del viaje: ");
        numDays = input.nextInt();
        System.out.print("Ingrese el total de KM conducidos por dia: ");
        totalKM = input.nextDouble();
        System.out.print("Ingrese el costo por litro de gasolina: ");
        costoLitro = input.nextDouble();
        System.out.print("Ingrese promedio de KM por litro de gasolina: ");
        promKM = input.nextDouble();
        System.out.print("Ingrese el pago por estacionamiento por dia: ");
        pagoEstacionamiento = input.nextDouble();
        System.out.print("Ingrese pago de peajes por dia: ");
        pagoPeaje = input.nextDouble();
        valorTotalPeaje = pagoPeaje * numDays;
        valorTotalLitro = ((totalKM * numDays) / promKM) * costoLitro;
        valorTotalEstacionamiento = pagoEstacionamiento * numDays;
        costoTotal = valorTotalLitro + valorTotalEstacionamiento + valorTotalPeaje;
    
        System.out.printf("El valor total del viaje fue de: %.2f\n", costoTotal);
    }
    
}
