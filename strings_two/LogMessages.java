package strings_two;
//	A server continuously generates log messages. The administrator wants to know how many times the word ERROR appears in a log file.
//  Write a program that counts the number of occurrences of ERROR and displays the result.
public class LogMessages {
    public static void main(String[] args) {
        String logMsg = "INFO: Server started successfully. ERROR: Failed to connect to the database. INFO: User logged in. ERROR: Invalid input provided. INFO: Server shutdown initiated.";
        String errorWord = "ERROR";

        int count = 0;
        int index = logMsg.indexOf(errorWord);
    
        //System.out.println(index);

        while (index != -1) {
            count++;
            index = logMsg.indexOf(errorWord, index + errorWord.length());
        }

        System.out.println("Number of occurrences of " + errorWord + ": " + count);
    }
}
