/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2104.ile_interdite.vue;

import java.awt.*;
import javax.swing.*;
import m2104.ile_interdite.modele.*;
import m2104.ile_interdite.util.*;
import java.util.ArrayList;

/**
 *
 * @author dupuyrem
 */
public class VueMainJoueur {

    private String urlImgs = "Images/texture_footer.png";
    private JFrame window;

    private JPanel mainPanel;
    private JPanel panelCentre;

    public VueMainJoueur(Grille g) {
        initialiserFenetreMain(g);
    }

    public void initialiserFenetreMain(Grille g) {

        /* paramètres de la fenetre : */
        window = new JFrame();
        window.setContentPane(new PanelFond(urlImgs, 952, 80));
        window.setSize(952, 80);
        window.setLocation(0, 780);
        window.setAlwaysOnTop(true);

        window.setUndecorated(Parameters.UNDECORATED);
        window.setResizable(Parameters.RESIZABLE);

        /* Partie IHM : */
 /* panel principal : */
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.setOpaque(false);

        // panel du centre : 
        panelCentre = new JPanel(new GridLayout(1, 6));
        panelCentre.setPreferredSize(new Dimension(952, 80));
        panelCentre.setOpaque(false);

        mainPanel.add(panelCentre, BorderLayout.CENTER);
        window.add(mainPanel);

        /* boucle du GridLayout du centre: */
 /* récupération des cartes du joueur courant : */
        Aventurier a = g.getIleInterdite().getJoueurCourant();
        dessinerMain(a);

    }

    public void dessinerMain(Aventurier a) {
        JLabel cartePanel = new JLabel();
        Image cartesJImg;
        CJoueur[] carteJoueurs = a.getCartes();

        for (int i = 0; i < carteJoueurs.length; i++) {
            if (carteJoueurs[i] != null) {
                String imgURL = "Images/cartes/" + carteJoueurs[i].toString() + ".png";
                cartesJImg = Toolkit.getDefaultToolkit().getImage(imgURL).getScaledInstance(50, 80, 50);
                cartePanel = new JLabel(new ImageIcon(cartesJImg));
                cartePanel.setPreferredSize(new Dimension(50, 50));
                cartePanel.setOpaque(true);

                panelCentre.add(cartePanel);
            }
        }
    }

    public void afficher() {
        this.window.setVisible(true);
    }

}
