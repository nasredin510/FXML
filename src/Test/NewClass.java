/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import inscription.Etudiant;
import inscription.EtudiantDerogataire;
import inscription.GenreType;
import inscription.Groupe;
import inscription.GroupeNonDisponibleException;

/**
 *
 * @author Ahmedo
 */
public class NewClass {
    public static void main(String args[]){
         Etudiant E1=new Etudiant("amine","Touihri");
        Etudiant E2= new Etudiant("Hazem","Ben Saria");
        System.out.println(E1.est("amine","Touihri"));
        System.out.println(E2.est("hazem","Ben Saria"));
        System.out.println(E1.toString());
        EtudiantDerogataire ED=new EtudiantDerogataire("Lina Medina","Gassouma");
        System.out.println(ED.est("lina medina","Gassouma"));
        ED.setGenre(GenreType.Feminin);
        
        System.out.println(ED.toString());
        Groupe G1= new Groupe("1","DSI",1);
        Groupe G2= new Groupe("2","DSI",1);
        Groupe G3= new Groupe("3","DSI",1);
        
        G1.setNombreMax(3);
        System.out.println("G1 "+G1.est("DSI",2));
        System.out.println("G1 "+G1.est("RSI",1));
        System.out.println("G1 "+G1.est("DSI",3));
        try{
               System.out.println("inscrire  "+ G1.inscrire(E1));
                System.out.println("inscrire  "+ G1.inscrire(ED));
                 System.out.println("inscrire  "+ G1.inscrire(E2));
           }
        catch(GroupeNonDisponibleException EX)
        {
             System.out.println(EX.getMessage());   
        }
        try{
            System.out.println("permuter"+E1.permuter(G1, G2));
        }
        catch(Exception E){
            System.out.println(E.getMessage());
        }
            
    
    }
}
