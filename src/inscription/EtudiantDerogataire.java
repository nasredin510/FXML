/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscription;

/**
 *
 * @author Ahmedo
 */
public class EtudiantDerogataire extends Etudiant {
    public String demande;

    @Override
    public String toString() {
        return super.toString()+"EtudiantDerogataire{" + "demande=" + demande + '}';
    }

    public EtudiantDerogataire(String Nom, String Prenom) {
        super(Nom, Prenom);
    }
}
