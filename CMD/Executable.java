/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CMD;

import java.io.File;

/**
 *
 * @author SULO
 */
public interface Executable {

    /**
     *
     * @param actualDir
     * @return
     */
    public String execute(File actualDir);
}
