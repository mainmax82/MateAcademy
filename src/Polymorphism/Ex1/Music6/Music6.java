package Polymorphism.Ex1.Music6;

import Polymorphism.Ex1.Music6.Playable.Playable;

import static Print.Print.print;

  class Instrument {
     public String toString(){return"Instrument";}
     void adjust(){} 
}

class Wind extends Instrument implements Playable {
     public void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument implements Playable{
   public void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument implements Playable{
    public void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind implements Playable {
    public void play(Note n) { print("Brass.play() " + n); }
    public String toString() { return "Brass"; }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind implements Playable {
     public void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

public class Music6 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Playable p) {
        //...
        p.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] pe) {
        for(Playable i : pe)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
      //  for(Instrument i : orchestra)
       //     System.out.println(i);
    }
}
