import java.awt.CheckboxMenuItem;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.MutableComboBoxModel;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;

public class frame extends JFrame implements ActionListener {
   private JTextField strFolder;
   private JComboBox datesNotCome;
   private JComboBox names;
   private JTextField text;
   private JButton addStudent3;
   private JMenu menu1;
   private JMenuItem menuItem1;
   private JLabel checkLabel;
   private JButton deleteStudent3;
   private JTextField strName3;
   private JComboBox showStudents3;
   private JComboBox showStudents32;
   private JTextField DatesCome3;
   private JButton addDNC;
   private JButton deleteDNC;
   private JComboBox DNCs3;
   private JComboBox showStudents1;
   private JLabel on1;
   private JComboBox DNCs1;
   private JLabel nameOfTest1;
   private JLabel reading1;
   private JLabel writing1;
   private JLabel math1;
   private JComboBox names2;
   private JTextField math2;
   private JTextField reading2;
   private JTextField writing2;
   private JTextField test2;
   private int size;
   private JComboBox datesCome2;
   private JLabel everything2;
   private int x;
   private int y;
   private int z;
   private int a;
   private int b;
   private int q2;
   private int h2;
   private int hi;
   private int bye;
   private int counter;
   private PrintWriter fw;
   private Scanner scan;
   private String hold;
   private JButton add2;
   private JButton delete2;
   private JButton add;
   private JButton delete;
   ArrayList<String> list;
   Scanner s;
   private File file;
   private JButton show;
   private JButton change;
   private File folder;
   private JButton addFolder;
   private JButton deleteFolder;
   public frame() {
   	
      add = new JButton();
      delete = new JButton();
      addFolder = new JButton();
      deleteFolder = new JButton();
      strFolder = new JTextField();
      folder = new File("/Users/alijawad/eclipse-workspace/Java/Aplus2.0");
      checkLabel = new JLabel();
      show = new JButton();
      change = new JButton();
      names = new JComboBox();
      text = new JTextField();
      math2 = new JTextField();
      showStudents3 = new JComboBox();
      DatesCome3 = new JTextField();
      showStudents32 = new JComboBox();
      datesCome2 = new JComboBox();
      datesNotCome = new JComboBox();
   
   
   
      reading2 = new JTextField();
      test2 = new JTextField();
      writing2 = new JTextField();
      addStudent3 = new JButton();
   
      addFolder.setBounds(170,70,60,40);
      addFolder.setText("addFolder");
      addFolder.addActionListener(this);
   	
   	
      deleteFolder.setBounds(230,70,80,40);
      deleteFolder.setText("deleteFolder");
      deleteFolder.addActionListener(this);
   	
      strFolder.setBounds(30, 70, 120, 40);
      checkLabel.setBounds(50, 460, 400, 50);
      checkLabel.setText("text");
   
      File[] listOfFiles = folder.listFiles();
      show.addActionListener(this);
      show.setText("show");
      show.setBounds(700, 10, 50, 40);
      change.setBounds(50, 200, 70, 40);
      change.setText("Change");
      change.addActionListener(this);
   
      add2 = new JButton();
      add2.addActionListener(this);
      add2.setBounds(800, 150, 50, 40);
      add2.setText("AdD");
   
      delete2 = new JButton();
      delete2.setText("deletE");
      delete2.setBounds(860, 150, 70, 40);
   
      delete2.addActionListener(this);
   
   
   	
      list = new ArrayList<String>();
      setLayout(null);
      setSize(1000, 1000);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      y = 0;
   	
      everything2 = new JLabel();
      everything2.setBounds(300, 150, 350, 40);
      everything2.setText("Reading:         Writing:         Math:         Test Name:");
   
   
   	
      names2 = new JComboBox();
      names2.setBounds(30, 150, 150, 40);
      names.setBounds(190, 380, 80, 80);
      names.addActionListener(this);
      nameOfTest1 = new JLabel();
      nameOfTest1.setBounds(316, 10, 100, 40);
      nameOfTest1.setText("nameOFTEst");
      reading1 = new JLabel();
      reading1.setBounds(411, 10, 130, 40);
      reading1.setText("Reading + #");
      writing1 = new JLabel();
      writing1.setBounds(493, 10, 130, 40);
      writing1.setText("writing + #");
      math1 = new JLabel();
      math1.setBounds(591, 10, 130, 40);
      math1.setText("math1 + #");
      DNCs1 = new JComboBox();
      DNCs1.setBounds(225, 10, 73, 40);
      DNCs1.addActionListener(this);
      showStudents1 = new JComboBox();
      showStudents1.setBounds(30, 10, 150, 40);
      showStudents1.addActionListener(this);
      showStudents1.addActionListener(this);
      showStudents1.setName("showStudents1");
      on1 = new JLabel();
      on1.setBounds(185, 10, 35, 30);
      on1.setText("on");
      addDNC = new JButton();
      addDNC.addActionListener(this);
      addDNC.setBounds(766, 550, 50, 40);
      addDNC.setText("Add");
      deleteDNC = new JButton();
      deleteDNC.addActionListener(this);
      deleteDNC.setBounds(836, 550, 60, 40);
      deleteDNC.setText("Delete");
      x = 0;
      DNCs3 = new JComboBox();
      DNCs3.setBounds(595, 550, 78, 40);
      z=0;
      a = 0;
      b=0;
      showStudents3.addActionListener(this);
      showStudents3.setName("right");
      showStudents3.setMaximumRowCount(500);
      showStudents3.setBounds(440, 550, 150, 40);
      showStudents32.addActionListener(this);
      showStudents32.setName("left");
      showStudents32.setMaximumRowCount(500);
      showStudents32.setBounds(0, 550, 150, 40);
      DatesCome3.setBounds(683, 550, 73, 40);
      DatesCome3.setText("00/00/19");
      deleteStudent3 = new JButton();
      deleteStudent3.addActionListener(this);
      deleteStudent3.setBounds(360, 550, 70, 40);
      deleteStudent3.setText("DELETE");
      strName3 = new JTextField();
      strName3.setBounds(145, 550, 150, 40);
      addStudent3.addActionListener(this);
      addStudent3.addActionListener(this);
      addStudent3.setBounds(300, 550, 50, 40);
      addStudent3.setText("ADD");
      math2.setBounds(507, 150, 40, 40);
      reading2.setBounds(351, 150, 40, 40);
      writing2.setBounds(436, 150, 40, 40);
      test2.setBounds(620, 150, 150, 40);
   	
   	
   			
   			
      names2.setMaximumRowCount(500);
      names2.setName("naems2");
      names2.addActionListener(this);
   
      DNCs1.setMaximumRowCount(500);
      DNCs3.setMaximumRowCount(500);
      datesCome2.setMaximumRowCount(500);
      datesCome2.setBounds(200, 150, 93, 40);
      datesCome2.setName("datesCome2");
      datesCome2.addActionListener(this);
   
      datesNotCome.setBounds(300, 400, 80, 40);
   
      text.setBounds(390, 400, 60, 40);
   
   
      add.setBounds(470, 400, 50, 40);
      add.setText("aDd");
      add.addActionListener(this);
   
      delete.setBounds(530, 400, 50, 40);
      delete.setText("deLete");
      delete.addActionListener(this);
      add(math2);
      add(reading2);
      add(writing2);
      add(test2);
      add(DatesCome3);
      add(showStudents3);
      add(addStudent3);
      add(deleteStudent3);
      add(strName3);
      add(showStudents32);
      add(text);
      add(add);
      add(delete);
      add(text);
      add(datesNotCome);
      add(names);
      add(checkLabel);
   	//add(strFolder);
      add(show);
      add(change);
      add(add2);
      add(delete2);
      add(datesCome2);
      add(everything2);
      add(names2);
      add(nameOfTest1);
      add(reading1);
      add(writing1);
      add(math1);
      add(DNCs1);
      add(showStudents1);
      add(addDNC);
      add(on1);
      add(deleteDNC);
      add(DNCs3);
   	//add(deleteFolder);
      //  add(addFolder);
   
   
   
   
   
   
   
      for (File file : listOfFiles) {
         if (file.isFile() && file.toString().contains(".txt") && (file.toString().contains("Dates") == false)) {
            String g = file.getName().toString();
            g = g.substring(0, g.indexOf("."));
            showStudents1.addItem(g);
            showStudents32.addItem(g);
            showStudents3.addItem(g);
            names2.addItem(g);
            names.addItem(g);
         
         }
      }
   
   	//if(listOfFiles.length > 0)
   	//change.doClick(10);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String holld = e.getSource().toString();
   
      x = 0;
      String h = "";
      String s = "";
      System.out.println(holld);
      if (e.getActionCommand().equals("ADD") && (y % 2 == 0)) {
         h = strName3.getText();
         file = new File("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/" + h + ".txt");
         try {
            if (file.createNewFile()) {
               System.out.println("File is created!");
            } else {
               System.out.println("File already exists.");
            }
         } catch (IOException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         file = new File(h + "Dates.txt");
         try {
            file.createNewFile();
         } catch (IOException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         showStudents3.addItem(h);
         showStudents32.addItem(h);
         names2.addItem(h);
         showStudents1.addItem(h);
         names.addItem(h);
         y++;
      
      } else if (e.getActionCommand().equals("ADD"))
         y++;
   
      if (e.getActionCommand().equals("DELETE") && (z % 2 == 0)) {
         h = showStudents32.getSelectedItem().toString();
      
         try {
            Files.deleteIfExists(Paths.get("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/" + h + ".txt"));
            Files.deleteIfExists(Paths.get(h + "Dates.txt"));
         
         } catch (IOException e1) {
            e1.printStackTrace();
         }
         x = showStudents32.getSelectedIndex();
         showStudents3.removeItemAt(x);
         showStudents32.removeItemAt(x);
         names2.removeItemAt(x);
         showStudents1.removeItemAt(x);
         names.removeItemAt(x);
         z++;
      
      } else if (e.getActionCommand().equals("DELETE"))
         z++;
      try {
         if (e.getActionCommand().equals("Add") && (a % 2 == 0)) {
            h = DatesCome3.getText();
            datesCome2.addItem(h);
            DNCs3.addItem(h);
            DNCs1.addItem(h);
         	
            a++;
            h = showStudents32.getSelectedItem().toString() + ".txt";
            file = new File("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/" + h);
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
               list.add(scan.nextLine());
            }
         	// scan.close();
            FileChannel.open(Paths.get("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/" + h),
               	StandardOpenOption.WRITE).truncate(0).close();
            list.add(DatesCome3.getText());
            PrintWriter fw = new PrintWriter(h);
            for (int v = 0; v < list.size(); v++) {
               fw.write((String) list.get(v));
               fw.println();
            }
            fw.close();
            list.clear();
         
         } else if (e.getActionCommand().equals("Add"))
            a++;
      
         if (e.getActionCommand().equals("Delete") && (b % 2 == 0)) {
            h = showStudents3.getSelectedItem().toString();
            file = new File(h + ".txt");
            scan = new Scanner(file);
            int num = 500;
            counter = 0;
            while (scan.hasNextLine()) {
               h = scan.nextLine();
               list.add(h);
               if (h.indexOf(DNCs3.getSelectedItem().toString()) > -1)
                  num = counter;
            
               counter = counter + 1;
            
            }
            list.remove(num);
            counter = 0;
            FileChannel
               	.open(Paths.get("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/"
               			+ names2.getSelectedItem().toString() + ".txt"), StandardOpenOption.WRITE)
               	.truncate(0).close();
         
            fw = new PrintWriter(file);
            for (int qw = 0; qw < list.size(); qw++) {
               fw.write(list.get(qw));
               fw.println();
            }
            fw.close();
            list.clear();
            x = DNCs3.getSelectedIndex();
            h = DNCs3.getSelectedItem().toString();
            DNCs3.removeItemAt(x);
            DNCs1.removeItemAt(x);
            datesCome2.removeItemAt(x);
            b++;
         
         }
         
         else if (e.getActionCommand().equals("Delete"))
            b++;
      
      } catch (Exception e0) {
         e0.printStackTrace();
      }
   
      if (e.getActionCommand().equals("AdD") && (h2 % 2 == 0)) {
         try {
            list.clear();
            h = names2.getSelectedItem().toString();
            file = new File(h + ".txt");
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
               h = scan.nextLine();
               if (h.contains(datesCome2.getSelectedItem().toString())) {
                  h = h + " " + reading2.getText() + " " + writing2.getText() + " " + math2.getText() + " "
                     	+ test2.getText();
                  checkLabel.setText(h);
               }
               list.add(h);
            
               h = "";
            
            }
            System.out.println(list);
            counter = 0;
            FileChannel
               	.open(Paths.get("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/"
               			+ names2.getSelectedItem().toString() + ".txt"), StandardOpenOption.WRITE)
               	.truncate(0).close();
            PrintWriter fw = new PrintWriter(file);
            for (int r = 0; r < list.size(); r++) {
               fw.write(list.get(r));
               fw.println();
            }
            fw.close();
            list.clear();
         } catch (Exception e8) {
            e8.printStackTrace();
         }
      
      }
      
      else if (e.getActionCommand().equals("AdD")) {
         h2++;
      }
      if (e.getActionCommand().equals("deletE") && (q2 % 2 == 0)) {
         try {
            h = names2.getSelectedItem().toString();
            file = new File(h + ".txt");
            scan = new Scanner(file);
            counter = 0;
            while (scan.hasNextLine()) {
               h = scan.nextLine();
               list.add(h);
            
               if (h.indexOf(datesCome2.getSelectedItem().toString()) > -1) {
                  h = list.get(counter).substring(0, list.get(counter).indexOf(" "));
                  list.set(counter, h);
                  checkLabel.setText(h);
               
               }
               counter = counter + 1;
            
            }
         
            FileChannel
               	.open(Paths.get("/Users/alijawad/eclipse-workspace/Java/Aplus2.0/"
               			+ names2.getSelectedItem().toString() + ".txt"), StandardOpenOption.WRITE)
               	.truncate(0).close();
            fw = new PrintWriter(file);
            for (int f = 0; f < list.size(); f++) {
               fw.write(list.get(f));
               fw.println();
            }
            fw.close();
            list.clear();
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      } else if (e.getActionCommand().equals("deletE")) {
         q2++;
      }
      if (e.getActionCommand().equals("show")) {
         file = new File(showStudents1.getSelectedItem().toString() + ".txt");
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         while (scan.hasNextLine()) {
            h = scan.nextLine();
            if (h.indexOf(DNCs1.getSelectedItem().toString()) > -1) {
               h = h.substring(h.indexOf(" ") + 1);
               math1.setText("Reading: " + h.substring(0, h.indexOf(" ")) + "     ");
               h = h.substring(h.indexOf(" ") + 1);
               reading1.setText("Writing: " + h.substring(0, h.indexOf(" ")) + "     ");
               h = h.substring(h.indexOf(" ") + 1);
               writing1.setText("Math: " + h.substring(0, h.indexOf(" ")) + "     ");
               h = h.substring(h.indexOf(" ") + 1);
               nameOfTest1.setText(h);
            
            }
         
         }
      }
   
      if (e.getActionCommand().equals("Change")) {
      
         file = new File(names2.getSelectedItem().toString() + ".txt");
         datesCome2.removeAllItems();
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
      
         while (scan.hasNextLine()) {
            h = scan.nextLine();
            if (h.length() > 2)
               datesCome2.addItem(h.substring(0, h.indexOf("/") + 6));
         }
      
         file = new File(showStudents1.getSelectedItem().toString() + ".txt");
         DNCs1.removeAllItems();
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
      
         while (scan.hasNextLine()) {
            h = scan.nextLine();
            if (h.length() > 2)
               DNCs1.addItem(h.substring(0, h.indexOf("/") + 6));
         }
      
         file = new File(showStudents3.getSelectedItem().toString() + ".txt");
         DNCs3.removeAllItems();
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
      
         while (scan.hasNextLine()) {
            h = scan.nextLine();
            System.out.println(h);
            if (h.length() > 2)
               DNCs3.addItem(h.substring(0, h.indexOf("/") + 6));
         }
      
         file = new File(names.getSelectedItem().toString() + "Dates.txt");
         datesNotCome.removeAllItems();
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         while (scan.hasNextLine()) {
            h = scan.nextLine();
            datesNotCome.addItem(h);
         }
      
      }
   
      if (holld.contains("/") && holld.contains("datesCome2")) {
         file = new File(names2.getSelectedItem().toString() + ".txt");
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         while (scan.hasNext()) {
            h = scan.nextLine();
            if (h.contains(holld.substring(holld.indexOf("selectedItemReminder=") + 21,
            		holld.indexOf("selectedItemReminder=") + 29)))
               checkLabel.setText(h);
         }
      
      }
   
      if (e.getActionCommand().equals("aDd") && (hi % 2) == 0) {
      
         file = new File(names.getSelectedItem().toString() + "Dates.txt");
         list.clear();
      
         try {
            fw = new PrintWriter(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         fw.println();
         fw.write(text.getText());
         fw.close();
         hi++;
         datesNotCome.addItem(text.getText());
      }
      
      else if (e.getActionCommand().equals("aDd"))
         hi++;
   
      if (e.getActionCommand().equals("deLete") && (bye % 2) == 0) {
         list.clear();
         file = new File(names.getSelectedItem().toString() + "Dates.txt");
         counter = 0;
         int num = 600;
         try {
            scan = new Scanner(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         while (scan.hasNextLine()) {
         
            h = scan.nextLine();
            list.add(h);
            if (h.contains(datesNotCome.getSelectedItem().toString()))
               ;
            num = counter;
            counter = counter + 1;
         }
         if (num != 600)
            list.remove(num);
         datesNotCome.removeItemAt(datesNotCome.getSelectedIndex());
         try {
            fw = new PrintWriter(file);
         } catch (FileNotFoundException e1) {
         	// TODO Auto-generated catch block
            e1.printStackTrace();
         }
         for (int ubuntu = 0; ubuntu < list.size(); ubuntu++) {
            fw.write(list.get(ubuntu));
            fw.println();
         
         }
         fw.close();
      } else if (e.getActionCommand().equals("deLete"))
         bye = bye + 1;
   
       
    
   
   
   
   
   }

   public static void main(String[] args) {
   
      frame a = new frame();
      a.setVisible(true);
   }

}