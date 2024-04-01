package model;

import java.time.LocalDate;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular() {
        super();
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void calcSalario() {
        //M = C * (1 + i)^t
        //salNovo = x * 1.05 ^ ((anoAtual - anoIngresso) / 5)
        int anoDiff = LocalDate.now().getYear() - anosInstituicao;
        setSalario(getSalario()*Math.pow(1.05d, (anoDiff / 5d) ));
        System.out.println("Salario: " + String.format("%.2f", getSalario()));
    }
}
