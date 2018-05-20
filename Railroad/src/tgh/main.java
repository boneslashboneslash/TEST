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
public class main {

    //strom zakořeněný ve městě 0 (rekurze)
    private final Graf g;
    // seznam spojení od města k městu
    private final ArrayList<Edge> hrany;
    // DisjointSet struktura
    private final DisjointSet dis;
    private static final Scanner sc = new Scanner(System.in);

    private void setridlist() {
        hrany.sort(
                Comparator.comparingInt(Edge::getMirazateze).thenComparingInt(Edge::getCenauseku));
    }
    

    private int[] kruskaluj(int pocet) {
        // setřídí nejprve list dle ohodnocení hran (nejprve zátěž a poté cena) od nejmenší po největší
        setridlist();
        //pocet pridanych hran
        int count = 0;
        for (int i = 0; i < hrany.size(); i++) {

            Edge h = hrany.get(i);
            // pokud je nalezeno n-1 spojení (minimální kostra grafu)
            if (count != pocet) {
                // pokud nepatří ke stejné komponentě souvislosti, tak se přidá hrana
                // do výsledného grafu
                if (dis.findparent(h.getPrvni()) != dis.findparent(h.getDruhy())) {
                    dis.union(h.getPrvni(), h.getDruhy());
                    count++;
                    // g.pridejVysledek(h.getPrvni(),h.getDruhy());
                } else {
                    hrany.remove((int)i);
                }

            } 
            else
            {
                break;
            }
        
        }
       //dis.findparent(53);
        hrany.subList(count, hrany.size()).clear();
        g.pridejhranu(hrany);
        //g.vytvorkostru(hrany);
        // vrací výslednou kostru od města n-1
        g.kostramake(hrany,pocet-1);
        return g.vyslednakostra(pocet - 1);
        //return (g.vyslednakostra(pocet-1));
    }

    /**
     * @param pocet - total count of the cities
     */
    public main(int pocet) {
        hrany = new ArrayList<>();
        dis = new DisjointSet(pocet);
        g = new Graf();
    }

    private void pridejHrany(int od, int to, int cena, int mirazateze, int poradi) {
        hrany.add(new Edge(od, to, cena, mirazateze, poradi));
    }

    public static void main(String[] args) {

        if (sc.hasNextInt()) {
            int pocet = sc.nextInt();
            int pocetvariant = sc.nextInt();
            main krus = new main(pocet);
            for (int i = 0; i < pocetvariant; i++) {
                krus.pridejHrany(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), i);
            }
            //krus.kruskaluj(pocet);
            int[] j = krus.kruskaluj(pocet);
            for (int i = 0; i < j.length; i++) {
                System.out.println(j[i]);
            }
        }
    }
}

// třída DisjointSet udržující informace o příslušnosti ke komponentě
// souvislosti
class DisjointSet {

    ArrayList<Node> vrcholy;

    public Node getVrcholonIndex(int index) {
        return vrcholy.get(index);
    }

    public DisjointSet(int pocet) {
        vrcholy = new ArrayList();

        for (int i = 0; i < pocet; i++) {

            makeset(i);

        }
    }
    // vytvoří set pro každý uzel, který je sám sobě rodičem

    private void makeset(int index) {
        Node v = new Node(index);
        this.vrcholy.add(v);
    }
    // najde rodiče pro zadaný vrchol a vrátí vrchol

    public Node findparent(int parent) {

        Node v = vrcholy.get(parent);
        if (v.getParent() == v.getHodnota()) {
            return v;
        } else {

            return findparent(v.getParent());

        }

    }
    // spojí dva nodes, pokud nejsou ve stejné skupině

    public void union(int prvni, int druhy) {
        Node par1 = findparent(vrcholy.get(prvni).getHodnota());
        Node par2 = findparent(vrcholy.get(druhy).getHodnota());
        if (par1 != par2) {
            if (par1.getRank() >= par2.getRank()) {
                if (par1.getRank() == par2.getRank()) {
                    par1.setRank(par1.getRank() + 1);
                }
                par2.setParent(par1.getHodnota());
            } else {
                par1.setParent(par2.getHodnota());
            }
        }
    }

}
// třída reprezentující vrchol

class Node {

    private int rank;
    private int parent;
    private int hodnota;

    public Node(int index) {
        this.rank = 0;
        this.parent = index;
        this.hodnota = index;

    }

    public int getRank() {
        return rank;
    }

    public int getParent() {
        return parent;
    }

    public int getHodnota() {
        return hodnota;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public void setHodnota(int hodnota) {
        this.hodnota = hodnota;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}

class Edge {

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

    private final int prvni;
    private final int druhy;
    private final int cenauseku;
    private final int mirazateze;
    private final int poradi;

    public Edge(int od, int to, int cenauseku, int mirazateze, int poradi) {

        this.prvni = od;
        this.druhy = to;
        this.cenauseku = cenauseku;
        this.mirazateze = mirazateze;
        this.poradi = poradi;
    }
}

class Graf {

    //Hashmap<Vrchol,Integer> nodes;
    ArrayList<Edge> hrany;
    ArrayList<Node> nodes;

    public Graf() {
        hrany = new ArrayList();
        nodes = new ArrayList<>();

    }
    public void pridejhranu(ArrayList<Edge> hrany)
    {
        this.hrany = hrany;
    }
    public int findpath(int path,int druhy)
    {
        if(path != 0)
        {
        
            if(hrany.stream().filter(o->o.getPrvni() == path && o.getDruhy() != druhy).findFirst().isPresent())
            {
           
             findpath(hrany.stream().filter(o->o.getPrvni() == path).findFirst().get().getDruhy(),
                     hrany.stream().filter(o->o.getPrvni() == path).findFirst().get().getPrvni());    
            }
            else if(hrany.stream().filter(o->o.getDruhy() == path && o.getPrvni() != druhy).findFirst().isPresent())
            {
             findpath(hrany.stream().filter(o->o.getDruhy() == path).findFirst().get().getPrvni(),
                     hrany.stream().filter(o->o.getDruhy() == path).findFirst().get().getDruhy());   
            }           
             else
            {
                if(path >druhy)
                {
                  return 0;  
                }
                else 
                    return path;
            }
        }
       return 0;
        
    }

    
    // vytvoření kostry - parent = rodic, rank = poradi, hodnota = cislo vrcholu
    public void kostramake(ArrayList<Edge> edges,int pocet) {
        //int index = 0;
        //Hrana h = edges.stream().filter(o -> o.getDruhy() == j || o.getPrvni() == j  ).findFirst().get();
        //hrany.remove(h);
        for(int i=0;i<edges.size();i++)
        {
        final int j = pocet;
        if( edges.stream().filter(o -> o.getPrvni() == j).findFirst().isPresent())
        {
            Edge h = edges.stream().filter(o -> o.getPrvni() == j).findFirst().get();
            if ( findpath((h.getPrvni()),(h.getDruhy())) == findpath((h.getDruhy()),(h.getPrvni())) )  {
                    
            System.out.println(h.getPoradi());
            }
            else
            {
                    System.out.println(edges.stream().filter(o -> o.getDruhy() == j).findFirst().get().getPoradi());
                    }
        }
         else
        {
            Edge h = edges.stream().filter(o -> o.getDruhy() == j).findFirst().get();
            if ( findpath((h.getDruhy()),(h.getPrvni())) == findpath((h.getPrvni()),(h.getDruhy())) )  {
                    System.out.println(h.getPoradi());
            }
            else
            {
                    System.out.println(edges.stream().filter(o -> o.getPrvni() == j).findFirst().get().getPoradi());
                    }
        }
          //hrany = edges;       
        pocet--;
        }
      
    }

    // vypíše výsledek výsledné kostry od dětí k předkům
    public int[] vyslednakostra(int nula) {
        int[] vysledek = new int[nula];
        Node v = null;
        int pocet = nula;
        for (int i = nula; i > 0; i--) {
            final int tento = pocet;
            v = nodes.stream().filter(o -> o.getHodnota() == tento).findFirst().get();
            vysledek[i - 1] = v.getRank();
            pocet--;

            //Hrana h = hrany.stream().filter(o -> o.getDruhy() == j || o.getPrvni() == j  ).findFirst().get();
            //hrany.remove(h);
            //vysledek[i - 1] = (h.getPoradi());
            //nula--;
        }

        return vysledek;
    }
}