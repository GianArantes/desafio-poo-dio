import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGian = new Dev();
        devGian.setNome("Gian");
        devGian.inscreverBootcamp(bootcamp);
       

        Dev devAry = new Dev();
        devAry.setNome("Ary");
        devAry.inscreverBootcamp(bootcamp);
        



        System.out.println("Conteúdos inscritos Gian: " + devGian.getConteudosInscritos());

        devGian.progredir();
        devGian.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gian: " + devGian.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gian: " + devGian.getConteudosConcluidos());
        System.out.println("XP: " + devGian.calcularTotalXp());

        System.out.println("================================");

        System.out.println("Conteúdos inscritos Ary: " + devAry.getConteudosInscritos());
        devAry.progredir();
        devAry.progredir();
        devAry.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ary: " + devAry.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ary: " + devAry.getConteudosConcluidos());
        System.out.println("XP: " + devAry.calcularTotalXp());





    }
}
