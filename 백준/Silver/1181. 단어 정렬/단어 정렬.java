import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        
        // 중복 방지
        Set<String> wordSet = new TreeSet<>((word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);  // 길이가 같으면 사전 순으로
            }
            return word1.length() - word2.length();  // 길이가 다르면 길이 순으로
        });
        
        // 단어 입력받기
        for (int i = 0; i < n; i++) {
            wordSet.add(sc.nextLine());
        }

        // 출력
        for (String word : wordSet) {
            System.out.println(word);
        }
        
        sc.close();
    }
}
