
package com.mycompany.notepadapp;

import javax.swing.*;
public class About extends JFrame {
    About(){
        setBounds(100,100,500,400);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
    }
     public static void main(String[] args){
      new About().setVisible(true);
  }
}