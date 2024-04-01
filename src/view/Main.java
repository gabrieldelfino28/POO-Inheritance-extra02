package view;

import model.Professor;
import model.ProfessorHorista;
import model.ProfessorTitular;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProfessorTitular p1 = new ProfessorTitular();
        p1.setNomeProfessor("João");
        p1.setCodProfessor("1009-XZ");
        p1.setIdade(42);
        p1.setSalario(2000);
        p1.setAnosInstituicao(2009);
        System.out.println("Titular -> " + p1.getNomeProfessor() + ";" + p1.getCodProfessor() + ";" + p1.getIdade() + ";" + p1.getAnosInstituicao() + ";" );
        p1.calcSalario();

        ProfessorHorista p2 = new ProfessorHorista();
        p2.setNomeProfessor("Carlos");
        p2.setCodProfessor("2909-DB");
        p2.setIdade(32);
        p2.setHorasAula(8);
        p2.setValorHoraAula(24);
        System.out.println("Horista -> " +p2.getNomeProfessor() + ";" + p2.getCodProfessor() + ";" + p2.getIdade() + ";" );
        p2.calcSalario();
    }
}
