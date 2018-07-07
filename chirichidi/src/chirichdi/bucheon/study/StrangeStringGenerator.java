package chirichdi.bucheon.study;

public class StrangeStringGenerator {


    public static void main(String[] args) {

        String s = "hello world";

        StrangeStringGenerator generator = new StrangeStringGenerator();
        generator.solution(s);
    }


    public String solution(String s) {
        String answer = "";

        StringBuffer sb = new StringBuffer();

        for (int i = 0, j = 0; i < s.length(); i++, j++)
        {
            boolean isEvenIndex = j % 2 == 0;

            int asciiOfChar = s.charAt(j);

            if (isEvenIndex == true)
            {
                if (asciiOfChar >= 97) //'a'
                {
                    sb.append((char)(asciiOfChar-32));
                }
            }
            else
            {
                if (asciiOfChar < 97)
                {
                    sb.append((char)(asciiOfChar+32));
                }
            }

            if (s.charAt(i) == ' ')
            {
                j = 0;
            }
        }

        answer = sb.toString();

        return answer;
    }
}
