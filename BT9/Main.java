package BT9;

public class Main {
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		System.out.println("Dictionary after initing:");
		dict.showAllWords();
		System.out.println();
		dict.addWord("action", "tac dung");
		dict.addWord("action", "hoat dong");
		dict.addWord("action", "hanh vi");
		dict.addWord("game", "tro choi");
		dict.addWord("game", "ke hoach");
		dict.addWord("game", "co bac");
		dict.addWord("king", "nha vua");
		dict.addWord("king", "ong trum");
		System.out.println("Dictionary after adding 3 words:");
		dict.showAllWords();
		System.out.println();
		dict.updateWord("king", "ong trum", "lanh chua");
		System.out.println("Dictionary after updating word has english key by king with value by ong trum:");
		dict.showAllWords();
		System.out.println();
		dict.removeWordByEnglishKey("king");
		System.out.println("Dictionary after remvoving word has english key by king:");
		dict.showAllWords();
		System.out.println();
		dict.removeMeanOfWordByEnglishKey("game", "co bac");
		System.out.println("Dictionary after remvoving mean by co bac of word has english key by game:");
		dict.showAllWords();
		System.out.println();
		System.out.println("Searching word with english key by game:");
		System.out.println(dict.searchWordByEnglishKey("game"));
		}
}
