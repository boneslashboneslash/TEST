/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author SULO
 * @param <T>
 */
public class Box<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public <U extends Number> void inspect(U u)
    {
        System.out.println("T:"+ obj.getClass().getName());
        System.out.println("U:" + u.getClass().getName());
    }       
}
