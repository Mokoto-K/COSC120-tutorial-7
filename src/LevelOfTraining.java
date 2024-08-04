

public enum LevelOfTraining {
    NONE,BASIC,INTERMEDIATE,ADVANCED;

    public String toString(){
        return switch (this) {
            case NONE -> "No training at all";
            case BASIC -> "Sit, stay, lay down on instruction";
            case INTERMEDIATE -> "Play fetch, and will stop barking if instructed";
            case ADVANCED -> "perform tricks - handshake, play dead, jump over a bar";
        };
    }
}
