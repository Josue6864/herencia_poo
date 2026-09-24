package com.mycompany.herencia_poo;

public class Supervisor extends Empleado {
    private int equiposSupervisados;
    private static final double BONO_POR_EQUIPO = 500.0;

    public Supervisor(String nombre, String id, double salarioBase, int equiposSupervisados) {
        super(nombre, id, salarioBase); 
        this.equiposSupervisados = equiposSupervisados;
    }

    @Override
    public double calcularSalario() {
        // reutiliza la lógica del padre y le suma el bono por equipo
        return super.calcularSalario() + (equiposSupervisados * BONO_POR_EQUIPO);
    }
}