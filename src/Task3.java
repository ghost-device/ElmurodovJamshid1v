public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"cd","ac","dc","ca","zz","dc"};

        System.out.println(task3(arr));
    }

    public static int task3(String[] words){
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (reverseWord(words[i]).equals(words[j])){
                    count++;
                }
            }
        }

        return count;
    }

    public static String reverseWord(String word){
        StringBuilder sb = new StringBuilder(word);

        return sb.reverse().toString();
    }
}
