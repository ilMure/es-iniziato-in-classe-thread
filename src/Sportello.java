public class Sportello {
    private boolean disponibile = true;

    public synchronized void ottieniModulo(){}

    public synchronized void ottieniStampa(){
        while (!disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }        
        disponibile = false;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
        }
        disponibile = true;
        notifyAll();
    }
}
