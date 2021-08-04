/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial1progra2;

import com.ProductosPrecio.ClsIngresoProductos;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ClsPrincipalParcial1 {

    public static void Menu() {

        boolean elegir = false;
        int numeroOpcion = 0;
        Scanner teclas = new Scanner(System.in);

        ClsIngresoProductos laFactura = new ClsIngresoProductos();

        System.out.println("Bienvenido al programa de Prorrateo de facturas.");

        do {
            System.out.println("Que quiere hacer acontinuacion??");

            System.out.println("1. Prorrateo\n2. Salir.");
            numeroOpcion = teclas.nextInt();

            switch (numeroOpcion) {
                case 1:

                    //System.out.println("Sabia decicion elegiste el Prorrateo\n");
                    
                    laFactura.IngresoDatos();
                    
                    laFactura.MultipliValorUnidad();
                    
                    laFactura.sumarGastosEnValor();
                    
                    laFactura.coeficienteDeGasto();
                    
                    laFactura.multiUnidadxcoeficiente();
                    
                    laFactura.pesoTotalMercaderia();
                    
                    laFactura.gastosDePesos();
                    
                    laFactura.coeficienteDeGastoPeso();
                    
                    laFactura.gastosPesoxProductos();
                    
                    laFactura.totalCostoxUnidad();
                    
                    laFactura.elGranCosto();
                    
                    laFactura.theBigCostoFinal();
                    
                    laFactura.laComprovacion();
                    
                    laFactura.imprimeTabla();
                    
                    //laFactura.ImprimeDatos();

                    break;
                case 2:
                    System.exit(0);
                    break;
                default:

                    System.out.println("Esa opcion no esta disponible, vuelve a intentar");
            }
        } while (elegir = true);

    }

    public static void main(String[] args) {

        Menu();

    }
}
