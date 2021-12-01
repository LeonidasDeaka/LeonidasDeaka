/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author algui
 */
public class Empleado {
    private String nombre;
    private String apellidos;
    private int id;
    private double horasExtra;
    private double salarioBase;

    public Empleado(String nombre, String apellidos, int id, double horasExtra, 
            double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.horasExtra = horasExtra;
        this.salarioBase = salarioBase;
    }

    public Empleado() {
    }
    
    public double calcularSalarioBruto(){
        double salarioBruto = this.salarioBase + this.horasExtra;
        
        
        
        return salarioBruto;
        
    }
    public double calcularSeguro(){
        double seguro = calcularSalarioBruto()*0.7;
        
        return seguro;
        
    }
    public double calcularSalarioNeto(){
        double salarioNeto = 0 +(this.getSalarioBase() + this.getHorasExtra()) - calcularSeguro();
        return salarioNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
}
