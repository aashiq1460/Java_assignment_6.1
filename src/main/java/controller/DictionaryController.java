package controller;

import model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary = new Dictionary();

    public DictionaryController() {
        dictionary.addWord("apple", "A fruit.");
        dictionary.addWord("dog", "An animal.");
        dictionary.addWord("car", "A vehicle.");
        dictionary.addWord("book", "Something you read.");
        dictionary.addWord("school", "A place to study.");
    }

    public String searchWord(String word) {

        word = word.trim().toLowerCase();

        if (word.isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.searchWord(word);

        if (meaning == null) {
            return "Word not found.";
        }

        return meaning;
    }
}