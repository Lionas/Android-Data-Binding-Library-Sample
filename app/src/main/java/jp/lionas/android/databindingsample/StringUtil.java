package jp.lionas.android.databindingsample;

public class StringUtil {

    public static String insertString(String str) {
        if(str != null && !str.isEmpty()) {
            return "<<<" + str + ">>>";
        }else{
            return "";
        }
    }

}
