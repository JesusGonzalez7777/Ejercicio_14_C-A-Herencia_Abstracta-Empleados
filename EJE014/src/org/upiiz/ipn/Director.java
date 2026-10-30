package org.upiiz.ipn;

//Clase hija o sub clase
public class Director extends Empleado{
    private String periodo;
    private float sueldoBase;

    public Director(String nombre, String claveEmpleado, String unidad, String periodo) {
        super(nombre, claveEmpleado, unidad);
        this.periodo = periodo;
        sueldoBase = 0;
    }

    @Override
    public float calcularSalario() {
        return sueldoBase;
    }

    //Metodo concreto que se origina del metodo abstracto
    @Override
    public float calcularSalarioAnual() {
        return calcularSalario()*24+getAguinaldo()+getBono();
    }

    public void setSueldoBase(float sueldoBase){
        this.sueldoBase = sueldoBase;
    }

}
