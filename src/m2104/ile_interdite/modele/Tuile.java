/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2104.ile_interdite.modele;
import m2104.ile_interdite.util.*;
import java.util.ArrayList;

/**
 *
 * @author capelth
 */
public class Tuile {
    
    private TypeEtat etat;
    private String nomTuile;
    private CInondation cinondation;
    private Tresor tresor;
    private ArrayList<Aventurier> aventuriers = new ArrayList<>();
    
    public Tuile(String nomTuile, Tresor t, ArrayList<Aventurier> listav){
        setEtat(TypeEtat.SEC);
        setNomTuile(nomTuile);
        setTresor(t);
        setAventuriers(listav);
    }
    
    public Tuile(String nomTuile){
        setEtat(TypeEtat.SEC);
        setNomTuile(nomTuile);
        setTresor(null);
        setAventuriers(null);
    }

        
    public void inondé(CInondation c){
        c.getTuile().setEtat(TypeEtat.INNONDE);
    }
    
    public void assecher(){
        this.setEtat(TypeEtat.SEC);
    }
    
    /**
     * @return the etat
     */
    public TypeEtat getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(TypeEtat etat) {
        this.etat = etat;
    }

    /**
     * @return the nomTuile
     */
    public String getNomTuile() {
        return nomTuile;
    }

    /**
     * @param nomTuile the nomTuile to set
     */
    public void setNomTuile(String nomTuile) {
        this.nomTuile = nomTuile;
    }

    /**
     * @return the cinondation
     */
    public CInondation getCinondation() {
        return cinondation;
    }

    /**
     * @param cinondation the cinondation to set
     */
    public void setCinondation(CInondation cinondation) {
        this.cinondation = cinondation;
    }

    /**
     * @return the tresor
     */
    public Tresor getTresor() {
        return tresor;
    }

    /**
     * @param tresor the tresor to set
     */
    public void setTresor(Tresor tresor) {
        this.tresor = tresor;
    }

    /**
     * @return the aventuriers
     */
    public ArrayList<Aventurier> getAventuriers() {
        return aventuriers;
    }

    /**
     * @param aventuriers the aventuriers to set
     */
    public void setAventuriers(ArrayList<Aventurier> aventuriers) {
        this.aventuriers = aventuriers;
    }
    
    
    
}
