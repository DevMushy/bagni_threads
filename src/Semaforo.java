public class Semaforo {
    int valore;
    public Semaforo(int valore){
        this.valore = valore;
    }
    synchronized public void p(){
        while(valore == 0){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        valore--;
    }

    synchronized public void v(){
        valore++;
        notify();
    }

    public int getvalore(){
        return valore;
    }
}
