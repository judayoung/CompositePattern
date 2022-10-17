package compositeArmy;

import composite.CompositeGraphic;
import composite.Ellipse;

public class CompositeApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("");

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();

        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();
        CompositeGraphic graphic3 = new CompositeGraphic();
        CompositeGraphic graphic4 = new CompositeGraphic();

        graphic1.add(ellipse1);     // 1계층
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse2);     // 1계층

        // 컴포지트로 그룹의 그룹을 모을 수 있다. 트리 구조.
        graphic3.add(graphic1);     // 2계층
        graphic3.add(graphic2);

        graphic4.add(graphic3);     // 3계층
        graphic4.add(graphic3);

        System.out.println("graphic1 : ");
        graphic1.print();
        System.out.println("graphic2 : ");
        graphic2.print();
        System.out.println("graphic3 : ");
        graphic3.print();
        System.out.println("graphic4 : ");
        graphic4.print();
    }

}
