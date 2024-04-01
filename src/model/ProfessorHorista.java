package model;

import java.time.LocalDate;
import java.time.Month;

public class ProfessorHorista extends Professor {
    private int horasAula;
    private double valorHoraAula;

    public ProfessorHorista() {
        super();
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        if (horasAula < 1) {
            this.horasAula = 1;
        } else {
            this.horasAula = horasAula;
        }
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public void calcSalario() {
        System.out.println("Salario: " + String.format("%.2f",(this.valorHoraAula * this.horasAula)*10));
    }
}
