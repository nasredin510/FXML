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
public class Etudiant implements Comparable<Etudiant>{
    public String Nom, Prenom;
    private GenreType Genre;
    private boolean Confirme;

    public Etudiant(String Nom, String Prenom) 
    {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Genre= GenreType.Masculin;
    }
    
    public boolean permuter(Groupe S, Groupe D)throws 
            EtudiantNonInscritException,
            GroupeDiffNiveauException,
            GroupeNonDisponibleException,GroupeDiffOptionException {
        if(Confirme)
            throw new EtudiantNonInscritException();
         
        if (S.getNiveau()!=D.getNiveau())
        {
            throw new GroupeDiffNiveauException();
        }
        if (!S.getOption().equalsIgnoreCase(D.getOption()))
        {
            throw new GroupeDiffNiveauException();
        }
        if (!S.rechercher(this)){
            throw new EtudiantNonInscritException();
        }
        
        boolean r = false;
        if(r=D.inscrire(this))
           S.quitter(this);
        return r;
    }

    public boolean est(String nom, String prenom) {
        
        
        return (this.Nom.equalsIgnoreCase(nom)&&this.Prenom.equalsIgnoreCase(prenom));
    }

    public void confirmer() {
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public GenreType getGenre() {
        return Genre;
    }

    public void setGenre(GenreType Genre) {
        this.Genre = Genre;
    }

    public boolean isConfirme() {
        return Confirme;
    }

    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "Nom=" + Nom + ", Prenom=" + Prenom + ", Genre=" + Genre + ", Confirme=" + Confirme + '}';
    }

    @Override
    public int compareTo(Etudiant o)
    {
        
        if(o.getNom().compareTo(this.Nom)==0)
            return o.getPrenom().compareTo(this.getPrenom());
        
        else return o.getNom().compareTo(this.Nom) ;
    }
    
    
            
}
