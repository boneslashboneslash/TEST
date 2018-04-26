/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SULO
 */
public class Generics {

  
 public void Casting()
 {
     List<String> list = new ArrayList<String>();
     list.add("a String");
     list.add("and another one");
     
     String s = list.get(0);
     String s2 = list.get(1);
 }
    public void boxerTest()
    {
        List<Box> boxes = new ArrayList<>();
        Box box = new Box();
        box.setObj("a String");
        Box box2 = new Box();
        box2.setObj("another one");
        
        boxes.add(box);
        boxes.add(box2);
        
        box.inspect(22);
    }
    public void usingPairs()
    {
      pair<String, String> p1 = new OrderedPair<>("key","Value");  
      pair<Integer, String> p2 = new OrderedPair<>(5,"Value");  
    }
    public void showsumnumbers()
    {
        sumOfNumbers(Arrays.asList(1,2,3));
        sumOfNumbers(Arrays.asList(1.5,2.44,3.77));
         sumOfNumbers(Arrays.asList(5L,2,3));
    }
    
    public void sumOfNumbers(List<? extends Number> numbers)
    {
        double d = 0.0;
        for (Number n : numbers)
        {
            d += n.doubleValue();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
