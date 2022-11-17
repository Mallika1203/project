import java.util.StringTokenizer;

class stdemo{
    static String in = "title=Diary of a: wimpy kid;" + "Author=xyz;" + "publishers=dhwd;";
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer(in, "=;");
        while(st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}