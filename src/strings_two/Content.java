package strings_two;
//16.	A content management system receives articles from writers. Develop a program to display:
//	 Total number of words 
//	 Total number of characters 
//	 Longest word 
//	 Shortest word 
//	Average word length 

public class Content {
    public static void main(String[] args) {
        String article = "This is a sample article for testing the content management system.";
        String[] words = article.split("\\s+");
        
        int totalWords = words.length;
        int totalCharacters = article.replaceAll("\\s+", "").length();
        
        String longestWord = "";
        String shortestWord = words[0];
        int totalWordLength = 0;

        for (String word : words) {
            totalWordLength += word.length();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        double averageWordLength = (double) totalWordLength / totalWords;
        System.out.println("Total number of words: " + totalWords);
        System.out.println("Total number of characters: " + totalCharacters);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Average word length: " + averageWordLength);
    }
}
