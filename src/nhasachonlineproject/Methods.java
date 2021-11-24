package nhasachonlineproject;

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
    
    public static boolean checkRange(String yourstr, int first, int last){
        if (checkNum(yourstr)){
            int yournum = Integer.parseInt(yourstr);
            if (yournum >= first && yournum <= last){
                return true;
            }
        }
        return false;
    }
}
