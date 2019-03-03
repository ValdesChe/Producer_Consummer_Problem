
import java.util.Random;

/**
 * Created by valde on 2019-03-02.
 */
public class Producteur extends Thread {

    Depot depot ;

    public Producteur(Depot depot){
        super("PRODUC");
        this.depot = depot;
    }

    public Producteur(Depot depot, String name){
        super(name);
        this.depot = depot;
    }



    public void run(){
        while (true){
            Random r = new Random();
            if (produire()){
                try {
                    // Entre 100 - 200
                    sleep(r.nextInt(10)*(10)+300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(this.getName() + ": a produit !");
            }

            else{
                try {
                    sleep(r.nextInt(20)+100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                yield();
            }
        }
    }

    public boolean produire(){
        return depot.deposer();
    }

}
