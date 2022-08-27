/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author PHANMINHTIEN
 */
public class validator {
    
    public static boolean checkName(JTextField feild, StringBuilder stringBuilder) {
        // create variable validata for update status
        boolean isValidate = true;

        if (!checkEmpty(feild, stringBuilder, "Name is not empty!")) {
            return false;
        }

        try {
            String name = feild.getText();
            Pattern pattern = Pattern.compile("[/.!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher matcher = pattern.matcher(name);
            boolean isSpecial = matcher.find();

            char[] chars = name.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    stringBuilder.append("Name does not contain number!\n");
                    feild.setBorder((Border) Color.red);
                 break;
                }
            }
            // for special characters
            if (isSpecial) {
                stringBuilder.append("Name does not contain special characters!\n");
                feild.setBackground(new Color(214, 0, 0, 116));
            }

            if (name.startsWith(" ")) {
                stringBuilder.append("Please remove space!\n");
                feild.setBackground(new Color(214, 0, 0, 116));
            }

        } catch (Exception e) {
            stringBuilder.append("Name must be a string!\n");
            feild.setBackground(new Color(204, 0, 0, 21));
            System.out.println("Name error: " + e.getMessage());
            isValidate = false;
        }

        if (isValidate) {
            feild.setBackground(Color.green);
        }

        return isValidate;
    }

    public static boolean checkEmpty(JTextField feild, StringBuilder stringBuilder, String message) {
        boolean isValidate = true;
        if (feild.getText().equals("")) {
            stringBuilder.append(message).append("\n");
            feild.setBackground(new Color(214, 0, 0, 116));
            isValidate = false;
        } else {
            feild.setBackground(Color.white);
        }
        return isValidate;
    }

    public void checkIsCorrect(JTextField feild, StringBuilder stringBuilder, String message) {
        if (!feild.getText().isBlank()) {
            feild.setBackground(new Color(255, 255, 255, 255));
        }
    }

    public static boolean checkId(JTextField feild, StringBuilder stringBuilder) {
        // create variable validate for update status
        boolean isValidate = true;

        if (!checkEmpty(feild, stringBuilder, "Id is not empty!")) {
            return false;
        }

        try {
            String ID = feild.getText();
            Pattern pattern = Pattern.compile("[/.!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher matcher = pattern.matcher(ID);
            boolean isSpecial = matcher.find();

            // for special characters
            if (isSpecial) {
                stringBuilder.append("id does not contain special characters!");
                feild.setBackground(new Color(214, 0, 0, 116));
            }

            if (ID.startsWith(" ")) {
                stringBuilder.append("Please remove space!\n");
                feild.setBackground(new Color(214, 0, 0, 116));
            }

        } catch (Exception e) {
            stringBuilder.append("id must be a string!");
            feild.setBackground(new Color(204, 0, 0, 21));
            System.out.println("Name error: " + e.getMessage());
            isValidate = false;
        }

        if (isValidate) {
            feild.setBackground(Color.red);
        }

        return isValidate;
    }
}
