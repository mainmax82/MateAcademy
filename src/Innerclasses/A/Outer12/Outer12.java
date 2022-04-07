package Innerclasses.A.Outer12;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

interface Outer12Interface {


    void modifyOuter12();
}

public class Outer12 {
    private int oi=1;
    private void hi(){
        System.out.println("Outer hi");
    }
   public  Outer12Interface outer12Interface(){
        return  new Outer12Interface() {
            @Override
            public void modifyOuter12() {
                oi*=2;
                hi();
            }
        };
    }
    public  void showOi(){
        System.out.println(oi);
    }

    public static void main(String[] args) {
        Outer12 outer12=new Outer12();
        Outer12Interface outer12Interface=outer12.outer12Interface();
        outer12.showOi();
        outer12Interface.modifyOuter12();
        outer12.showOi();
    }
    }


