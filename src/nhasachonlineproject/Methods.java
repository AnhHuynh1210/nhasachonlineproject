package nhasachonlineproject;

import java.util.regex.Pattern;

public class Methods {
    public static boolean checkNum(String yourstr){
        if (yourstr == null || yourstr.length() == 0)
            return false;
        for (char chr : yourstr.toCharArray()){
            if (!Character.isDigit(chr))
                return false;
        }
        return true;
    }
    
    public static boolean checkRangeInt(String yourstr, int first, int last){
        if (checkNum(yourstr)){
            int yournum = Integer.parseInt(yourstr);
            if (yournum >= first && yournum <= last){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isEmail(String yourmail)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";                         
        Pattern pat = Pattern.compile(emailRegex);
        if (yourmail == null)
            return false;
        return pat.matcher(yourmail).matches();
    }
}
