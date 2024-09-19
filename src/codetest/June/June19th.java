package codetest.June;

public class June19th {
    public static void main(String[] args) {
       String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";



        //from key, remove spaces and repetited letters.
        String trim = key.replace(" ", "");
        String trimed = "";
        for (int i = 0; i < trim.length(); i++) {
            if (trimed.indexOf(trim.substring(i,i+1))>0){
                continue;
            }
            trimed+=trim.substring(i,i+1);
        }
        System.out.println("trimed = " + trimed);

        StringBuilder newMessage = new StringBuilder();
        int i=0;
        for (char c: message.toCharArray()) {
            if (c == ' ') {
                newMessage.append(' ');
            } else { //c=v -> find v in trimed and return the index, calculate the index to in alphabet order
                int index=trimed.indexOf(c);
                if (index != -1) {
                    newMessage.append((char) ('a' + index));
                } else newMessage.append(c);

            }

        }
        System.out.println("newMessage = " + newMessage);


    }
}
