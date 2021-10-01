import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;


public class JavaGuiCalculatorProgram {

    public static char operator;
    public static double number1,number2,result;
    private static EventObject e;


    public static void main(String args[]) {
        JFrame frame = new JFrame("Simple Calculator"); // The title of the frame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        // JLabel label = new JLabel("JFrame By Example"); // For a label text

        JButton button7 = new JButton("7"); //To create a button.
        // button7.setText("7"); Another way of writing a text in the button.

        JButton button8 = new JButton("8");

        JButton button9 = new JButton("9");

        JButton buttondivision = new JButton("/");

        JButton button4 = new JButton("4");

        JButton button5 = new JButton("5");

        JButton button6 = new JButton("6");

        JButton buttonmultliplication = new JButton("*");

        JButton button1 = new JButton("1");

        JButton button2 = new JButton("2");

        JButton button3 = new JButton("3");

        JButton buttonminus = new JButton("-");

        JButton button0 = new JButton("0");

        JButton buttondecimal = new JButton(".");

        JButton buttonequals = new JButton("=");

        JButton buttonaddition = new JButton("+");

        // We have to parse the text to a type float.
        // Float num1 = Float.parseFloat(button1.getText());


        //  panel.add(label);

        TextField txtA = new TextField(20);
        panel.add(txtA);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttondivision);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonmultliplication);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonminus);
        panel.add(button0);
        panel.add(buttondecimal);
        panel.add(buttonequals);
        panel.add(buttonaddition);
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




        button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("7");
            }
        });


        button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("8");
            }
        });


        button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("9");
            }
        });

        buttondivision.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttondivision)
                {
                    number1=Double.parseDouble(txtA.getText());
                    operator=4;
                    // txtA.setText("");
                    txtA.setText("/");
                }

            }
        });


        button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("4");
            }
        });


        button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("5");
            }
        });


        button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("6");
            }
        });


        buttonmultliplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttonmultliplication)
                {
                    number1=Double.parseDouble(txtA.getText());
                    operator=3;
                    // txtA.setText("");
                    txtA.setText("*");
                }
            }
        });


        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("1");
            }
        });


        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("2");
            }
        });


        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("3");
            }
        });


        buttonminus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttonminus)
                {
                    number1=Double.parseDouble(txtA.getText());
                    operator=2;
                    // txtA.setText("");
                    txtA.setText("-");
                }
            }
        });


        button0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText("0");
            }
        });



        buttondecimal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtA.setText(".");
            }
        });



        buttonequals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttonequals)
                {
                    number2=Double.parseDouble(txtA.getText());

                    switch(operator)
                    {
                        case 1: result=number1+number2;
                            break;

                        case 2: result=number1-number2;
                            break;

                        case 3: result=number1*number2;
                            break;

                        case 4: result=number1/number2;
                            break;

                        default: result=0;
                    }

                    txtA.setText(""+result);
                }
            }
        });



        buttonaddition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==buttonaddition)
                {
                    number1=Double.parseDouble(txtA.getText());
                    operator=1;
                    // txtA.setText("");
                    txtA.setText("+");
                }
            }
        });



    }
}