/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cl.Burgos.Trabajos.Main;

import Cl.Burgos.Trabajos.FUN.Directorio;
import Cl.Burgos.Trabajos.GUI.FrHome;
import Cl.Burgos.Trabajos.GUI.GitHubReleaseGUI;

/**
 *
 * @author march
 */
public class ApliTrabajos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String repo = "https://github.com/marcheloBM/ActualizacionAPP";
        String versionActual = "2.0";

        if (GitHubReleaseGUI.hayNuevaVersion(repo, versionActual)) {
            System.out.println("🟢 Hay una nueva versión disponible.");
            GitHubReleaseGUI.main(args);
        } else {
            System.out.println("✅ Estás usando la última versión.");
            Directorio.crearDirecPre();
            FrHome home = new FrHome();
            home.setVisible(true);
        }
    }    
}
