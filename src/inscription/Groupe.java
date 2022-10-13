/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscription;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author Ahmedo
 */
public class Groupe {
    private String NomGroupe;
    private int NombreMax;
    private String Option;
    private int Niveau;
    private Etudiant delgue;
    private TreeSet<Etudiant> lesEtudiant =new TreeSet<Etudiant>();
    Iterator<Etudiant> itr=lesEtudiant.iterator(); 
    
    

    public TreeSet<Etudiant> getLesEtudiant() {
        return lesEtudiant;
    }

    public void setLesEtudiant(TreeSet<Etudiant> lesEtudiant) {
        this.lesEtudiant = lesEtudiant;
    }
    public void avoirDelegue(Etudiant e)throws DelegueDerogataireException{
        if (e instanceof EtudiantDerogataire){
            throw new DelegueDerogataireException();
        }
    this.delgue=e;}

    public Groupe(String NomGroupe, String Option, int Niveau) {
        this.NomGroupe = NomGroupe;
        this.Option = Option;
        this.Niveau = Niveau;
        
    }
    
    
    public boolean rechercher (Etudiant etudiant){
        return lesEtudiant.contains(etudiant);
    }
    public boolean estDisponible(){
        return this.nombreInscriNonDerogataires()<this.NombreMax ;
        
    }
    public boolean est(String Option, int niveau){
        return (this.Option.equalsIgnoreCase(Option) && this.Niveau==niveau);
        
    }
    public  TreeSet<Etudiant> lister(){
        return this.lesEtudiant;
        
    }
    public boolean inscrire(Etudiant E)throws GroupeNonDisponibleException{
        if(this.nombreInscrits()>=this.NombreMax){
            throw new GroupeNonDisponibleException();
        }
        return this.lesEtudiant.add(E);
    }
    public void quitter(Etudiant E)throws EtudiantNonInscritException{
        if (!this.rechercher(E)){
            throw new EtudiantNonInscritException();
        }
    }
    public Etudiant delegueGroupe(){
        return this.delgue;  
    }
    public int nombreInscrits(){
        return this.lesEtudiant.size();
    }
    public int nombreInscriNonDerogataires(){
        int nb=0;
        while(this.itr.hasNext()){
            if (  !(this.itr instanceof EtudiantDerogataire)) {
                nb=nb+1;
            } 
;
        }
        
        return nb;
    }   

    public String getNomGroupe() {
        return NomGroupe;
    }

    public void setNomGroupe(String NomGroupe) {
        this.NomGroupe = NomGroupe;
    }

    public int getNombreMax() {
        return NombreMax;
    }

    public void setNombreMax(int NombreMax) {
        this.NombreMax = NombreMax;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String Option) {
        this.Option = Option;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int Niveau) {
        this.Niveau = Niveau;
    }

    @Override
    public String toString() {
        if (this.Niveau==1)
            return "L" + Niveau + "-TINF" + NomGroupe;
        else 
           return "L" + Niveau + "-" + Option + NomGroupe; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Groupe other = (Groupe) obj;
        if (this.Niveau != other.Niveau) {
            return false;
        }
        if (!Objects.equals(this.Option, other.Option)) {
            return false;
        }
        return true;
    }
    
}
