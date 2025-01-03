
public class WordFrequency {
    public static void main(String[] args) {
        //UC1
        String sentence1 = "To be or not to be";
        //UC2
        String sentence2 ="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        // Normalize the sentence (convert to lowercase and split by spaces)
        String[] words = sentence1.toLowerCase().split(" ");
        String[] words2 = sentence2.toLowerCase().split(" ");
        // Create a LinkedList to store the key-value pairs
        LinkedList linkedList = new LinkedList();
        // Insert or update the frequency of each word
        for (String word : words) {
            linkedList.insertOrUpdate(word);
        }

        for (String word : words2) {
            linkedList.insertOrUpdate(word);
        }
        System.out.println("\nRemoving the word 'avoidable':");
        linkedList.remove("avoidable");
        // Display the frequency of words
        linkedList.display();
    }
}