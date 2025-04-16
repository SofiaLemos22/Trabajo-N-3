package com.mycompany.trabajopracticon3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fran
 */
public class Empleado {
    
    private int identificador;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;
    
   
    
    public Empleado(int identificador, String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.identificador = identificador;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;     
    }

 
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.identificador = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000;       
    }
    
    public void actualizarSalario(int porcentajeAumento){
        this.salario += (this.salario * porcentajeAumento) / 100;        
    }
    
    public void actualizarSalario(double aumento){
        this.salario += aumento;
    }
    
      
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "identificador=" + identificador + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
}


