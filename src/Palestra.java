enum Luz {
    vermelho, ambar, verde
}

public class Palestra {
    private Luz luz;

    public Palestra(Luz luz){
        this.luz = luz;
    }

    public Luz getLuz(){
        return luz;
    }

    public void dif(Luz luz){
        switch (luz) {
            case vermelho:
                System.out.println("Palestra Indisponível!");
                break;
            case ambar:
                System.out.println("Palestra sendo liberada!");
                break;
            case verde:
                System.out.println("Palestra disponível!");
                break;
        }
    }

}
