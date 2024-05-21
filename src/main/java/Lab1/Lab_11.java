/*
Problem Name:  Write a Java program to create a Temperature Converter Application with a Graphical User Interface (GUI).
Requirements:
	✓ Implement a graphical user interface (GUI) using Java Swing components to allow 	 	    user interaction.
	✓ Provide input fields for users to enter temperature values in any of the supported scales 	    (Celsius, Fahrenheit, or Kelvin).
	✓ Include combo box options for selecting the conversion direction (example: Celsius to 	  	    Fahrenheit, Fahrenheit to Celsius, etc.).
	✓ Implement conversion logic for all possible temperature scale conversions (example:   	 	    Celsius to Fahrenheit, Fahrenheit to Celsius, etc.).
	✓ Display the converted temperature value in real-time as users input values.

*/
package Lab1;

/**
 *
 * @author Arafat
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author md karim
 */
public class Lab_11 extends JFrame {
    JLabel lab1, lab2, lab3, lab4;
    JComboBox combo1, combo2;
    JTextField text1, text2;
    JButton convert, dot, ac, backspace, plusminas;
    JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    public Lab_11(String s) {
        super(s);
    }
    public void setComp() {
        String arr1[] = { "Celsius", "Fahrenheit", "Kelvin"};
        String arr2[] = { "Celsius", "Fahrenheit", "Kelvin"};
        lab1 = new JLabel("To");
        lab2 = new JLabel("Value:");
        lab3 = new JLabel("Converted:");
        lab4 = new JLabel("From");
        combo1 = new JComboBox(arr1);
        combo2 = new JComboBox(arr2);
        text1 = new JTextField();
        text2 = new JTextField();
        convert = new JButton("Convert");
        dot = new JButton(".");
        plusminas = new JButton("±");
        backspace = new JButton("B");
        ac = new JButton("AC");
        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");
        lab1.setForeground(Color.green);
        lab2.setForeground(Color.green);
        lab3.setForeground(Color.green);
        lab4.setForeground(Color.green);
        combo1.setForeground(Color.green);
        combo2.setForeground(Color.green);
        text1.setForeground(Color.green);
        text2.setForeground(Color.green);
        text1.setBackground(new Color(124,0,0));
        text2.setBackground(new Color(124,0,0));
        combo1.setBackground(new Color(124,0,0));
        combo2.setBackground(new Color(124,0,0));
        convert.setBackground(new Color(124, 0, 0));
        convert.setForeground(Color.green);
        dot.setBackground(new Color(80, 80, 80));
        dot.setForeground(Color.green);
        plusminas.setBackground(new Color(128, 0, 0));
        plusminas.setForeground(Color.green);
        backspace.setBackground(new Color(128, 0, 0));
        backspace.setForeground(Color.green);
        ac.setBackground(new Color(128, 0, 0));
        ac.setForeground(Color.green);
        num0.setBackground(new Color(128, 0, 0));
        num0.setForeground(Color.green);
        num1.setBackground(new Color(128, 0, 0));
        num1.setForeground(Color.green);
        num2.setBackground(new Color(128, 0, 0));
        num2.setForeground(Color.green);
        num3.setBackground(new Color(128, 0, 0));
        num3.setForeground(Color.green);
        num4.setBackground(new Color(128, 0, 0));
        num4.setForeground(Color.green);
        num5.setBackground(new Color(128, 0, 0));
        num5.setForeground(Color.green);
        num6.setBackground(new Color(128, 0, 0));
        num6.setForeground(Color.green);
        num7.setBackground(new Color(128, 0, 0));
        num7.setForeground(Color.green);
        num8.setBackground(new Color(128, 0, 0));
        num8.setForeground(Color.green);
        num9.setBackground(new Color(128, 0, 0));
        num9.setForeground(Color.green);
        setLayout(null);
        combo1.setBounds(200, 50, 100, 20);
        text1.setBounds(75, 50, 100, 20);
        lab1.setBounds(200, 80, 50, 20);
        lab4.setBounds(200, 30, 100, 20);
        lab2.setBounds(77, 30, 50, 20);
        lab3.setBounds(77, 75, 95, 20);
        combo2.setBounds(200, 100, 100, 20);
        text2.setBounds(75, 100, 100, 20);
        convert.setBounds(138, 150, 100, 20);
        ac.setBounds(238, 300, 50, 100);
        plusminas.setBounds(238, 200, 50, 50);
        backspace.setBounds(238, 250, 50, 50);
        dot.setBounds(188, 350, 50, 50);
        num0.setBounds(88, 350, 100, 50);
        num1.setBounds(88, 200, 50, 50);
        num2.setBounds(138, 200, 50, 50);
        num3.setBounds(188, 200, 50, 50);
        num4.setBounds(88, 250, 50, 50);
        num5.setBounds(138, 250, 50, 50);
        num6.setBounds(188, 250, 50, 50);
        num7.setBounds(88, 300, 50, 50);
        num8.setBounds(138, 300, 50, 50);
        num9.setBounds(188, 300, 50, 50);
        convert.addActionListener((ActionListener) new Handler());
        ac.addActionListener(new Handler());
        plusminas.addActionListener(new Handler());
        backspace.addActionListener(new Handler());
        dot.addActionListener(new Handler());
        num0.addActionListener(new Handler());
        num1.addActionListener(new Handler());
        num2.addActionListener(new Handler());
        num3.addActionListener(new Handler());
        num4.addActionListener(new Handler());
        num5.addActionListener(new Handler());
        num6.addActionListener(new Handler());
        num7.addActionListener(new Handler());
        num8.addActionListener(new Handler());
        num9.addActionListener(new Handler());
        add(combo1);
        add(combo2);
        add(lab1);
        add(lab2);
        add(lab3);
        add(lab4);
        add(text1);
        add(text2);
        add(convert);
        add(ac);
        add(dot);
        add(plusminas);
        add(backspace);
        add(num0);
        add(num1);
        add(num2);
        add(num3);
        add(num4);
        add(num5);
        add(num6);
        add(num7);
        add(num8);
        add(num9);
        text2.setEditable(false);
    }
    class Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String x, y;
            x = (String) combo1.getSelectedItem();
            y = (String) combo2.getSelectedItem();

            if (e.getSource() == num0)
                text1.setText(text1.getText() + "0");
            if (e.getSource() == num1)
                text1.setText(text1.getText() + "1");
            if (e.getSource() == num2)
                text1.setText(text1.getText() + "2");
            if (e.getSource() == num3)
                text1.setText(text1.getText() + "3");
            if (e.getSource() == num4)
                text1.setText(text1.getText() + "4");
            if (e.getSource() == num5)
                text1.setText(text1.getText() + "5");
            if (e.getSource() == num6)
                text1.setText(text1.getText() + "6");
            if (e.getSource() == num7)
                text1.setText(text1.getText() + "7");
            if (e.getSource() == num8)
                text1.setText(text1.getText() + "8");
            if (e.getSource() == num9)
                text1.setText(text1.getText() + "9");
            if (e.getSource() == dot)
                text1.setText(text1.getText() + ".");
            if (e.getSource() == ac) {
                text1.setText("");
                text2.setText("");
            }
            if (e.getSource() == plusminas) {
                String spm = new String();
                spm = text1.getText();
                if (spm.length() == 0)
                    text1.setText("-");
                else if (spm.charAt(0) != '-')
                    text1.setText("-" + text1.getText());
                else
                    text1.setText("" + spm.substring(1));
            }
            if (e.getSource() == backspace) {
                int n;
                String backspace = new String();
                backspace = text1.getText();
                n = backspace.length();
                text1.setText("" + backspace.substring(0, n - 1));
            }
            if (e.getSource() == convert) {
                if (x == "Celsius" && y == "Celsius") {
                    text2.setText("" + text1.getText());
                } else if (x == "Fahrenheit" && y == "Fahrenheit") {
                    text2.setText("" + text1.getText());
                } else if (x == "Kelvin" && y == "Kelvin") {
                    text2.setText("" + text1.getText());
                }

                // _________Celsius________
                else if (x == "Celsius" && y == "Fahrenheit") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a * 9 / 5) + 32);
                    text2.setText("" + b);
                } else if (x == "Celsius" && y == "Kelvin") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a + 273.15);
                    text2.setText("" + b);
                }
                // ______________Fahrenheit________
                else if (x == "Fahrenheit" && y == "Celsius") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9);
                    text2.setText("" + b);
                } else if (x == "Fahrenheit" && y == "Kelvin") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 32) * 5 / 9 + 273.15);
                    text2.setText("" + b);
                }
                //_____________ Kelvin______________
                else if (x == "Kelvin" && y == "Celsius") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) (a - 273.15);
                    text2.setText("" + b);
                } else if (x == "Kelvin" && y == "Fahrenheit") {
                    String s = text1.getText();
                    float a = Float.parseFloat(s);
                    float b = (float) ((a - 273.15) * 9 / 5 + 32);
                    text2.setText("" + b);
                }
            }
        }
    }
    public static void main(String[] args) {
        Lab_11 obj = new Lab_11("Temp Converter");
        obj.setComp();
        obj.setSize(400, 500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}