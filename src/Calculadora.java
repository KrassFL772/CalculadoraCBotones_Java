
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    public static void main(String[] args) {
                // Creamos la ventana de la app
                JFrame frame = new JFrame("Calculadora");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 300);
                frame.setLayout(new GridLayout(6, 2));

                // Creamos los componentes
                JLabel num1lbl = new JLabel("Número 1:");
                JTextField num1Field = new JTextField();

                JLabel num2lbl = new JLabel("Número 2:");
                JTextField num2Field = new JTextField();

                JButton sumaBtn = new JButton("SUMA");
                JButton restaBtn = new JButton("RESTA");
                JButton multiBtn= new JButton("MULTIPLICACION");
                JButton divButton = new JButton("DIVISION");

                JLabel resultadolbl = new JLabel("Resultado:");
                JTextField resultadoField = new JTextField();
                resultadoField.setEditable(false);

                JLabel nombrelbl = new JLabel("DESIGNED BY:");
                JLabel nombrelbl2 = new JLabel("Angel Gabriel Hernandez Flores.");


                // Agregar componentes al marco
                frame.add(num1lbl);
                frame.add(num1Field);
                frame.add(num2lbl);
                frame.add(num2Field);
                frame.add(sumaBtn);
                frame.add(restaBtn);
                frame.add(multiBtn);
                frame.add(divButton);
                frame.add(resultadolbl);
                frame.add(resultadoField);
                frame.add(nombrelbl);
                frame.add(nombrelbl2);

                // Manejar eventos de los botones
                sumaBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double num1 = Double.parseDouble(num1Field.getText());
                        double num2 = Double.parseDouble(num2Field.getText());
                        resultadoField.setText(String.valueOf(num1 + num2));
                    }
                });

                restaBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double num1 = Double.parseDouble(num1Field.getText());
                        double num2 = Double.parseDouble(num2Field.getText());
                        resultadoField.setText(String.valueOf(num1 - num2));
                    }
                });

                multiBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double num1 = Double.parseDouble(num1Field.getText());
                        double num2 = Double.parseDouble(num2Field.getText());
                        resultadoField.setText(String.valueOf(num1 * num2));
                    }
                });

                divButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        double num1 = Double.parseDouble(num1Field.getText());
                        double num2 = Double.parseDouble(num2Field.getText());
                        if (num2 != 0) {
                            resultadoField.setText(String.valueOf(num1 / num2));
                        } else {
                            resultadoField.setText("Error: Div/0");
                        }
                    }
                });

                // Hacer visible la ventana
                frame.setVisible(true);
    }
}