public class App {
    public static void main(String[] args) throws Exception {
        Semaforo d = new Semaforo(2);
        Semaforo u = new Semaforo(2);
        Bagno D = new Bagno(d);
        Bagno U = new Bagno(u);
        Persona p = new Persona("maria",D);
        Persona p1 = new Persona("anna",D);
        Persona p2 = new Persona("giorgia",D);

        Persona p3 = new Persona("mirko",U);
        Persona p4 = new Persona("andrea",U);
        Persona p5 = new Persona("alessandro",U);

        p.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();

        System.out.println("tutti i bagni sono vuoti");
    }
}