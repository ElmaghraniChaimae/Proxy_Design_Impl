package org.elmaghrani.ProxyServicefichiers;

import org.elmaghrani.ServiceFichiers.ServiceFichiers;
import org.elmaghrani.ServiceFichiers.ServiceFichiersReel;

// Proxy du Service de Fichiers
public class ProxyServiceFichiers implements ServiceFichiers {
    private ServiceFichiersReel serviceFichiersReel;
    private String nomUtilisateur;

    public ProxyServiceFichiers(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    @Override
    public void telechargerFichier(String nomFichier) {
        // Vérification des autorisations avant d'accéder au service réel
        if (nomUtilisateur.equals("admin")) {
            // Création différée de l'objet réel
            if (serviceFichiersReel == null) {
                serviceFichiersReel = new ServiceFichiersReel();
            }

            // Accès au service réel
            serviceFichiersReel.telechargerFichier(nomFichier);
        } else {
            System.out.println("Accès refusé. Seul l'administrateur peut télécharger des fichiers.");
        }
    }
}

