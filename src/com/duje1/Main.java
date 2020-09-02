package com.duje1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

public class Main extends JFrame implements ActionListener {

    public static JTextArea jt,answ;
    public static String[] Links;
    private static final String TITLE = "Rick Checker";
    private static final int WIDTH=700,HEIGHT=200;
    public static void main(String[] args) {

        //initializing frame
        JLabel l;
        JButton b;



        JFrame frame = new JFrame(TITLE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        l = new JLabel();
        // create a new button
        b = new JButton("submit");
        // create a object of the text class
        Main m = new Main();
        // addActionListener to button
        b.addActionListener(m);
        // create a text area, specifying the rows and columns
        jt = new JTextArea("Pls enter the link",1, 60);
        jt.setLineWrap(false);
        answ =new JTextArea("Result",1,10);
        answ.setEditable(false);

        JPanel p = new JPanel();

        // add the text area and button to panel
        p.add(jt);
        p.add(b);
        p.add(l);
        p.add(answ);
        frame.add(p);
        frame.setSize(WIDTH,HEIGHT);

        //links

        Links= new String[12];

        Links[0] = "https://www.youtube.com/watch?v=9EXqd_Y-F2c&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=2&t=0s";
        Links[1] = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=3&t=0s";
        Links[2] = "https://www.youtube.com/watch?v=EE-xtCF3T94&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=4&t=0s";
        Links[3] = "https://www.youtube.com/watch?v=Uj1ykZWtPYI&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=5&t=0s";
        Links[4] = "https://www.youtube.com/watch?v=xfr64zoBTAQ&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=6&t=0s";
        Links[5] = "https://www.youtube.com/watch?v=xfr64zoBTAQ&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=6&t=0s";
        Links[6] = "https://www.youtube.com/watch?v=V-_O7nl0Ii0&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=7&t=0s";
        Links[7] = "https://www.youtube.com/watch?v=V-_O7nl0Ii0&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=7&t=0s";
        Links[8] = "https://www.youtube.com/watch?v=EE-xtCF3T94&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=4&t=0s";
        Links[9] = "https://www.youtube.com/watch?v=xyCHqEoYi4o&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=8&t=0s";
        Links[10] = "https://www.youtube.com/watch?v=jGbjqKlAHw0&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=9&t=0s";
        Links[11] = "https://www.youtube.com/watch?v=CGqyc7FIz58&list=PLHl3NIHsde7PDBdOEV1NZESz8mAVkdCJx&index=10&t=0s";


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Check(jt.getText());
    }
    public void Check(String entered){
        for(String i : Links){
            if(entered.equals(i)){
                answ.setText("U getting rickrolled my dude");
            }
        }
        if(jt.getText()!=("U getting rickrolled my dude")){
           answ.setText("safe");
        }
    }
}
