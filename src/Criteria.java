public enum Criteria {
    BREED, SEX, DESEXED, PUREBREED, HAIR;

    public String toString() {
        return switch (this) {
            case BREED -> "Breed of animal";
            case SEX -> "Sex of animal";
            case DESEXED -> "DeSexed status";
            case PUREBREED -> "Purebred";
            case HAIR -> "Length of hair";
        };
    }
}
