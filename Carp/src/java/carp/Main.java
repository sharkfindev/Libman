/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carp;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author sujay
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    Main(){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JTable EmployeeTable = new JTable();
        TableColumn lastname = null;
        EmployeeTable.addColumn(lastname);
      JScrollPane employees = new JScrollPane(EmployeeTable);
    JButton clockinout = new JButton("Employee Clock In/Clock Out");
    JButton SwimToReef = new JButton("Reef");
    p.setBackground(Color.WHITE);
    p.add(employees);
    p.add(clockinout);
    p.add(SwimToReef);
    f.add(p);
    f.setSize(400,400);
    f.setVisible(true);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Main Dive = new Main();
    }
     
}
