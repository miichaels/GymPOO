public class Running extends Student{

    private String sprint;

    public void sprint100(String nome){
        System.out.println("Belo tiro!");
    }

    public void personal(double tempo){
        if(tempo >= 0.7){
            System.out.println("Estamos chegando no tempo.");
        }else if (tempo <= 0.6){
            System.out.println("Vamos melhorar esse tempo!!");
        }else {
            System.out.println("Amanha tentaremos de novo, descanse");
        }
    }

}
