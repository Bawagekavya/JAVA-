package com.Store.bike;

public class Dam {

        private  String[] damNames = new String[7];
        private int index;

        public void store(String Name)
        {
            this.damNames[this.index] = Name;
            this.index++;
        }

        public void display()
        {
            for(String ref : damNames)
            {
                System.out.println(ref);
            }
        }

        public static void main(String[] args) {

            Dam dam = new Dam();
            dam.store("Ahraura dam");
            dam.store("Nagarjun dam");
            dam.store("Krishnasagar dam");
            dam.store("Tungabhadra");
            dam.store("Mahanadi");
            dam.store("Srisailam");
            dam.store("Barur dam");

            dam.display();
        }


    }

}
