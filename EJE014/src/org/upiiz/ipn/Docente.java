package org.upiiz.ipn;

//Clase hija o sub clase
public class Docente extends Empleado{
    private String materias;
    private float horasTrabajadas;
    private float precioPorHora;

    public Docente(String nombre, String claveEmpleado, String unidad, String materias) {
        super(nombre, claveEmpleado, unidad);
        this.materias = materias;
        horasTrabajadas = 0;
        precioPorHora = 0;
    }

    @Override
    public float calcularSalario() {
        return horasTrabajadas*precioPorHora;
    }

    //Metodo concreto que se origina del metodo abstracto
    @Override
    public float calcularSalarioAnual() {
        //calcularSalario() = 15 dias de trabajo
        //Aguinaldo - anuales
        //El bono - anual
        return calcularSalario()*24+getAguinaldo()+getBono();
    }

    public void setHorasTrabajadas(float horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPrecioPorHora(float precioPorHora){
        this.precioPorHora = precioPorHora;
    }

}
