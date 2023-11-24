package org.elmaghrani;

import org.elmaghrani.ProxyServicefichiers.ProxyServiceFichiers;
import org.elmaghrani.ServiceFichiers.ServiceFichiers;

public class Main {
    public static void main(String[] args) {
        // Utilisation du service via le Proxy
        ServiceFichiers service = new ProxyServiceFichiers("utilisateurOrdinaire");

        // Tentative de téléchargement de fichier par un utilisateur ordinaire
        service.telechargerFichier("document.pdf");

        // Utilisation du service via le Proxy par un administrateur
        ServiceFichiers serviceAdmin = new ProxyServiceFichiers("admin");

        // Téléchargement de fichier par l'administrateur
        serviceAdmin.telechargerFichier("rapport.docx");
    }
}
