package com.bibus;

/**
 * Created by Sebastian on 15.04.2017.
 */
public class Hamburger {
    private String name;
    private String meat;
    private boolean bread;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean chesse;
    private int cena;


    public Hamburger(String meat, boolean bread, boolean lettuce, boolean tomato, boolean carrot, boolean chesse) {
        this.name = "Basic hamburger";
        this.meat = meat;
        this.bread = bread;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.chesse = chesse;
    }


    public void cenaOstateczna(){
        cena = 5;
        System.out.println("Cena "+name+" to "+cena + " + dodatki");
        System.out.println("Mięso zostało wybrane "+ meat);
        dodajchleb();
        dodajkapuste();
        dodajmarchewke();
        dodajpomidor();
        dodajser();
        System.out.println("Cena hambuegera z dodatkami w sumie wynosi "+cena);
    }

    public int dodajchleb(){
        if (bread){
            cena=+1;
            System.out.println("Dodano ciemny chleb -> 1");
            return cena;
        }else{
            return 0;
        }
    }
    public int dodajkapuste(){
        if (lettuce){
            cena=+1;
            System.out.println("Dodano kapuste -> 1");
            return cena;
        }else{
            return 0;
        }
    }
    public int dodajpomidor(){
        if (tomato){
            cena=+2;
            System.out.println("Dodano pomidor -> 2");
            return cena;
        }else{
            return 0;
        }
    }
    public int dodajmarchewke(){
        if (carrot){
            cena=+1;
            System.out.println("Dodano marchewke -> 1");
            return cena;
        }else{
            return 0;
        }
    }
    public int dodajser(){
        if (chesse){
            cena=+1;
            System.out.println("Dodano ser -> 1");
            return cena;
        }else{
            return 0;
        }
    }
}
