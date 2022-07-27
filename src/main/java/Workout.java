public class Workout {

    public static void main(String[] args) {

        Student stu1 = new Student();

        LpoStudent lpo1 = new LpoStudent();
        LpoStudent lpo2 = new LpoStudent();

        GinasticStudent gin1 = new GinasticStudent();
        GinasticStudent gin2 = new GinasticStudent();

        BodyBuildingStudent bod1 = new BodyBuildingStudent();
        BodyBuildingStudent bod2 = new BodyBuildingStudent();


        System.out.println("------------------------------------");
        System.out.println("Aluno de LPO");
        lpo1.setNome("Michael");
        lpo1.setEsportePreferido("Musculação e Basquete");
        System.out.println("Aluno: " + lpo1.getNome() + " \nEsporte preferido: " + lpo1.getEsportePreferido());
        lpo1.snatch(false);
        lpo1.hydrate();

        System.out.println("------------------------------------");


        System.out.println("\nAluno de Ginastic");
        gin1.setNome("Abreu");
        gin1.setEsportePreferido("Ginastica Olimpica");
        System.out.println("Aluno: " + gin1.getNome() + "\nEsporte preferido: " + gin1.getEsportePreferido());
        gin1.start();
        gin1.mortal(7);


        System.out.println("\nAluno de Ginastic");
        gin2.setNome("Daiane dos Santos");
        gin2.setEsportePreferido("Ginastica artistic");
        System.out.println("Aluno: " + gin2.getNome() + "\nEsporte preferido: " + gin2.getEsportePreferido());
        gin2.mortal(10);

        System.out.println("------------------------------------");

        System.out.println("\nAluno de Bodybuilding");
        bod1.setNome("Rodolfo Cia");
        bod1.setEsportePreferido("Musculação, Chama no SAGRADO!!");
        System.out.println("Aluno: " + bod1.getNome() + "\nEsporte preferito: " + bod1.getEsportePreferido());
        bod1.training();
        bod1.frontSquat(30);
        bod1.frontSquat(50);
        bod1.frontSquat(90);









    }
}
