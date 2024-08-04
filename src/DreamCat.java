

public class DreamCat extends DreamPet{
    Hair hairless;

    /**
     * @param breed    String representing the Pet's breed
     * @param sex      String (male or female)
     * @param deSexed  String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     * @param minAge   lowest age user would be willing to adopt
     * @param maxAge   highest age user would be willing to adopt
     * @param hairless Enum constant currently representing HAIRLESS or NA
     */
    public DreamCat(String breed, Sex sex, DeSexed deSexed, Purebred purebred, int minAge, int maxAge, Hair hairless) {
        super(breed, sex, deSexed, purebred, minAge, maxAge);
        this.hairless=hairless;
    }

    /**
     * @param breed    String representing the Pet's breed
     * @param sex      String (male or female)
     * @param deSexed  String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     * @param hairless Enum constant currently representing HAIRLESS or NA
     */
    public DreamCat(String breed, Sex sex, DeSexed deSexed, Purebred purebred, Hair hairless) {
        super(breed, sex, deSexed, purebred);
        this.hairless=hairless;
    }

    /**
     * @return hairless Enum constant currently representing HAIRLESS or NA
     */
    public Hair getHairless() {
        return hairless;
    }

    @Override
    public String getDreamPetDescription(){
        return super.getDreamPetDescription()+".\n > Hairless: "+this.getHairless();
    }

    @Override
    public boolean compareDreamPets(DreamPet petCriteria) {
        if(petCriteria instanceof DreamCat cat) {
            if (!super.compareDreamPets(petCriteria)) return false;
            if(cat.getHairless().equals(Hair.NA)) return true;
            return this.getHairless().equals(cat.getHairless());
        }
        return false;
    }
}
