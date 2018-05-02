/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SULO
 */
public class Test {
    
    public void test() {
    Users user = new Users();
    user.setPassword("jana");
    user.setUsername("hoho");
    List<Users> list = new ArrayList<>();
    Collections.sort(list);
}
}
