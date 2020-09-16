package ru.Zadanie_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Zadanie4 extends JFrame {

    //JTextField pole = new JTextField(10);
    JPanel[] panel = new JPanel[9];
    private int MadridCommandScore = 0, MilanCommandScore = 0;

    JLabel Score = new JLabel("Result: 0 X 0");
    JLabel LastGol = new JLabel("Last Scorer: N/A");
    JButton MilanB = new JButton("AC Milan");
    JLabel Winner = new JLabel("Winner: DRAW");
    JButton RealB = new JButton("REAL Madrid");
    JLabel Milan = new JLabel("Milan");
    JLabel Madrid = new JLabel("Madrid");

    private void Score(String name) {
        if (name.equals("mad")) {
            MadridCommandScore++;
            LastGol.setText("Last Scorer: Madrid");
        } else {
            MilanCommandScore++;
            {
                LastGol.setText("Last Scorer: Milan");
            }
        }

        Score.setText("Result: " + MilanCommandScore + " X " + MadridCommandScore);
        if (MadridCommandScore == MilanCommandScore) {
            Winner.setText("Winner: DRAW");
        } else if (MadridCommandScore > MilanCommandScore) {
            Winner.setText("Winner: Madrid");
        } else {
            Winner.setText("Winner: Milan");
        }

    }

    public Zadanie4() {

        super("AC Milan VS REAL Madrid");

        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < panel.length; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(217, 217, 217));
            add(panel[i]);
        }

        Font font = new Font("Century Gothic", Font.BOLD, 55);

        panel[1].setFont(font);
        panel[1].setLayout(new BorderLayout());
        Winner.setHorizontalAlignment(SwingConstants.CENTER);
        panel[1].add(Winner);


        panel[3].setForeground(new Color(241, 5, 5));
        panel[3].setFont(font);
        panel[3].setLayout(new BorderLayout());
        MilanB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Score("mil");
            }
        });
        panel[3].add(MilanB);


        panel[4].setLayout(new BorderLayout());
        Score.setHorizontalAlignment(SwingConstants.CENTER);
        panel[4].add(Score);

        panel[5].setLayout(new BorderLayout());
        RealB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Score("mad");
            }
        });
        panel[5].add(RealB);

        LastGol.setHorizontalAlignment(SwingConstants.CENTER);
        panel[7].add(LastGol);

        Font font1 = new Font("Verdana", Font.BOLD, 18);
        font1 = new Font("Century Gothic", 1, 80);
        Milan.setHorizontalAlignment(SwingConstants.CENTER);
        Milan.setVerticalAlignment(SwingConstants.CENTER);
        Milan.setVerticalTextPosition(SwingConstants.CENTER);
        Milan.setHorizontalTextPosition(SwingConstants.CENTER);
        Madrid.setHorizontalAlignment(SwingConstants.CENTER);
        Madrid.setVerticalAlignment(SwingConstants.CENTER);
        Madrid.setVerticalTextPosition(SwingConstants.CENTER);
        Madrid.setHorizontalTextPosition(SwingConstants.CENTER);
        panel[0].setFont(font1);
        panel[2].setFont(font1);
        panel[0].setBackground(new Color(163, 229, 191));
        panel[0].add(Milan);
        panel[2].setBackground(new Color(163, 229, 191));
        panel[2].add(Madrid);
        setSize(400, 250);

    }


    public static void main(String[] args) {
        new Zadanie4().setVisible(true);
    }


}
