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
public class GroupeDiffOptionException extends Exception {

    /**
     * Creates a new instance of <code>GroupeDiffOptionException</code> without
     * detail message.
     */
    public GroupeDiffOptionException() {
        this("Goupe a options difféerentes: permutation impossible");
    }

    /**
     * Constructs an instance of <code>GroupeDiffOptionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GroupeDiffOptionException(String msg) {
        super(msg);
    }
}
