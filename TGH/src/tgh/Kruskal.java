/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author SULO
 */
public class Kruskal {

    //strom zakořeněný ve městě 0
    private static Graf g;
    // seznam spojení od města k městu
    private static ArrayList<Hrana> hrany;
    // DisjointSet struktura
    private static DisjointSet dis;
    private static final Scanner sc = new Scanner(System.in);

    private void setridlist() {
        hrany.sort(
                Comparator.comparingInt(Hrana::getMirazateze).thenComparingInt(Hrana::getCenauseku));
    }

    private void kruskaluj(int pocet) {
        for (int i = 0; i < hrany.size(); i++) {
            Hrana h = hrany.get(i);
            // pokud je nalezeno n-1 spojení (minimální kostra grafu)
            if (pocet-1 > g.hrany.size())
            {
            if (dis.findparent(h.getPrvni()) != dis.findparent(h.getDruhy())) {
                dis.union(h.getPrvni(), h.getDruhy());
                g.pridejHranu(h);
                
            }
            
            }
            
               
            
        }
         for(int j=0;j<g.hrany.size();j++)
                {
                    
                    System.out.println(g.hrany.get(j).getPoradi());    
                }
        
    }

    /**
     * @param pocet - total count of the cities
     */
    public Kruskal(int pocet) {
        hrany = new ArrayList<>();
        dis = new DisjointSet(pocet);
        g = new Graf();

    }

    private void pridejHrany(int od, int to, int cena, int mirazateze, int poradi) {
        hrany.add(new Hrana(od, to, cena, mirazateze, poradi));
    }

    public static void main(String[] args) {
        int pocet = sc.nextInt();
        int pocetvariant = sc.nextInt();
        Kruskal krus = new Kruskal(pocet);
        for (int i = 0; i < pocetvariant; i++) {
            int od = sc.nextInt();
            int to = sc.nextInt();
            int cenaspoje = sc.nextInt();
            int mirazateze = sc.nextInt();
            krus.pridejHrany(od, to, cenaspoje, mirazateze, i);
        }
        krus.setridlist();
        krus.kruskaluj(pocet);
        

        //. TODO code application logic here
    }

}

class DisjointSet {

    ArrayList<Vrchol> vrcholy;

    public DisjointSet(int pocet) {
        vrcholy = new ArrayList();

        for (int i = 0; i < pocet; i++) {

            makeset(i);

        }
    }
    // vytvoří set pro každý uzel, který je sám sobě rodičem
    private void makeset(int index) {
        Vrchol v = new Vrchol();
        v.hodnota = index;
        v.rank = 0;
        v.parent = index;
        this.vrcholy.add(v);
    }
    // najde rodiče pro zadaný vrchol a vrátí vrchol
    public Vrchol findparent(int cislo) {
        Vrchol v = vrcholy.get(cislo);
        if (v.parent == v.hodnota) {
            return v;
        } else {
            return findparent(v.parent);

        }

    }
    // spojí dva vrcholy, pokud nejsou ve stejné skupině
    public void union(int prvni, int druhy) {
        Vrchol par1 = findparent(vrcholy.get(prvni).hodnota);
        Vrchol par2 = findparent(vrcholy.get(druhy).hodnota);
        if (par1 != par2) {
            if (par1.rank >= par2.rank) {
                if (par1.rank == par2.rank) {
                    par1.rank++;
                }
                par2.parent = par1.hodnota;
            } else {
                par1.parent = par2.hodnota;
            }
        }
    }

}

class Vrchol {

    int rank;
    int parent;
    int hodnota;

}

class Hrana {

    public int getCenauseku() {
        return cenauseku;
    }

    public int getMirazateze() {
        return mirazateze;
    }

    public int getPrvni() {
        return prvni;
    }

    public int getDruhy() {
        return druhy;
    }

    public int getPoradi() {
        return poradi;
    }

    private int prvni;
    private int druhy;
    private int cenauseku;
    private int mirazateze;
    private int poradi;

    public Hrana(int od, int to, int cenauseku, int mirazateze, int poradi) {

        this.prvni = od;
        this.druhy = to;
        this.cenauseku = cenauseku;
        this.mirazateze = mirazateze;
        this.poradi = poradi;
    }
}

class Graf {
    ArrayList<Integer>pole;
    ArrayList<Hrana> hrany;

    public Graf() {
        this.hrany = new ArrayList();
    }

    public void pridejHranu(Hrana h) {
        hrany.add(h);
    }
    
                    
        
    

}
