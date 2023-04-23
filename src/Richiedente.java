public class Richiedente implements Runnable{
    private String nome;
    private Sportello sportello;
    

    Richiedente(String nome, Sportello sportello){
        this.nome = nome;
        this.sportello = sportello;

    }

    @Override
    public void run() {
        int tempoCompilazione = (int) (Math.random() * 5000) + 1;
        //chiedo il doc da compilare
        sportello.ottieniModulo();
        System.out.println("    "+nome+" ha ottenuto il modulo");
        //lo compilo in tot secondi
        try {
            Thread.sleep(tempoCompilazione);
        } catch (InterruptedException e) {
           
        }
        System.out.println("-> "+nome+" ha compilato il modulo");
        //chiedo la stampa della carta 
        sportello.ottieniStampa();
        System.out.println(nome +" ha ottenuto la stampa");
    }

    public String getNome() {
        return nome;
    }
    
}
