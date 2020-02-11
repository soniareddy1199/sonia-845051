import java.util.*;
class Stwentythree{
      public static void main(String[] args) {
            String s = "I work for cognizant";
            System.out.println(noOfWordsInString(s));
      }
      public static int noOfWordsInString(String s) {
            StringTokenizer t = new StringTokenizer(s," ");
            return t.countTokens();
      }
}