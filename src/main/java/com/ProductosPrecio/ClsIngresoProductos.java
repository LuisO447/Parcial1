/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProductosPrecio;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class ClsIngresoProductos {
    //las cantidades originalmente eran de tipo int
    private double cantidad1 = 0;
    private double cantidad2 = 0;
    private double cantidad3 = 0;
    private double cantidad4 = 0;
    
    private String nombreProducto1 = "";
    private String nombreProducto2 = "";
    private String nombreProducto3 = "";
    private String nombreProducto4 = "";
    
    private double precio1 = 0;
    private double precio2 = 0;
    private double precio3 = 0;
    private double precio4 = 0;
    
    private int pesoProducto1 = 0;
    private int pesoProducto2 = 0;
    private int pesoProducto3 = 0;
    private int pesoProducto4 = 0;
    
    private double seguroLocal = 0;
    private double flete = 0;
    private double impuestoAduana = 0;
    private double acarreo = 0;
    private double comisionesBancarias = 0;
    
    private double totalValorUnidad1 = 0;
    private double totalValorUnidad2 = 0;
    private double totalValorUnidad3 = 0;
    private double totalValorUnidad4 = 0;
    private double sumatoriaValorUnidad = 0;
    
    private double sumaGastoValor = 0;
    private double totalGastoValor = 0;
    
    private double totalCoeficienteGasto = 0;
    
    private double multiCoeficiente1 = 0;
    private double multiCoeficiente2 = 0;
    private double multiCoeficiente3 = 0;
    private double multiCoeficiente4 = 0;
    
    private double pesoMercaderia1 = 0;
    private double pesoMercaderia2 = 0;
    private double pesoMercaderia3 = 0;
    private double pesoMercaderia4 = 0;
    private double totalPesoMercaderia = 0;
    
    private double totalGastoPeso = 0;
    
    private double coeficienteGastoPeso = 0;
    
    private double gastoAlPeso1 = 0;
    private double gastoAlPeso2 = 0;
    private double gastoAlPeso3 = 0;
    private double gastoAlPeso4 = 0;
    
    private double costoxunidadfin1 = 0;
    private double costoxunidadfin2 = 0;
    private double costoxunidadfin3 = 0;
    private double costoxunidadfin4 = 0;
    
    private double granCosto1 = 0;
    private double granCosto2 = 0;
    private double granCosto3 = 0;
    private double granCosto4 = 0;
    
    private double elGranCostoFinal = 0;
    
    private double totalComprovado = 0;
    
    //meter los datos
    public void IngresoDatos(){
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner teclado3 = new Scanner(System.in);
        Scanner teclado4 = new Scanner(System.in);
        
        Scanner tecladoslocal = new Scanner(System.in);
        Scanner tecladoflete = new Scanner(System.in);
        Scanner tecladoimpuesto = new Scanner(System.in);
        Scanner tecladoacarreo = new Scanner(System.in);
        Scanner tecladocomibanco = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del primer producto");
        setNombreProducto1(teclado.nextLine());
        
        System.out.println("Ingrese la cantidad del primer producto");
        setCantidad1(teclado.nextInt());
        
        System.out.println("Ingrese el precio del primer producto");
        setPrecio1(teclado.nextDouble());
        
        System.out.println("Ingrese el peso del primer producto");
        setPesoProducto1(teclado.nextInt());
        
        System.out.println("Ingrese nombre del segundo producto");
        setNombreProducto2(teclado2.nextLine());
        
        System.out.println("Ingrese la cantidad del segundo producto");
        setCantidad2(teclado2.nextInt());
        
        System.out.println("Ingrese el precio del segundo producto");
        setPrecio2(teclado2.nextDouble());
        
        System.out.println("Ingrese el peso del segundo producto");
        setPesoProducto2(teclado2.nextInt());
        
        System.out.println("Ingrese nombre del tercer producto");
        setNombreProducto3(teclado3.nextLine());
        
        System.out.println("Ingrese la cantidad del tercer producto");
        setCantidad3(teclado3.nextInt());
        
        System.out.println("Ingrese el precio del tercer producto");
        setPrecio3(teclado3.nextDouble());
        
        System.out.println("Ingrese el peso del tercer producto");
        setPesoProducto3(teclado3.nextInt());
        
        System.out.println("Ingrese nombre del cuarto producto");
        setNombreProducto4(teclado4.nextLine());
        
        System.out.println("Ingrese la cantidad del cuarto producto");
        setCantidad4(teclado4.nextInt());
        
        System.out.println("Ingrese el precio del cuarto producto");
        setPrecio4(teclado4.nextDouble());
        
        System.out.println("Ingrese el peso del cuarto producto");
        setPesoProducto4(teclado4.nextInt());
        
        System.out.println("Ingrese el gasto del seguro local");
        setSeguroLocal(tecladoslocal.nextDouble());
        
        System.out.println("Ingrese el gasto del flete");
        setFlete(tecladoflete.nextDouble());
        
        System.out.println("Ingrese el gasto de los impuestos de aduana");
        setImpuestoAduana(tecladoimpuesto.nextDouble());
        
        System.out.println("Ingrese el gasto de acarreo");
        setAcarreo(tecladoacarreo.nextDouble());
        
        System.out.println("Ingrese el gasto de las comisiones bancarias");
        setComisionesBancarias(tecladocomibanco.nextDouble());
    }
    
    //paso 1
    public void MultipliValorUnidad(){
        
        setTotalValorUnidad1(getCantidad1() * getPrecio1());
        setTotalValorUnidad2(getCantidad2() * getPrecio2());
        setTotalValorUnidad3(getCantidad3() * getPrecio3());
        setTotalValorUnidad4(getCantidad4() * getPrecio4());
        
        setSumatoriaValorUnidad(getTotalValorUnidad1() + getTotalValorUnidad2() + getTotalValorUnidad3() + getTotalValorUnidad4());
    }
    
    public void ImprimeDatos(){
        System.out.println("Los primeros datos son: "+getNombreProducto1());
        System.out.println("El total de valor por unidad es: "+getSumatoriaValorUnidad());
        System.out.println("El total de las sumas en gastos de valor es: "+getTotalGastoValor());
        System.out.println("El valor por unidad es de: "+getMultiCoeficiente1());
        System.out.println("El coeficiente del paso 3 es de: "+getTotalCoeficienteGasto());
    }
    
    //paso 2
    public void sumarGastosEnValor(){
        setSumaGastoValor(getSeguroLocal()+getImpuestoAduana()+getComisionesBancarias()); 
        setTotalGastoValor(getSumaGastoValor()); 
    }
    
    //paso 3
    public void coeficienteDeGasto(){
        setTotalCoeficienteGasto(getTotalGastoValor()/getSumatoriaValorUnidad());    
    }
    
    //paso 4
    public void multiUnidadxcoeficiente(){
        
        setMultiCoeficiente1(getPrecio1()*getTotalCoeficienteGasto());
        setMultiCoeficiente2(getPrecio2()*getTotalCoeficienteGasto());
        setMultiCoeficiente3(getPrecio3()*getTotalCoeficienteGasto());
        setMultiCoeficiente4(getPrecio4()*getTotalCoeficienteGasto());
        
    }
    
    //paso 5
    public void pesoTotalMercaderia(){
        
        setPesoMercaderia1(getPesoProducto1()*getCantidad1());
        setPesoMercaderia2(getPesoProducto2()*getCantidad2());
        setPesoMercaderia3(getPesoProducto3()*getCantidad3());
        setPesoMercaderia4(getPesoProducto4()*getCantidad4());
        setTotalPesoMercaderia(getPesoMercaderia1() + getPesoMercaderia2() + getPesoMercaderia3() + getPesoMercaderia4());
        
    }
    
    //paso 6
    public void gastosDePesos(){
        
        setTotalGastoPeso(getFlete()+getAcarreo());
        
    }
    
    //paso 7
    public void coeficienteDeGastoPeso(){
        setCoeficienteGastoPeso(getTotalGastoPeso() / getTotalPesoMercaderia());
    }
    
    //paso 8
    public void gastosPesoxProductos(){
        setGastoAlPeso1(getPesoProducto1()*getCoeficienteGastoPeso());
        setGastoAlPeso2(getPesoProducto2()*getCoeficienteGastoPeso());
        setGastoAlPeso3(getPesoProducto3()*getCoeficienteGastoPeso());
        setGastoAlPeso4(getPesoProducto4()*getCoeficienteGastoPeso());
    }
    
    public void gastoValorFactura(){
        
    }
    
    public void totalCostoxUnidad(){
        setCostoxunidadfin1(getPrecio1()+getMultiCoeficiente1()+getGastoAlPeso1());
        setCostoxunidadfin2(getPrecio2()+getMultiCoeficiente2()+getGastoAlPeso2()); 
        setCostoxunidadfin3(getPrecio3()+getMultiCoeficiente3()+getGastoAlPeso3()); 
        setCostoxunidadfin4(getPrecio4()+getMultiCoeficiente4()+getGastoAlPeso4()); 
    }
    
    public void elGranCosto(){
        setGranCosto1(getCantidad1()*getCostoxunidadfin1());
        setGranCosto2(getCantidad2()*getCostoxunidadfin2());
        setGranCosto3(getCantidad3()*getCostoxunidadfin3());
        setGranCosto4(getCantidad4()*getCostoxunidadfin4());
    }
    
    public void theBigCostoFinal(){
        
        setElGranCostoFinal(getGranCosto1()+getGranCosto2()+getGranCosto3()+getGranCosto4());
        
    }
    
    //paso 9
    public void imprimeTabla(){
        
        System.out.println("Numero de unidades\tDescripcion\tValor Factura\tGasto al valor\tGasto al peso\tCosto por unidad\tCosto total");
        
        System.out.println(getCantidad1()+"\t"+getNombreProducto1()+"\t"+getPrecio1()+"\t"+getMultiCoeficiente1()+"\t"+getGastoAlPeso1()+"\t"+getCostoxunidadfin1()+"\t"+getGranCosto1());
        System.out.println(getCantidad2()+"\t"+getNombreProducto2()+"\t"+getPrecio2()+"\t"+getMultiCoeficiente2()+"\t"+getGastoAlPeso2()+"\t"+getCostoxunidadfin2()+"\t"+getGranCosto2());
        System.out.println(getCantidad3()+"\t"+getNombreProducto3()+"\t"+getPrecio3()+"\t"+getMultiCoeficiente3()+"\t"+getGastoAlPeso3()+"\t"+getCostoxunidadfin3()+"\t"+getGranCosto3());
        System.out.println(getCantidad4()+"\t"+getNombreProducto4()+"\t"+getPrecio4()+"\t"+getMultiCoeficiente4()+"\t"+getGastoAlPeso4()+"\t"+getCostoxunidadfin4()+"\t"+getGranCosto4());
        
        System.out.println("El gran total es: "+getElGranCostoFinal());
        
        System.out.println("Comprovacion (el valor de abajo debe ser igual al gran total): ");
        System.out.println(""+getTotalComprovado());
    }
    
    //paso 10
    public void laComprovacion(){
        setTotalComprovado(getSumatoriaValorUnidad()+getTotalGastoValor()+getTotalGastoPeso());
    }

    /**
     * @return the cantidad1
     */
    public double getCantidad1() {
        return cantidad1;
    }

    /**
     * @param cantidad1 the cantidad1 to set
     */
    public void setCantidad1(int cantidad1) {
        this.cantidad1 = cantidad1;
    }

    /**
     * @return the cantidad2
     */
    public double getCantidad2() {
        return cantidad2;
    }

    /**
     * @param cantidad2 the cantidad2 to set
     */
    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    /**
     * @return the cantidad3
     */
    public double getCantidad3() {
        return cantidad3;
    }

    /**
     * @param cantidad3 the cantidad3 to set
     */
    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }

    /**
     * @return the cantidad4
     */
    public double getCantidad4() {
        return cantidad4;
    }

    /**
     * @param cantidad4 the cantidad4 to set
     */
    public void setCantidad4(int cantidad4) {
        this.cantidad4 = cantidad4;
    }

    /**
     * @return the nombreProducto1
     */
    public String getNombreProducto1() {
        return nombreProducto1;
    }

    /**
     * @param nombreProducto1 the nombreProducto1 to set
     */
    public void setNombreProducto1(String nombreProducto1) {
        this.nombreProducto1 = nombreProducto1;
    }

    /**
     * @return the nombreProducto2
     */
    public String getNombreProducto2() {
        return nombreProducto2;
    }

    /**
     * @param nombreProducto2 the nombreProducto2 to set
     */
    public void setNombreProducto2(String nombreProducto2) {
        this.nombreProducto2 = nombreProducto2;
    }

    /**
     * @return the nombreProducto3
     */
    public String getNombreProducto3() {
        return nombreProducto3;
    }

    /**
     * @param nombreProducto3 the nombreProducto3 to set
     */
    public void setNombreProducto3(String nombreProducto3) {
        this.nombreProducto3 = nombreProducto3;
    }

    /**
     * @return the nombreProducto4
     */
    public String getNombreProducto4() {
        return nombreProducto4;
    }

    /**
     * @param nombreProducto4 the nombreProducto4 to set
     */
    public void setNombreProducto4(String nombreProducto4) {
        this.nombreProducto4 = nombreProducto4;
    }

    /**
     * @return the precio1
     */
    public double getPrecio1() {
        return precio1;
    }

    /**
     * @param precio1 the precio1 to set
     */
    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    /**
     * @return the precio2
     */
    public double getPrecio2() {
        return precio2;
    }

    /**
     * @param precio2 the precio2 to set
     */
    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    /**
     * @return the precio3
     */
    public double getPrecio3() {
        return precio3;
    }

    /**
     * @param precio3 the precio3 to set
     */
    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }

    /**
     * @return the precio4
     */
    public double getPrecio4() {
        return precio4;
    }

    /**
     * @param precio4 the precio4 to set
     */
    public void setPrecio4(double precio4) {
        this.precio4 = precio4;
    }

    /**
     * @return the pesoProducto1
     */
    public int getPesoProducto1() {
        return pesoProducto1;
    }

    /**
     * @param pesoProducto1 the pesoProducto1 to set
     */
    public void setPesoProducto1(int pesoProducto1) {
        this.pesoProducto1 = pesoProducto1;
    }

    /**
     * @return the pesoProducto2
     */
    public int getPesoProducto2() {
        return pesoProducto2;
    }

    /**
     * @param pesoProducto2 the pesoProducto2 to set
     */
    public void setPesoProducto2(int pesoProducto2) {
        this.pesoProducto2 = pesoProducto2;
    }

    /**
     * @return the pesoProducto3
     */
    public int getPesoProducto3() {
        return pesoProducto3;
    }

    /**
     * @param pesoProducto3 the pesoProducto3 to set
     */
    public void setPesoProducto3(int pesoProducto3) {
        this.pesoProducto3 = pesoProducto3;
    }

    /**
     * @return the pesoProducto4
     */
    public int getPesoProducto4() {
        return pesoProducto4;
    }

    /**
     * @param pesoProducto4 the pesoProducto4 to set
     */
    public void setPesoProducto4(int pesoProducto4) {
        this.pesoProducto4 = pesoProducto4;
    }

    /**
     * @return the seguroLocal
     */
    public double getSeguroLocal() {
        return seguroLocal;
    }

    /**
     * @param seguroLocal the seguroLocal to set
     */
    public void setSeguroLocal(double seguroLocal) {
        this.seguroLocal = seguroLocal;
    }

    /**
     * @return the flete
     */
    public double getFlete() {
        return flete;
    }

    /**
     * @param flete the flete to set
     */
    public void setFlete(double flete) {
        this.flete = flete;
    }

    /**
     * @return the impuestoAduana
     */
    public double getImpuestoAduana() {
        return impuestoAduana;
    }

    /**
     * @param impuestoAduana the impuestoAduana to set
     */
    public void setImpuestoAduana(double impuestoAduana) {
        this.impuestoAduana = impuestoAduana;
    }

    /**
     * @return the acarreo
     */
    public double getAcarreo() {
        return acarreo;
    }

    /**
     * @param acarreo the acarreo to set
     */
    public void setAcarreo(double acarreo) {
        this.acarreo = acarreo;
    }

    /**
     * @return the comisionesBancarias
     */
    public double getComisionesBancarias() {
        return comisionesBancarias;
    }

    /**
     * @param comisionesBancarias the comisionesBancarias to set
     */
    public void setComisionesBancarias(double comisionesBancarias) {
        this.comisionesBancarias = comisionesBancarias;
    }

    /**
     * @return the totalValorUnidad1
     */
    public double getTotalValorUnidad1() {
        return totalValorUnidad1;
    }

    /**
     * @param totalValorUnidad1 the totalValorUnidad1 to set
     */
    public void setTotalValorUnidad1(double totalValorUnidad1) {
        this.totalValorUnidad1 = totalValorUnidad1;
    }

    /**
     * @return the totalValorUnidad2
     */
    public double getTotalValorUnidad2() {
        return totalValorUnidad2;
    }

    /**
     * @param totalValorUnidad2 the totalValorUnidad2 to set
     */
    public void setTotalValorUnidad2(double totalValorUnidad2) {
        this.totalValorUnidad2 = totalValorUnidad2;
    }

    /**
     * @return the totalValorUnidad3
     */
    public double getTotalValorUnidad3() {
        return totalValorUnidad3;
    }

    /**
     * @param totalValorUnidad3 the totalValorUnidad3 to set
     */
    public void setTotalValorUnidad3(double totalValorUnidad3) {
        this.totalValorUnidad3 = totalValorUnidad3;
    }

    /**
     * @return the totalValorUnidad4
     */
    public double getTotalValorUnidad4() {
        return totalValorUnidad4;
    }

    /**
     * @param totalValorUnidad4 the totalValorUnidad4 to set
     */
    public void setTotalValorUnidad4(double totalValorUnidad4) {
        this.totalValorUnidad4 = totalValorUnidad4;
    }

    /**
     * @return the sumatoriaValorUnidad
     */
    public double getSumatoriaValorUnidad() {
        return sumatoriaValorUnidad;
    }

    /**
     * @param sumatoriaValorUnidad the sumatoriaValorUnidad to set
     */
    public void setSumatoriaValorUnidad(double sumatoriaValorUnidad) {
        this.sumatoriaValorUnidad = sumatoriaValorUnidad;
    }

    /**
     * @return the totalGastoValor
     */
    public double getTotalGastoValor() {
        return totalGastoValor;
    }

    /**
     * @param totalGastoValor the totalGastoValor to set
     */
    public void setTotalGastoValor(double totalGastoValor) {
        this.totalGastoValor = totalGastoValor;
    }

    /**
     * @return the sumaGastoValor
     */
    public double getSumaGastoValor() {
        return sumaGastoValor;
    }

    /**
     * @param sumaGastoValor the sumaGastoValor to set
     */
    public void setSumaGastoValor(double sumaGastoValor) {
        this.sumaGastoValor = sumaGastoValor;
    }

    /**
     * @return the totalCoeficienteGasto
     */
    public double getTotalCoeficienteGasto() {
        return totalCoeficienteGasto;
    }

    /**
     * @param totalCoeficienteGasto the totalCoeficienteGasto to set
     */
    public void setTotalCoeficienteGasto(double totalCoeficienteGasto) {
        this.totalCoeficienteGasto = totalCoeficienteGasto;
    }

    /**
     * @return the multiCoeficiente1
     */
    public double getMultiCoeficiente1() {
        return multiCoeficiente1;
    }

    /**
     * @param multiCoeficiente1 the multiCoeficiente1 to set
     */
    public void setMultiCoeficiente1(double multiCoeficiente1) {
        this.multiCoeficiente1 = multiCoeficiente1;
    }

    /**
     * @return the multiCoeficiente2
     */
    public double getMultiCoeficiente2() {
        return multiCoeficiente2;
    }

    /**
     * @param multiCoeficiente2 the multiCoeficiente2 to set
     */
    public void setMultiCoeficiente2(double multiCoeficiente2) {
        this.multiCoeficiente2 = multiCoeficiente2;
    }

    /**
     * @return the multiCoeficiente3
     */
    public double getMultiCoeficiente3() {
        return multiCoeficiente3;
    }

    /**
     * @param multiCoeficiente3 the multiCoeficiente3 to set
     */
    public void setMultiCoeficiente3(double multiCoeficiente3) {
        this.multiCoeficiente3 = multiCoeficiente3;
    }

    /**
     * @return the multiCoeficiente4
     */
    public double getMultiCoeficiente4() {
        return multiCoeficiente4;
    }

    /**
     * @param multiCoeficiente4 the multiCoeficiente4 to set
     */
    public void setMultiCoeficiente4(double multiCoeficiente4) {
        this.multiCoeficiente4 = multiCoeficiente4;
    }

    /**
     * @return the pesoMercaderia1
     */
    public double getPesoMercaderia1() {
        return pesoMercaderia1;
    }

    /**
     * @param pesoMercaderia1 the pesoMercaderia1 to set
     */
    public void setPesoMercaderia1(double pesoMercaderia1) {
        this.pesoMercaderia1 = pesoMercaderia1;
    }

    /**
     * @return the pesoMercaderia2
     */
    public double getPesoMercaderia2() {
        return pesoMercaderia2;
    }

    /**
     * @param pesoMercaderia2 the pesoMercaderia2 to set
     */
    public void setPesoMercaderia2(double pesoMercaderia2) {
        this.pesoMercaderia2 = pesoMercaderia2;
    }

    /**
     * @return the pesoMercaderia3
     */
    public double getPesoMercaderia3() {
        return pesoMercaderia3;
    }

    /**
     * @param pesoMercaderia3 the pesoMercaderia3 to set
     */
    public void setPesoMercaderia3(double pesoMercaderia3) {
        this.pesoMercaderia3 = pesoMercaderia3;
    }

    /**
     * @return the pesoMercaderia4
     */
    public double getPesoMercaderia4() {
        return pesoMercaderia4;
    }

    /**
     * @param pesoMercaderia4 the pesoMercaderia4 to set
     */
    public void setPesoMercaderia4(double pesoMercaderia4) {
        this.pesoMercaderia4 = pesoMercaderia4;
    }

    /**
     * @return the totalPesoMercaderia
     */
    public double getTotalPesoMercaderia() {
        return totalPesoMercaderia;
    }

    /**
     * @param totalPesoMercaderia the totalPesoMercaderia to set
     */
    public void setTotalPesoMercaderia(double totalPesoMercaderia) {
        this.totalPesoMercaderia = totalPesoMercaderia;
    }

    /**
     * @return the totalGastoPeso
     */
    public double getTotalGastoPeso() {
        return totalGastoPeso;
    }

    /**
     * @param totalGastoPeso the totalGastoPeso to set
     */
    public void setTotalGastoPeso(double totalGastoPeso) {
        this.totalGastoPeso = totalGastoPeso;
    }

    /**
     * @return the coeficienteGastoPeso
     */
    public double getCoeficienteGastoPeso() {
        return coeficienteGastoPeso;
    }

    /**
     * @param coeficienteGastoPeso the coeficienteGastoPeso to set
     */
    public void setCoeficienteGastoPeso(double coeficienteGastoPeso) {
        this.coeficienteGastoPeso = coeficienteGastoPeso;
    }

    /**
     * @return the gastoAlPeso1
     */
    public double getGastoAlPeso1() {
        return gastoAlPeso1;
    }

    /**
     * @param gastoAlPeso1 the gastoAlPeso1 to set
     */
    public void setGastoAlPeso1(double gastoAlPeso1) {
        this.gastoAlPeso1 = gastoAlPeso1;
    }

    /**
     * @return the gastoAlPeso2
     */
    public double getGastoAlPeso2() {
        return gastoAlPeso2;
    }

    /**
     * @param gastoAlPeso2 the gastoAlPeso2 to set
     */
    public void setGastoAlPeso2(double gastoAlPeso2) {
        this.gastoAlPeso2 = gastoAlPeso2;
    }

    /**
     * @return the gastoAlPeso3
     */
    public double getGastoAlPeso3() {
        return gastoAlPeso3;
    }

    /**
     * @param gastoAlPeso3 the gastoAlPeso3 to set
     */
    public void setGastoAlPeso3(double gastoAlPeso3) {
        this.gastoAlPeso3 = gastoAlPeso3;
    }

    /**
     * @return the gastoAlPeso4
     */
    public double getGastoAlPeso4() {
        return gastoAlPeso4;
    }

    /**
     * @param gastoAlPeso4 the gastoAlPeso4 to set
     */
    public void setGastoAlPeso4(double gastoAlPeso4) {
        this.gastoAlPeso4 = gastoAlPeso4;
    }

    /**
     * @return the costoxunidadfin1
     */
    public double getCostoxunidadfin1() {
        return costoxunidadfin1;
    }

    /**
     * @param costoxunidadfin1 the costoxunidadfin1 to set
     */
    public void setCostoxunidadfin1(double costoxunidadfin1) {
        this.costoxunidadfin1 = costoxunidadfin1;
    }

    /**
     * @return the costoxunidadfin2
     */
    public double getCostoxunidadfin2() {
        return costoxunidadfin2;
    }

    /**
     * @param costoxunidadfin2 the costoxunidadfin2 to set
     */
    public void setCostoxunidadfin2(double costoxunidadfin2) {
        this.costoxunidadfin2 = costoxunidadfin2;
    }

    /**
     * @return the costoxunidadfin3
     */
    public double getCostoxunidadfin3() {
        return costoxunidadfin3;
    }

    /**
     * @param costoxunidadfin3 the costoxunidadfin3 to set
     */
    public void setCostoxunidadfin3(double costoxunidadfin3) {
        this.costoxunidadfin3 = costoxunidadfin3;
    }

    /**
     * @return the costoxunidadfin4
     */
    public double getCostoxunidadfin4() {
        return costoxunidadfin4;
    }

    /**
     * @param costoxunidadfin4 the costoxunidadfin4 to set
     */
    public void setCostoxunidadfin4(double costoxunidadfin4) {
        this.costoxunidadfin4 = costoxunidadfin4;
    }

    /**
     * @return the granCosto1
     */
    public double getGranCosto1() {
        return granCosto1;
    }

    /**
     * @param granCosto1 the granCosto1 to set
     */
    public void setGranCosto1(double granCosto1) {
        this.granCosto1 = granCosto1;
    }

    /**
     * @return the granCosto2
     */
    public double getGranCosto2() {
        return granCosto2;
    }

    /**
     * @param granCosto2 the granCosto2 to set
     */
    public void setGranCosto2(double granCosto2) {
        this.granCosto2 = granCosto2;
    }

    /**
     * @return the granCosto3
     */
    public double getGranCosto3() {
        return granCosto3;
    }

    /**
     * @param granCosto3 the granCosto3 to set
     */
    public void setGranCosto3(double granCosto3) {
        this.granCosto3 = granCosto3;
    }

    /**
     * @return the granCosto4
     */
    public double getGranCosto4() {
        return granCosto4;
    }

    /**
     * @param granCosto4 the granCosto4 to set
     */
    public void setGranCosto4(double granCosto4) {
        this.granCosto4 = granCosto4;
    }

    /**
     * @return the elGranCostoFinal
     */
    public double getElGranCostoFinal() {
        return elGranCostoFinal;
    }

    /**
     * @param elGranCostoFinal the elGranCostoFinal to set
     */
    public void setElGranCostoFinal(double elGranCostoFinal) {
        this.elGranCostoFinal = elGranCostoFinal;
    }

    /**
     * @return the totalComprovado
     */
    public double getTotalComprovado() {
        return totalComprovado;
    }

    /**
     * @param totalComprovado the totalComprovado to set
     */
    public void setTotalComprovado(double totalComprovado) {
        this.totalComprovado = totalComprovado;
    }
}
