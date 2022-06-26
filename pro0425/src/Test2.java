import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Test2 {
    //无重复字符的最长子串
    public int lengthOfLongestSubstring(String s ) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left=0;
        int res=0;
        for (int i=0;i<n;i++){
            while (set.contains(s.charAt(i))){
                set.remove(left);
                left++;
            }
            set.add(s.charAt(i));
            res= Math.max(res,set.size());
        }
        return res;
    }
    static String buildInsertSql(String table, String[] fields) {
        // TODO:
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INERT INTO")
                .append(table)
                .append("(");
        String valueStr = String.join(",",fields);
        String fieldStr = valueStr;
        for (String field:fields){
            valueStr = valueStr.replace(field,"?");
        }
        sb.append(fieldStr)
                .append(")VALUES")
                .append("(")
                .append(valueStr)
                .append(")");
        return sb.toString();
    }

    static String buildSelectSql(String table, String[] fields) {
        // TODO:
        StringJoiner sj = new StringJoiner(",","SELECT","FROM"+table);
        for (String filed:fields){
            sj.add(filed);
        }
        return sj.toString();
    }

}
