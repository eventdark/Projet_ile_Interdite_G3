package m2104.ile_interdite.util;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTextField;
import m2104.ile_interdite.modele.*;

/**
 *
 * @author IUT2-Dept Info
 */
public class Message implements Serializable {

    public static long serialVersionUID = 1L;
    public Integer idAventurier;
    public Integer idCarte;
    public Utils.Tresor tresor;
    public Integer idTuile;
    public Integer nbJoueurs;
    public ArrayList<Tuile> tuiles;
    public int[] coords = new int[2];
    public TypePion pion;
    public String[] nomJoueurs;
    public int nivEau;
    public int nombreJoueurs;
    public TypeAction type;
    public Aventurier aventurier;

    public Message() {
        idAventurier = null;
        idCarte = null;
        tresor = null;
        idTuile = null;
        nbJoueurs = null;
        tuiles = new ArrayList();
        
    }
    
    private Message(TypeAction type, Integer idAventurier, Integer idCarte, Utils.Tresor tresor, Integer idTuile, Integer nbJoueurs) {
        this.type = type;
        this.idAventurier = idAventurier;
        this.idCarte = idCarte;
        this.tresor = tresor;
        this.idTuile = idTuile;
        this.nbJoueurs = nbJoueurs;
        tuiles = new ArrayList();
    }
    
    public Message(TypeAction typeAction) {
        this.type = typeAction;
    }

    /**
     *
     * @param nbJoueurs
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#VALIDER_JOUEURS}
     */
    public static Message validerJoueurs(int nbJoueurs) {
        return new Message(TypeAction.VALIDER_JOUEURS, null, null, null, null, nbJoueurs);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#BOUGER}
     */
    public static Message bouger(int idAventurier) {
        return new Message(TypeAction.BOUGER, idAventurier, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#ASSECHER}
     */
    public static Message assecher(int idAventurier) {
        return new Message(TypeAction.ASSECHER, idAventurier, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#DONNER}
     */
    public static Message donner(int idAventurier) {
        return new Message(TypeAction.DONNER, idAventurier, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#RECUPERER_TRESOR}
     */
    public static Message recupererTresor(int idAventurier) {
        return new Message(TypeAction.RECUPERER_TRESOR, idAventurier, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#TERMINER}
     */
    public static Message terminer(int idAventurier) {
        return new Message(TypeAction.TERMINER, idAventurier, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#RECEVOIR}
     */
    public static Message recevoir(int idAventurier) {
        return new Message(TypeAction.RECEVOIR, idAventurier, null, null, null, null);
    }

    /**
     *
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#CHOISIR_CARTE}
     */
    public static Message choisirCarte() {
        return new Message(TypeAction.CHOISIR_CARTE, null, null, null, null, null);
    }

    /**
     *
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#CHOISIR_TUILE}
     */
    public static Message choisirTuile() {
        return new Message(TypeAction.CHOISIR_TUILE, null, null, null, null, null);
    }

    /**
     *
     * @param idAventurier
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#DEPLACER}
     */
    public static Message deplacer(int idAventurier) {
        return new Message(TypeAction.DEPLACER, idAventurier, null, null, null, null);
    }

    /**
     *
     * @return un nouveau {@link #Message} pour la commande {@link m2104.ile_interdite.util.Utils.Commandes#VOIR_DEFAUSSE}
     */
    public static Message voirDefausse() {
        return new Message(TypeAction.DEFAUSSER, null, null, null, null, null);
    }

    /**
     * @return the commande
     */
    public Boolean hasCommande() {
        return type != null;
    }
    public TypeAction getCommande() {
        return type;
    }

    /**
     * @return the idAventurier`
     */
    public Boolean hasIdAventurier() {
        return idAventurier != null;
    }
    public Integer getIdAventurier() {
        return idAventurier;
    }

    /**
     * @return the idCarte
     */
    public Boolean hasIdCarte() {
        return idCarte != null;
    }
    public Integer getIdCarte() {
        return idCarte;
    }

    /**
     * @return the tresor
     */
    public Boolean hasTresor() {
        return tresor != null;
    }
    public Utils.Tresor getTresor() {
        return tresor;
    }

    /**
     *
     * @return the nbJoueurs
     */
    public Boolean hasNbJoueurs() {
        return nbJoueurs != null;
    }
    public Integer getNbJoueurs() {
        return nbJoueurs;
    }

    /**
     * @return the idTuile
     */
    public Boolean hasIdTuile() {
        return idTuile != null;
    }
    public Integer getIdTuile() {
        return idTuile;
    }

    @Override
    public String toString() {
        String txt = "";
        txt += type.toString() + " ";
        if (hasIdAventurier()) {
            txt += " aventurier=" + idAventurier;
        }
        if (hasIdCarte()) {
            txt += " carte=" + idCarte;
        }
        if (hasIdTuile()) {
            txt += " tuile=" + idTuile;
        }
        if (hasTresor()) {
            txt += " tresor=" + tresor.toString();
        }
        return txt;
    }    
    
}
