

/**
 * Created by valde on 2019-03-02.
 */
public class TestProblemeProducteurConsommateur {
    public static void main(String args[]){

        Depot depot = new Depot(10);

        Producteur producteur1 = new Producteur(depot, "PRODUC 1 ");
        Producteur producteur2 = new Producteur(depot, "PRODUC 156 ");
         Producteur producteur3 = new Producteur(depot, "PRODUC 161245 ");
        Consommateur consommateur1 = new Consommateur(depot, "CONSO 1 ");
        Consommateur consommateur2 = new Consommateur(depot, "CONSO 151 ");
        Consommateur consommateur3 = new Consommateur(depot, "CONSO 55 ");
        Consommateur consommateur4 = new Consommateur(depot, "CONSO 4756 ");
        producteur1.start();
        producteur2.start();
        consommateur1.start();
        // consommateur2.start();
        producteur3.start();
        consommateur3.start();
        //consommateur4.start();
    }
}
