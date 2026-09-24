package com.mycompany.herencia_poo;

/**
 * Josue Garcia 26375
 */
public class Herencia_poo {

    public static void main(String[] args) {
        Empleado[] equipo = {
            new Piloto("Julio Profe", "E-01", 4500.0, 60),
            new TecnicoMantenimiento("Kevin Velasquez", "E-02", 3800.0, 3),
            new AgenteVentas("Kevin Guitierrez", "E-03", 3200.0, 900.0),
            new Supervisor("Obed Kevin", "E-04", 4000.0, 3)
        };

        for (Empleado e : equipo) {
            System.out.println(e.getNombre() + ": Q" + e.calcularSalario());
        }
    }
}
