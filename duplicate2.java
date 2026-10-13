public class duplicate2 {
    public static void main(String[] args) {
     String s = "Java is a easy Java is simple.";
     String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.indexOf(word) == -1) {
                sb.append(word).append(" ");
            }
        } 
        System.out.println(sb.toString().trim());
    }
}
