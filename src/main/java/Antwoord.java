public class Antwoord {
    private String antwoord;
    private boolean correct;

    public Antwoord(String antwoord, boolean correct) {
        this.antwoord = antwoord;
        this.correct = correct;
    }

    public String getAntwoord() {
        return antwoord;
    }

    public void setAntwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
