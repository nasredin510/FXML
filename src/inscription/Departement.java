/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscription;

import java.util.ArrayList;

/**
 *
 * @author Ahmedo
 */
public class Departement {
    private String Nom;
    private String Specialte;
    private ArrayList<Groupe> lesGroupes;

    public Departement(String Nom, String Specialte) {
        this.Nom = Nom;
        this.Specialte = Specialte;
        lesGroupes=new ArrayList<>();
    }

    public ArrayList<Groupe> getLesGroupes() {
        return lesGroupes;
    }

    public void setLesGroupes(ArrayList<Groupe> lesGroupes) {
        this.lesGroupes = lesGroupes;
    }
    
    
    public ArrayList lister(){
        return this.lesGroupes;
    }
    public Groupe ouvrir (String option, int niveau){
        return null; 
    }
    public Groupe ouvrir (String option, int niveau, String nomGroupe)throws GroupeDejaExiste{
        
        Groupe  g=new Groupe(nomGroupe,option,niveau);
        if (this.lesGroupes.contains(g))
        {
            throw new GroupeDejaExiste();
        }
        this.lesGroupes.add(g);
        return g;
    }
    public ArrayList rechercher (String option, int niveau){
        ArrayList<Groupe> r=new ArrayList<>();
       int l=lesGroupes.size();
       /* for (int i=0;i<l;i++)
            {
                if (lesGroupes.get(i).est(option, niveau)){
                    r.add(lesGroupes.get(i));
                }
            }*/
       for(Groupe E:lesGroupes)
       {
           if (E.est(option, niveau))
               r.add(E);
       }
        return r;
       
    }
    public void equilibrer (String option, int niveau){
        
    }
    
    public void equilibrer (Groupe[] g){
        
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getSpecialte() {
        return this.Specialte;
    }

    public void setSpecialte(String Specialte) {
        this.Specialte = Specialte;
    }

    @Override
    public String toString() {
        return "Departement{" + "Nom=" + Nom + ", Specialte=" + Specialte + '}';
    }
    

}
