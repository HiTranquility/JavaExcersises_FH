package BT9;
import java.util.ArrayList;
public class Word {
	private String englishKey;
	private ArrayList<String> means;
	
	// Constructor
	public Word(String englishKey) {
		this.englishKey = englishKey;
		this.means = new ArrayList<>();
	}

	// Getters and Setters
	public String getEnglishKey() {
		return englishKey;
	}
	public void setEnglishKey(String englishKey) {
		this.englishKey = englishKey;
	}
	public ArrayList<String> getMeans() {
		return means;
	}
	public void setMeans(ArrayList<String> means) {
		this.means = means;
	}
	public void addMean(String mean) {
        this.means.add(mean);
    }
	@Override
	public String toString() {
		return "Word{" + "englishKey = '" + englishKey + '\'' + ", means=" + means + String.join(", ", means) + '}';
	}
}
