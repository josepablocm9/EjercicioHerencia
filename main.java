package Ejercio_AeroValle;

public class main {
    public static void main(String[] args) {
        
    Empleados[] equipo = {
    new Piloto("Ana Gómez", "E-101", 4500.0, 60),
    new TecnicoMantenimiento("Luis Rivas", "E-102", 3800.0, 3),
    new AgenteVentas("Carla Mux", "E-103", 3200.0, 900.0),
    new Supervisor("Jorge Pérez", "E-104", 5000.0, 5)
    };
        for (Empleados e : equipo) {
        System.out.println(
        e.getNombre() + ": Q" + e.calcularSalario());
        }
    }
}


