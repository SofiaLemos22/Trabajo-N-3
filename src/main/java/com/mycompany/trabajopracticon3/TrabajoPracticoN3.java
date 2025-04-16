/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajopracticon3;

/**
 *
 * @author Fran
 */
public class TrabajoPracticoN3 {

    public static void main(String[] args) {
        
        
    

        
        Empleado emp1 = new Empleado(1, "Sofía López", "Desarrolladora", 60000);
        Empleado emp2 = new Empleado("Juan Pérez", "Diseñador");
        Empleado emp3 = new Empleado("Lucía Gómez", "Tester");

        emp1.actualizarSalario(5000);
       
        emp2.actualizarSalario(10);
   
        emp3.actualizarSalario(5);
        
        emp3.actualizarSalario(2000);

 
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

   
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}

        
        
        
    

