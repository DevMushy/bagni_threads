public class Persona extends Thread{
    String nome;
    Bagno bagno;
    public Persona(String nome, Bagno bagno){
        this.bagno = bagno;
        this.nome = nome;
    }

    public void run(){
        
        bagno.usaBagno(nome);
    }




}
