package Lab2;

/**
 *
 * @author md karim
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Assignment1 implements ActionListener {

    double number, answer;
    int calculation;
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonClear = new JButton("Clear");
    JButton buttonDelete = new JButton("->Back");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonEqual = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonReciprocal = new JButton("mod");
    JButton buttonSqrt = new JButton("sqrt");

    Assignment1() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        frame.add(label);
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonZero.setBounds(10, 350, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 10));
        buttonZero.setBackground(Color.WHITE);
        buttonZero.setForeground(Color.BLACK);
        frame.add(buttonZero);

        buttonOne.setBounds(10, 170, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 10));
        buttonOne.setBackground(Color.WHITE);
        buttonOne.setForeground(Color.BLACK);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 170, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 10));
        buttonTwo.setBackground(Color.WHITE);
        buttonTwo.setForeground(Color.BLACK);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 170, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 10));
        buttonThree.setBackground(Color.WHITE);
        buttonThree.setForeground(Color.BLACK);
        frame.add(buttonThree);

        buttonFour.setBounds(10, 230, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 10));
        buttonFour.setBackground(Color.WHITE);
        buttonFour.setForeground(Color.BLACK);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 230, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 10));
        buttonFive.setBackground(Color.WHITE);
        buttonFive.setForeground(Color.BLACK);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 230, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 10));
        buttonSix.setBackground(Color.WHITE);
        buttonSix.setForeground(Color.BLACK);
        frame.add(buttonSix);

        buttonSeven.setBounds(10, 290, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 10));
        buttonSeven.setBackground(Color.WHITE);
        buttonSeven.setForeground(Color.BLACK);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 290, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 10));
        buttonEight.setBackground(Color.WHITE);
        buttonEight.setForeground(Color.BLACK);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 290, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 10));
        buttonNine.setBackground(Color.WHITE);
        buttonNine.setForeground(Color.BLACK);
        frame.add(buttonNine);

        buttonDot.setBounds(10, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 10));
        buttonDot.setBackground(Color.WHITE);
        buttonDot.setForeground(Color.BLACK);
        frame.add(buttonDot);

        buttonEqual.setBounds(80, 410, 200, 40);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 10));
        buttonEqual.setBackground(Color.WHITE);
        buttonEqual.setForeground(Color.BLACK);
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 350, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(Color.WHITE);
        buttonDiv.setForeground(Color.BLACK);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(150, 350, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 9));
        buttonSqrt.setBackground(Color.WHITE);
        buttonSqrt.setForeground(Color.BLACK);
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 290, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 10));
        buttonMul.setBackground(Color.WHITE);
        buttonMul.setForeground(Color.BLACK);
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 230, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 10));
        buttonMinus.setBackground(Color.WHITE);
        buttonMinus.setForeground(Color.BLACK);
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 170, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 10));
        buttonPlus.setBackground(Color.WHITE);
        buttonPlus.setForeground(Color.BLACK);
        frame.add(buttonPlus);

        buttonReciprocal.setBounds(80, 350, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 9));
        buttonReciprocal.setBackground(Color.WHITE);
        buttonReciprocal.setForeground(Color.BLACK);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(178, 110, 100, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 9));
        buttonDelete.setBackground(Color.WHITE);
        buttonDelete.setForeground(Color.BLACK);
        frame.add(buttonDelete);

        buttonClear.setBounds(11, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 9));
        buttonClear.setBackground(Color.WHITE);
        buttonClear.setForeground(Color.BLACK);
        frame.add(buttonClear);
    }

    public void addActionEvent() {
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;

            }
        }

    }

    public void enable() {
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
    }

    public void disable() {
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
    }

    public static void main(String[] args) {
        Assignment1 obj = new Assignment1();
    }
}
