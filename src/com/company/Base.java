package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Base {

    public static void main(String[] args) {


                // Creaza lista cu obiect care au fost derivate din Base
                ArrayList<Base> baseList = new ArrayList<>(Arrays.asList(new Der1(), new Der2(), new Der3(), new Der4()));

                // Foloseste metoda "afiseaza" din toate obiectele din lista - demonstram polimorphismul
                // Toate classele base si copii au metodul "afiseaza" insa fiecare class funtioneaza si produce un rezultat diferit
                for(int i = 0; i < baseList.size(); i++) {
                    baseList.get(i).afiseaza();
                }

                // Foloseste metoda afiseaza standarta
                Base base = new Base();
                base.afiseaza();
            }

            /**
             * Cel mai standart afiseaza
             */
            public void afiseaza() {
                System.out.println("Nimic");
            }
        }

/**
 * Class derivat din Base
 */
        class Der1 extends Base {
            /**
             * Metoda de afisare
             */
            public void afiseaza() {
                System.out.println("Dreptunghi");
            }
        }

/**
 * Class derivat din Base
 */
        class Der2 extends Base {
            /**
             * Metoda de afisare
             */
            public void afiseaza() {
                System.out.println("Triunghi");
            }
        }

/**
 * Class derivat din Base
 */
        class Der3 extends Base {
            /**
             * Metoda de afisare
             */
            public void afiseaza() {
                System.out.println("Cerculet");
            }
        }

/**
 * Class derivat din Base
 */
        class Der4 extends Base {
            /**
             * Metoda de afisare
             */
            public void afiseaza() {
                System.out.println("X-figuraGeometrica");
            }
        }
