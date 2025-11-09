/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6latihan2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author hary
 */
public class Modul6Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Modul 6 Latiahn 2");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new GridLayout(3, 2, 5, 5));

        JLabel labelCelcius = new JLabel("Celcius:");
        JTextField inputCelcius = new JTextField(10);
        JButton tombolKonversi = new JButton("Konversi");
        JLabel labelFahrenheit = new JLabel("Fahrenheit:");
        JLabel hasil = new JLabel("");

        frame.add(labelCelcius);
        frame.add(inputCelcius);
        frame.add(labelFahrenheit);
        frame.add(hasil);
        frame.add(tombolKonversi);

        tombolKonversi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    double celcius = Double.parseDouble(inputCelcius.getText());
                    double fahrenheit = (celcius * 9 / 5) + 32;
                    hasil.setText(fahrenheit + "F");            
                } catch (NumberFormatException ex){
                    hasil.setText("Input tidak valid");
                } 
            }

        });

        frame.setVisible(true);
    }
    
}
