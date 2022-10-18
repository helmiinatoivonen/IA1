package com.company;
import javax.swing.*;

public class App
{

    public static void main(String[] args)
    {
        try
        {
            View.LogIn form = new View.LogIn();
            form.setSize(300, 100);
            form.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
