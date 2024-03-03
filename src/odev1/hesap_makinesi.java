package odev1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hesap_makinesi extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton topla;
    private JButton cikar;
    private JButton carp;
    private JButton bol;
    private JLabel sl;
    private JPanel panel;
    private JLabel sayi1l;
    private JLabel sayi2l;
    float sayi1, sayi2,sonuc;

    hesap_makinesi(){
        add(panel);
        setSize(500,500);
        setTitle("Hesap Makinesi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        topla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float) sayi1 + sayi2;
                sl.setText(Float.toString(sonuc));


            }
        });
        cikar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float) sayi1 - sayi2;
                sl.setText(Float.toString(sonuc));
            }
        });
        carp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float) sayi1 * sayi2;
                sl.setText(Float.toString(sonuc));
            }
        });
        bol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sayi1 = Float.parseFloat(textField1.getText());
                sayi2 = Float.parseFloat(textField2.getText());
                sonuc = (float) sayi1 / sayi2;
                sl.setText(Float.toString(sonuc));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                hesap_makinesi f = new hesap_makinesi();
                f.setVisible(true);
            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}