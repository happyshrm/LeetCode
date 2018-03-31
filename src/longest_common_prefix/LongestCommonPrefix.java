package longest_common_prefix;

/**
 * the longest common prefix string amongst an array of strings.
 * created by hongrm on 2018/3/31 21:07
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"12343","123","12"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            /**
             * 若前缀不相同则将前缀长度减1
             */
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
