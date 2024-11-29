package BT9;

import java.util.ArrayList;

public class Dictionary {
	private ArrayList<Word> wordList;
	
	// Constructor
	public Dictionary() {
		this.wordList = new ArrayList<>();
	}
	
	public void showAllWords() {
		if(wordList.isEmpty()) {
			System.out.println("The dictionary is empty.");
		}
		else {
			for (Word word : wordList) {
				System.out.println(word.toString());
			}
		}
	}
	
	public void addWord(String englishKey, String mean)
	{
		for (Word word : wordList) {
			if(word.getEnglishKey().equals(englishKey)) {
				word.addMean(mean);
				return;
			}
		}
		Word newWord = new Word(englishKey);
		newWord.addMean(mean);
		wordList.add(newWord);
	}
	
	public void removeWordByEnglishKey(String englishKey) {
		wordList.removeIf(word-> word.getEnglishKey().equals(englishKey));
		System.out.println ("Remove wor: " + englishKey);
	}
	
	public void updateWord(String englishKey, String oldMean, String newMean) {
		for (Word word : wordList) {
			if (word.getEnglishKey().equals(englishKey)) {
				ArrayList<String> means = word.getMeans();
				if (means.contains(oldMean)) {
					means.set(means.indexOf(oldMean), newMean);
					System.out.println("Updated meaning for word: " + englishKey);
					} else {
						System.out.println("Old meaning not found for word: " + englishKey);
					}
			}
		}
	}
	
	public void removeMeanOfWordByEnglishKey(String englishKey, String mean) {
		for (Word word : wordList) {
			if(word.getEnglishKey().equals(englishKey)) {
				ArrayList<String> means = word.getMeans();
				if(means.remove(mean)) {
					System.out.println("Removed meaning: " + mean);
				} else {
					System.out.println("Meaning not found: " + mean);
				}
				return;
			}
		}
		System.out.println("Word not found: " + englishKey);
	}
	
	public Word searchWordByEnglishKey(String englishKey) {
		for (Word word : wordList) {
			if(word.getEnglishKey().equals(englishKey))
				return word;
		}
		System.out.println("Word not found: " + englishKey);
	    return null;
	}
	public boolean containsEnglishKey(String englishKey) {
		for (Word word : wordList) {
			if(word.getEnglishKey().equals(englishKey)) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<String> getEnglishKeyList() {
		ArrayList<String> keys = new ArrayList<>();
		for (Word word : wordList) {
			keys.add(word.getEnglishKey());
		}
		return keys;
	}
	public ArrayList<ArrayList<String>> getMeanList() {
		ArrayList<ArrayList<String>> allMeans = new ArrayList<>();
		for (Word word : wordList) {
			allMeans.add(word.getMeans());
		}
		return allMeans;
	}
	
}
