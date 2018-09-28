package nowcoder.problem2;

public class Solution3 {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String new_string = string.replaceAll("\\s","%20");
        return new_string;
    }
}
