/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package townsconnection;

/**
 *
 * @author lukas.soucek
 */
public class Connections {
  private int [] groups;
  
  Connections(int nodeCount)
  {
      if(nodeCount <=0)
      {
          throw new IllegalArgumentException("Počet uzlů je špatný");
      }
      groups = new int [nodeCount];
      for(int i=0;i<groups.length;i++)
      {
          groups[i] = i;
      }
  }
  // nezapomínat na ošetření výjimky
  public void addConnection(int index1, int index2)
  {
      existsconnection(index1, index2);
      for(int i=0;i<groups.length;i++)
      {
          if(groups[i] == groups[index2])
          {
              groups[i] = groups[index1];
          }
      }
  }
  // vrátí true, když cesta existuje a vrátí false, když neexistuje :) jak prosté
  // výjimka se vyhoi
  public boolean isConnection(int index1, int index2)
  {
      existsconnection(index1, index2);
     return groups[index1] == groups[index2];
  }
 private void existsconnection(int a, int b)
 {
     if(a > groups.length-1 || b > groups.length-1  || a< 0 || b<0)
              {
                  throw new ArrayIndexOutOfBoundsException("Špatný index");
              }
 }
  public boolean connectedall()
  {
      for(int i=0;i<groups.length-1;i++)
      {
          if(groups[i] != groups[i+1])
          {
              return false;
          }
      }
      return true;
                  
  }
  
   
      
 
}
