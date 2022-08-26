/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author PHANMINHTIEN
 */
public class Validation {
   
    public static boolean isEmpty(JTextField txtField, String messag){
        String txtValue = txtField.getText().trim();
        if(txtValue.length()==0){
            JOptionPane.showMessageDialog(null, messag);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();
            return true;
        }
        txtField.setBackground(Color.white);
        return false;
    }


    public static boolean isEmpty(JTextArea textarea_DiaChi, String messag) {
        String txtValue = textarea_DiaChi.getText().trim();
        if(txtValue.length()==0){
            JOptionPane.showMessageDialog(null, messag);
            textarea_DiaChi.setBackground(Color.yellow);
            textarea_DiaChi.requestFocus();
            return true;
        }
        textarea_DiaChi.setBackground(Color.white);
        return false;
    }
    
     private static boolean showMessage(JTextField txtField, String messag, boolean expression){
        if(expression){
            JOptionPane.showMessageDialog(null, messag);
            txtField.setBackground(Color.yellow);
            txtField.requestFocus();
            return true;
        }
        txtField.setBackground(Color.white);
        return false;
    }
    public static boolean isDate(JTextField txtField, String messag){
        String txtValue = txtField.getText().trim();
        String strPtn = "^[0-3][0-9]/[01][0-9]/(19|20)[0-9]{2}$";

        boolean exp = (!txtValue.matches(strPtn));
        return showMessage(txtField, messag, exp);
    }
}
