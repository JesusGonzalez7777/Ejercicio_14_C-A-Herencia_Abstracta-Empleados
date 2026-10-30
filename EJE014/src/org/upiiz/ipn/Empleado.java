package org.upiiz.ipn;

public abstract class Empleado {
      private String nombre;
      private String claveEmpleado;
      private String unidad;
      private float aguinaldo;
      private float bono;

      public Empleado(String nombre, String claveEmpleado, String unidad) {
          this.nombre=nombre;
          this.claveEmpleado =claveEmpleado;
          this.unidad = unidad;
          this.aguinaldo = 0;
          this.bono = 0;
      }

      // Las sub-clases que me extienden definir el calculo
      public abstract float calcularSalario();
      public abstract float calcularSalarioAnual();

      public void mostrarInformacion(){
          System.out.println("-----------------");
          System.out.println("Nombre: "+nombre);
          System.out.println("Clave: "+claveEmpleado);
          System.out.println("Unidad: "+unidad);
          System.out.println("Salario: "+calcularSalario());
      }

    public float getAguinaldo(){
        return aguinaldo;
    }

    //Metodo concreto
    public void setAguinaldo(float aguinaldo){
        this.aguinaldo=aguinaldo;
    }

    //Metodo concreto
    public float getBono(){
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
}
