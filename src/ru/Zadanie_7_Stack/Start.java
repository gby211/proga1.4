package ru.Zadanie_7_Stack;

public class Start {
    public static void main(String[] args) {
        Coloda dac = new Coloda();
        final int max_iteration = 106;
        int iteration_now = 0;
        dac.Auto_zap();
        //dac.Zap_rukami();
        System.out.println(dac.getDeckP1());
        System.out.println(dac.getDeckP2());
        //System.out.println(dac.inversion_deck(dac.getDeckP1()));
        //System.out.println(dac.getDeckP1());
        System.out.println("");
        Game game = new Game();
        System.out.println(game.gammme(dac.getDeckP1(),dac.getDeckP2(),max_iteration,iteration_now));
        System.out.println(game.Who_did_win(game.getDeckP1(),game.getDeckP2()));
    }


}

//public static void main(String[] args) {
//
//
//        Stack<Card> deckP1 = new Stack<>();
//        Stack<Card> deckP2 = new Stack<>();
//        Scanner scan = new Scanner(System.in);
//
//        final int max_iteration = 106;
//        int iteration_now = 0;
//
//        ///
//
//        deckP1.push(new Card(1));                       //
//        deckP1.push(new Card(3));                       //
//        deckP1.push(new Card(5));                       //
//        deckP1.push(new Card(7));                       //
//        deckP1.push(new Card(9));                       //   авто заполнение
//        deckP2.push(new Card(2));                       //
//        deckP2.push(new Card(4));                       //
//        deckP2.push(new Card(6));                       //
//        deckP2.push(new Card(8));                       //
//        deckP2.push(new Card(0));                       //
//        ///
//
//
///////////////////////////////    блок проверок ⬇
//        System.out.println(deckP1);
//        System.out.println(deckP2);
//        System.out.println(deckP1.peek());
//        System.out.println(deckP1);
//        System.out.println(deckP1.pop());
//        System.out.println(deckP1);
//        deckP1.push(new Card(9));
//        System.out.println(deckP1);
//        Stack<Card> deckI = new Stack<>();
//        deckI.push(deckP1.pop());                       //
//        deckI.push(deckP1.pop());
//        deckI.push(deckP1.pop());
//        deckI.push(deckP1.pop());
//        deckI.push(deckP1.pop());
//        System.out.println(deckI);
//        System.out.println(deckP1);
//
///////////////////////










