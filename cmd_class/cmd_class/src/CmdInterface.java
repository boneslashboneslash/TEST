/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukas.soucek
 */
public interface CmdInterface {

    /**
     *
     * @return absolute path
     */
    public String getActualDir();

    /**
     *
     * @param command
     * @return
     */
    public String execute (String command);
}
