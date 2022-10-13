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
public class GroupeNonDisponibleException extends Exception {

    /**
     * Creates a new instance of <code>GroupeNonDisponibleException</code>
     * without detail message.
     */
    public GroupeNonDisponibleException() {
        this("Goupe non disponible:inscription impossible");
    }

    /**
     * Constructs an instance of <code>GroupeNonDisponibleException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public GroupeNonDisponibleException(String msg) {
        super(msg);
    }
}
