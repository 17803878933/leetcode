package nowcoder.problem2;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return "";
        }

        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
