public class LpoStudent extends Student{

    private String barraOlimpica;

    public void snatch(boolean certo){
        if (certo == true){
            System.out.println("Belo arranco");
        } else {
            System.out.println("Vamos voltar aos fundamentos");
        }
    }



    public String getBarraOlimpica() {
        return barraOlimpica;
    }

    public void setBarraOlimpica(String barraOlimpica) {
        this.barraOlimpica = barraOlimpica;
    }
}
