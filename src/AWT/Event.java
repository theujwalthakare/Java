package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event extends Frame implements ActionListener {
    TextField tf;
    Event(){
        tf = new TextField();
        tf.setBounds(50,150,80,30);
        Button b =new Button();
        b.setBounds(120,150,80,30);
        //register listener
        b.addActionListener(this);

        add(tf);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Event e1 = new Event();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }
}
