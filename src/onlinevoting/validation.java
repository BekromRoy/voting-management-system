/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinevoting;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Bekrom
 */
public class validation {
    boolean isNumber(String st){
        for(int i =0;i < st.length();i++){
            if(st.charAt(i)<48 || st.charAt(i)>57)
                return false;
        }
        return true;
    }
    boolean isText(String st){
        char[] chars = st.toCharArray();
        for(char c : chars){
           if(Character.isDigit(c))
               return false;
        }
        return true;
    }
    boolean isNotText(String st){
        char[] chars = st.toCharArray();
        for(char c : chars){
           if(Character.isDigit(c))
               return true;
        }
        return false;
    }
    boolean isSpecialChar(String st){
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher match = pattern.matcher(st);
        if(match.find() == true)
            return false;
        return true;
    }
    boolean isNumSpecialChar(String st){
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher match = pattern.matcher(st);
        if(match.find() == true)
            return false;
        return true;
    }
    boolean isNotSpecialChar(String st){
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher match = pattern.matcher(st);
        if(match.find() == true)
            return true;
        return false;
    }
    boolean isId(String st){
        if(st.length() == 4)
            return true;
        return false;
    }
    boolean isBirth(String st){
        if(st.length() == 4){
            int stt = Integer.valueOf(st);
            if(stt < 2013)
                return true;
        }
        return false;
    }
    boolean isTen(String st){
        if(st.length() == 10)
            return true;
        return false;
    }
    boolean isTwelve(String st){
        if(st.length() == 12)
            return true;
        return false;
    }
    boolean isThirty(String st){
        if(st.length() <= 30)
            return true;
        return false;
    }
    boolean isEToF(String st){
        if(st.length() >=8 && st.length() <=15)
            return true;
        return false;
    }
    boolean isFifty(String st){
        if(st.length() <= 50)
            return true;
        return false;
    }
    boolean isPassword(String st){
        String REG = "^(?=.*\\d)(?=\\S+$)(?=.*[@#$%^&+=])(?=.*[a-z])(?=.*[A-Z]).{8,10}$";
        Pattern PATTERN = Pattern.compile(REG);
        if(PATTERN.matcher(st).matches())
            return true;
        return false;
    }
    boolean isAge(String st){
        int age = Integer.parseInt(st);
        LocalDate currentdate = LocalDate.now();
        int currentyear = currentdate.getYear();
        if((currentyear - age) >= 18)
            return true;
        return false;
    }
}
