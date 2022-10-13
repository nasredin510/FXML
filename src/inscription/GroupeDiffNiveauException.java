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
public class GroupeDiffNiveauException extends Exception {

    /**
     * Creates a new instance of <code>GroupeDiffNiveauException</code> without
     * detail message.
     */
    public GroupeDiffNiveauException() {
        this("Groupe a niveaux differents:permutation impossible");
    }

    /**
     * Constructs an instance of <code>GroupeDiffNiveauException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GroupeDiffNiveauException(String msg) {
        super(msg);
    }
}
