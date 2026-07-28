package strings_two;
// A messaging application needs to block inappropriate words before displaying messages. Given a chat message and a list of blocked words,
//  replace each blocked word with **** and display the filtered message.

public class BlockInappropriate {
    public static void main(String[] args) {
        String message = "This is a bad message with some inappropriate words.";
        String[] blockedWords = {"bad", "inappropriate"};

        String filteredMessage = filterMessage(message, blockedWords);
        System.out.println("Filtered Message: " + filteredMessage);
    }
    public static  String filterMessage(String message, String[] blockedWords) {
        String filteredMessage = message;
        for (String word : blockedWords) {
            filteredMessage = filteredMessage.replaceAll(word, "****");
        }
        return filteredMessage;
    }
}
