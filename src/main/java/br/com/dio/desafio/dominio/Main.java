package br.com.dio.desafio.dominio;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Basico");
        curso2.setTitulo("Curso Java basico");
        curso2.setDescricao("Descrição do curso de Java Basico");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos José:" + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos José:" + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos José:" + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());

        System.out.println("-----------------------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria:" + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());




    }
}
