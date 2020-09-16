package ru.Zadanie_3_2_Movable;

public class TesetMovable {
        public static void main(String []args){
            MovableCircle circ = new MovableCircle(0, 0, 1, 1, 10);
            MovablePoint point = new MovablePoint(0, 0, 1, 1);

            System.out.println(circ);
            System.out.println(point);

            circ.moveDown();
            point.moveDown();

            System.out.println("\n"+circ);
            System.out.println(point);

            MovableRectangle rect = new MovableRectangle(0, 0,1, 1, 1, 1);

            System.out.println("\n"+rect);

            rect.moveUp();
            rect.moveUp();

            System.out.println(rect);

            rect.moveUp();
            rect.moveUp();

            System.out.println(rect);
        }

}
