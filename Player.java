public enum Player {
    ONE ("X"),
    TWO ("O");

    private final String letter;

    Player(String letter){
        this.letter = letter;
    }

    public String letter(){
        return letter;
    }
    
}
