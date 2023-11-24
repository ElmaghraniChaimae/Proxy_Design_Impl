package org.elmaghrani.ServiceFichiers;

public class ServiceFichiersReel implements ServiceFichiers {
    @Override
    public void telechargerFichier(String nomFichier) {
        System.out.println("Téléchargement du fichier : " + nomFichier);
    }
}