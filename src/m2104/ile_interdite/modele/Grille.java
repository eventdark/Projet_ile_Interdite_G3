/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2104.ile_interdite.modele;
import java.util.ArrayList;
/**
 *
 * @author capelth
 */
public class Grille {
    
    private Tuile[][] tuiles;
    
    public Grille(ArrayList<Tuile> tuiles){
        this.tuiles = new Tuile[6][6];
        this.tuiles[0][2] = tuiles.get(0);
        this.tuiles[0][3] = tuiles.get(1);
        this.tuiles[1][1] = tuiles.get(2);
        this.tuiles[1][2] = tuiles.get(3);
        this.tuiles[1][3] = tuiles.get(4);
        this.tuiles[1][4] = tuiles.get(5);
        this.tuiles[2][0] = tuiles.get(6);
        this.tuiles[2][1] = tuiles.get(7);
        this.tuiles[2][2] = tuiles.get(8);
        this.tuiles[2][3] = tuiles.get(9);
        this.tuiles[2][4] = tuiles.get(10);
        this.tuiles[2][5] = tuiles.get(11);
        this.tuiles[3][0] = tuiles.get(12);
        this.tuiles[3][1] = tuiles.get(13);
        this.tuiles[3][2] = tuiles.get(14);
        this.tuiles[3][3] = tuiles.get(15);
        this.tuiles[3][4] = tuiles.get(16);
        this.tuiles[3][5] = tuiles.get(17);
        this.tuiles[4][1] = tuiles.get(18);
        this.tuiles[4][2] = tuiles.get(19);
        this.tuiles[4][3] = tuiles.get(20);
        this.tuiles[4][4] = tuiles.get(21);
        this.tuiles[5][2] = tuiles.get(22);
        this.tuiles[5][3] = tuiles.get(23);
        
    }
    
    
    public Tuile[] tuileAutour(Tuile t){
        Tuile[] tuilesAutour = new Tuile[4];
        int i = 0;
        int j = 0;
        while(tuiles[i][j] != t && i<tuiles.length){
            j = 0;
            while(tuiles[i][j] != t && j<tuiles[i].length){
                j++;
            }
            i++;
        }
        if(i != 0){
            tuilesAutour[0] = tuiles[i-1][j];
        }
        if(i != 5){
            tuilesAutour[1] = tuiles[i+1][j];
        }
        if(j != 0){
            tuilesAutour[2] = tuiles[i][j-1];
        }
        if(j != 5){
            tuilesAutour[3] = tuiles[i][j+1];
        }
        return tuilesAutour;
    }

    /**
     * @return the tuiles
     */
    public Tuile[][] getTuiles() {
        return tuiles;
    }

    /**
     * @param tuiles the tuiles to set
     */
    public void setTuiles(Tuile[][] tuiles) {
        this.tuiles = tuiles;
    }
    
}
