/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author SULO
 * @param <K>
 * @param <V>
 */
public interface pair <K, V>{

    /**
     *
     * @return
     */
    public K getkey();

    /**
     *
     * @return
     */
    public V getValue();
}