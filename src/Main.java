import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso(); 
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso(); 
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria(); 
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        Dev devJean = new Dev();
        devJean.setNome("Jean");
        devJean.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jean: "+devJean.getConteudosInscritos());
        devJean.progredir();
        System.out.println("Conteúdos Concluídos Jean: "+devJean.getConteudosConcluidos());
        System.out.println("XP:" + devJean.calcularTotalXp());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: "+devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteúdos Concluídos Pedro: "+devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());
    }
}
