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
public class DelegueDerogataireException extends Exception {

    /**
     * Creates a new instance of <code>DelegueDerogataireException</code>
     * without detail message.
     */
    public DelegueDerogataireException() {
        this("Un dérogataire ne peut etre un délégué de classe");
    }

    /**
     * Constructs an instance of <code>DelegueDerogataireException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DelegueDerogataireException(String msg) {
        super(msg);
    }
}
