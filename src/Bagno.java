public class Bagno {
    Semaforo semaforo;
    public Bagno(Semaforo semaforo){
        
        this.semaforo = semaforo;
    }

    public void usaBagno(String nome){
        System.out.println(nome + " occupa er bagno pazzo sgravoz");
        try {
            Thread.sleep((long) Math.random()*1000);
        } catch (Exception e) {
            
        }
        System.out.println(nome + " esce dal bagnoz sgravo");
        


    }
}