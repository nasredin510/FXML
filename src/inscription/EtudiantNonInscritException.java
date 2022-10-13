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
public class EtudiantNonInscritException extends Exception {

    /**
     * Creates a new instance of <code>EtudiantNonInscritException</code>
     * without detail message.
     */
    public EtudiantNonInscritException() {
        this("L'étudiant n'est pas inscrit dans ce groupe:permutation impossible");
    }

    /**
     * Constructs an instance of <code>EtudiantNonInscritException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public EtudiantNonInscritException(String msg) {
        super(msg);
    }
}
