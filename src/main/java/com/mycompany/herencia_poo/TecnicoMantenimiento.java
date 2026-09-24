package com.mycompany.herencia_poo;

public class TecnicoMantenimiento extends Empleado {

    private int certificaciones;

    public TecnicoMantenimiento(String nombre, String id, double salarioBase, int certificaciones) {
        super(nombre, id, salarioBase);
        this.certificaciones = certificaciones;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + (certificaciones * 150.0);
    }
}
