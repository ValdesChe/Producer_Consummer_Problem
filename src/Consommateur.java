
import java.util.Random;

/**
 * Created by valde on 2019-03-02.
 */
public class Consommateur extends Thread {

    Depot depot ;

    public Consommateur(Depot depot){
        super("CONSOM");
        this.depot = depot;
    }


    /***
     *  Constructeur
     * @param depot
     * @param name
     */
    public Consommateur(Depot depot, String name){
        super(name);
        this.depot = depot;
    }

    public void run(){
        while (true){
            Random r = new Random();
            if (consommer()){
                try {
                    // Entre 150 - 350
                    sleep(r.nextInt(10)*(20)+150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + ": a consommer !");
            }

            else{
                yield();
                try {
                      sleep(r.nextInt(200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public boolean consommer(){
        return depot.retirer();
    }
}
