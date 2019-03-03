
import com.sun.xml.internal.messaging.saaj.util.FinalArrayList;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by valde on 2019-03-02.
 */
public  class Depot {
    public int TAILLE_MAX = 15;
    public final ArrayList<Integer> depot ;

    public Depot(int taille){
        TAILLE_MAX = taille;
        depot = new ArrayList<>(TAILLE_MAX);
    }

    public Depot(){
        depot = new ArrayList<>(TAILLE_MAX);
    }

    synchronized public  boolean deposer(){

        if(getDepotSize() < this.TAILLE_MAX ){
            Random random = new Random();
            this.depot.add(random.nextInt(10)*(10)+1);

            System.out.println(depot.toString());
            return true;
        }else{
            System.err.println("PLEIN");

            System.out.println(depot.toString());
            return false;
        }


        /*try{
            this.depot.add(1);
            return true;
        }catch(Exception e){
            System.err.println("DEJA SATURE");
            return false;
        }*/
    }

    synchronized  public  boolean retirer(){

        if(getDepotSize() > 0){
            this.depot.remove(getDepotSize()-1);

            System.out.println(depot.toString());
            return true;
        }else{
            System.err.println("VIDE");

            System.out.println(depot.toString());
            return false;
        }
        /*try{
            this.depot.remove(getDepotSize()-1);
            return true;
        }catch(Exception e){
            System.err.println("DEJA VIDE");
            return false;
        }*/
    }

    synchronized public String toString(){
        return (depot.toString());
    }

    public int getDepotSize(){
        return depot.size();
    }

}
