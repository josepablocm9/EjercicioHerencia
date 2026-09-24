package Ejercio_AeroValle;

public class Empleados {
    protected String nombre;
    protected String id;
    protected double salarioBase;
public Empleados(String nombre, String id, double salarioBase) {
    this.nombre = nombre;
    this.id = id;
    this.salarioBase = salarioBase;
}
public void setNombre(String nombre) { this.nombre = nombre; }
public void setId(String id) { this.id = id; }
public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase;
}





public double calcularSalario() {
    return salarioBase;
    }
    public String getNombre() { return nombre; }
}
