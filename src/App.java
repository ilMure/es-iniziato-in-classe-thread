public class App {
    public static void main(String[] args) throws Exception {
        Sportello s = new Sportello();
        
        Richiedente r1 = new Richiedente("Mario", s);
        Thread rich1 = new Thread(r1);
        Richiedente r2 = new Richiedente("Giulio", s);
        Thread rich2 = new Thread(r2);
        Richiedente r3 = new Richiedente("Elena", s);
        Thread rich3 = new Thread(r3);
        Richiedente r4 = new Richiedente("Francesca", s);
        Thread rich4 = new Thread(r4);
        Richiedente r5 = new Richiedente("Roberto", s);
        Thread rich5 = new Thread(r5);

        rich1.start();
        rich2.start();
        rich3.start();
        rich4.start();
        rich5.start();
    }
}
