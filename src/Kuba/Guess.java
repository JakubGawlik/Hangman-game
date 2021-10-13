package Kuba;

public class Guess {
    private final String name;
    private final String difficultyLevel;
    private final String category;

    public Guess(String name, String difficultyLevel, String category) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public String getDifficultyLevel() {
        return difficultyLevel;
    }
}
