package com.unicamp.mc322.lab13;

import java.time.LocalDate;
import java.time.Month;

public class Runner {

	public static void main(String[] args) {
		ICrazyDS crazyDS = new CrazyDS(new MyStrategy());
        ICrazyDS crazyDS2 = new CrazyDS(new PriorityScore());
        
        IOrder order1 = new InternetOrder(new PersonPT(LocalDate.of( 1985 , Month.JANUARY , 1 ), "444-555-666", "Maria"));
        IOrder order2 = new InternetOrder(new PersonPT(LocalDate.of( 1918 , Month.APRIL , 2 ), "111-222-333", "Jose"));
        IOrder order3 = new PhysicOrder(new PersonPT(LocalDate.of( 1987 , Month.FEBRUARY , 3 ), "555-666-777", "Paulo"));
        
        crazyDS.addElement(order1);
        crazyDS.addElement(order2);
        crazyDS.addElement(order3);
        
        System.out.println("---- A: Elements MyStratey----");
        crazyDS.printElements();
        
        IOrder order4 = new InternetOrder(new PersonPT(LocalDate.of( 1990 , Month.DECEMBER , 7 ), "444-555-666", "Antonio"));
        IOrder order5 = new InternetOrder(new PersonPT(LocalDate.of( 1930 , Month.MARCH , 20 ), "111-222-333", "Barbara"));
        IOrder order6 = new PhysicOrder(new PersonPT(LocalDate.of( 1999 , Month.MAY , 4 ), "555-666-777", "Clotilde"));
        
        crazyDS2.addElement(order4);
        crazyDS2.addElement(order5);
        crazyDS2.addElement(order6);
        
        System.out.println("---- B: Elements PriorityScore----");
        crazyDS2.printElements();

        System.out.println("---- C: Getting and removing the element with highest priority ----");
        IOrder p1;
        try {
            p1 = crazyDS.peekElement();
            System.out.println("-selected element");
            p1.imprimeReduzido();
            crazyDS.removeElemento(p1);
            System.out.println("-elements");
            crazyDS.printElements();
        } catch (CrazyDSException e) {
            e.printStackTrace();
            System.out.println("Não contém elementos na lista, portanto, impossível efetuar acao\n");
        }

        
        
        
        
        System.out.println("---- D: Adding an old person ----");
        IOrder order7 = new InternetOrder(new PersonPT(LocalDate.of( 1880 , Month.JUNE , 1 ), "000-000-000", "Cleopatra"));
        crazyDS.addElement(order7);
        crazyDS.printElements();
        System.out.println("-selected element");
        
        try {
        	IOrder p2 = crazyDS.peekElement();
            p2.imprimeFull();
        } catch (CrazyDSException e) {
            e.printStackTrace();
        	System.out.println("Não contém elementos na lista, portanto, impossível efetuar acao\n");
        }

        
        
        System.out.println("---- E: Checking an exception ----");
        try {
            IOrder p3 = crazyDS.getElementAt(1000);
            p3.imprimeFull();
        } catch (CrazyDSException e) {
            //e.printStackTrace();
            System.out.println("-ok: Show error in logs");
        }

	}

}
