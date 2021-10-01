import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;


public class JavaGuiJmenuProgram{

    public static void menuFile() {

        JFrame frame = new JFrame("Notepad"); // The title of the frame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JMenuBar mb=new JMenuBar();


        JMenu menufile = new JMenu("File");
        JMenu menuedit = new JMenu("Edit");
        JMenu menuformat = new JMenu("Format");
        JMenu menuview = new JMenu("View");
        JMenu menuhelp = new JMenu("Help");

        JMenuItem i1, i2, i3, i4, i5,i6,i7,i8;
        i1=new JMenuItem("New");
        i2=new JMenuItem("New Window");
        i3=new JMenuItem("Open...");
        i4=new JMenuItem("Save");
        i5=new JMenuItem("Save As...");
        i6=new JMenuItem("Page Setup...");
        i7= new JMenuItem("Print...");
        i8=new JMenuItem("Exit");


        i2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==i2)
                    menuFile();
            }
        });


        i3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==i3) {

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                    int result = fileChooser.showOpenDialog(fileChooser.getParent());

                    if (result == JFileChooser.APPROVE_OPTION) {
                        // user selects a file
                        File selectedFile = fileChooser.getSelectedFile();
                        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    }
                    else {
                        System.out.println("File access cancelled by user.");
                    }
                }
            }
        });


        i8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==i8)
                    System.exit(0); // stop program
                frame.dispose();
            }
        });


        JMenuItem a1, a2, a3, a4, a5,a6,a7,a8,a9,a10;
        a1=new JMenuItem("Undo");
        a2=new JMenuItem("Cut");
        a3=new JMenuItem("Copy");
        a4=new JMenuItem("Paste");
        a5=new JMenuItem("Delete");
        a6=new JMenuItem("Find");
        a7= new JMenuItem("Replace");
        a8=new JMenuItem("Goto");
        a9=new JMenuItem("Time and Date");
        a10=new JMenuItem("Select All");


        JMenuItem b1, b2;
        b1=new JMenuItem("Word Wrap");
        b2=new JMenuItem("Font");


        JMenuItem c1, c2;
        c1=new JMenuItem("Zoom");
        c2=new JMenuItem("Status Bar");


        JMenuItem d1, d2, d3;
        d1=new JMenuItem("View Help");
        d2=new JMenuItem("Send Feedback");
        d3=new JMenuItem("About Notepad");


        menufile.add(i1); menufile.add(i2); menufile.add(i3);menufile.add(i4);
        menufile.add(i5);menufile.add(i6);menufile.add(i7);menufile.add(i8);
        mb.add(menufile);

        menuedit.add(a1); menuedit.add(a2); menuedit.add(a3);menuedit.add(a4);
        menuedit.add(a5);menuedit.add(a6);menuedit.add(a7);menuedit.add(a8);menuedit.add(a9);menuedit.add(a10);


        mb.add(menuedit);

        menuformat.add(b1); menuformat.add(b2);
        mb.add(menuformat);

        menuview.add(c1); menuview.add(c2);
        mb.add(menuview);

        menuhelp.add(d1); menuhelp.add(d2);menuhelp.add(d3);
        mb.add(menuhelp);



        frame.setJMenuBar(mb);

        JTextArea textArea = new JTextArea("");
        textArea.setBounds(5,5,360,320);



        i1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==i1)
                    textArea.setText("");
            }
        });


        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==a2)
                    textArea.cut();
            }
        });


        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==a3)
                    textArea.copy();
            }
        });


        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==a4) {
                    textArea.paste();
                }
            }
        });


        a5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==a5)
                    //   textArea.setText("");
                    textArea.setText(null); // Another way of deleting a text.
            }
        });


        a10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==a10)
                    textArea.selectAll();
            }
        });



        frame.add(textArea);

        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }





    public static void main(String args[]) {

        menuFile();

    /*
        JavaGuiJmenuProgram file1= new JavaGuiJmenuProgram(); // Another way of creating a method.

       file1.menuFile1();


     */
    }
};