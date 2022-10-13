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
public class GroupeDejaExiste extends Exception{

    /**
     * Creates a new instance of <code>GroupeDejaExiste</code> without detail
     * message.
     */
    public GroupeDejaExiste()  {
        this("goupe deja exist");
    }

    /**
     * Constructs an instance of <code>GroupeDejaExiste</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GroupeDejaExiste(String msg) {
        super(msg);
    }
}
