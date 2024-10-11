package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java ");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

          Bootcamp bootcamp = new Bootcamp();
          bootcamp.setNome("Bootcamp Java Developer");
          bootcamp.setDescricao("descricao Bootcamp Java Developer");
          bootcamp.getConteudo().add(curso1);
          bootcamp.getConteudo().add(curso2);
          bootcamp.getConteudo().add(mentoria);

          Dev devCamila = new Dev();
          devCamila.setNome("camila");
          devCamila.inscreverBootcamp(bootcamp);
          System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
          devCamila.progredir();
          System.out.println("_");
          System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
          System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
          System.out.println("XP:" + devCamila.calcularTotalxp());

          System.out.println("_____");

          Dev devJoao = new Dev();
          devJoao.setNome("João");
          devJoao.inscreverBootcamp(bootcamp);
          System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
          devJoao.progredir();
          System.out.println("_");
          System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
          System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
          System.out.println("XP:" + devJoao.calcularTotalxp());

    }
}
