package AWT;

import org.w3c.dom.Text;

import java.awt.*;

public class Sample extends Frame {
    Sample(){
        //CREATE Button and TextField
        Button b = new Button("Click on !");
        TextField t = new TextField("Enter String");
        //set position of a component on display window
        b.setBounds(150,50,80,30);
        t.setBounds(50,50,100,30);
        // set window orientation
        setSize(400,400);
        //add component to window
        add(t);
        add(b);

        setTitle("Demo Program");
        // setting visibility of frame
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        Sample a1 = new Sample();
    }
}
