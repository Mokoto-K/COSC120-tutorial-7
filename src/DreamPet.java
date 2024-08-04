
public class DreamPet {

    private final String breed;
    private final Sex sex;
    private final DeSexed deSexed;
    private final Purebred purebred;
    private int minAge;
    private int maxAge;

    /**
     *
     * @param breed String representing the Pet's breed
     * @param sex String (male or female)
     * @param deSexed String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     * @param minAge lowest age user would be willing to adopt
     * @param maxAge highest age user would be willing to adopt
     */
    public DreamPet(String breed, Sex sex, DeSexed deSexed, Purebred purebred, int minAge, int maxAge) {
        this.breed = breed;
        this.sex = sex;
        this.deSexed = deSexed;
        this.purebred=purebred;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    /**
     *
     * @param breed String representing the Pet's breed
     * @param sex String (male or female)
     * @param deSexed String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     */
    public DreamPet(String breed, Sex sex, DeSexed deSexed, Purebred purebred) {
        this.breed = breed;
        this.sex = sex;
        this.deSexed = deSexed;
        this.purebred=purebred;
    }

    /**
     * @return the Pet's breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @return the Pet's sex (male or female)
     */
    public Sex getSex() { return sex;}

    /**
     * @return the Pet's de-sexed status
     */
    public DeSexed isDeSexed() { return deSexed; }

    /**
     * @return Purebred constant yes (purebred), no(not purebred) or NA
     */
    public Purebred getPurebred() {
        return purebred;
    }

    /**
     * @return a 'dream' Pet's min age
     */
    public int getMinAge() {
        return minAge;
    }
    /**
     * @return a 'dream' Pet's max age
     */
    public int getMaxAge() {
        return maxAge;
    }

    /**
     * @return a formatted description of generic DreamPet features
     */
    public String getDreamPetDescription(){
        if(this.purebred.equals(Purebred.YES)) return this.getSex()+ " purebred " +this.getBreed()+".\n > De-sexed: "+this.isDeSexed();
        return this.getSex()+ " " +this.getBreed()+".\n > De-sexed: "+this.isDeSexed();
    }

    /**
     * method to compare two DreamPet objects against each other for compatibility
     * @param petCriteria an imaginary Pet representing the user's criteria
     * @return true if matches, false if not
     */
    public boolean compareDreamPets(DreamPet petCriteria) {
        if (!petCriteria.getBreed().equals("NA") && !this.getBreed().equals(petCriteria.getBreed())) return false;
        if (!this.getSex().equals(petCriteria.getSex())) return false;
        if (!this.isDeSexed().equals(petCriteria.isDeSexed())) return false;
        if (petCriteria.getPurebred().equals(Purebred.YES) || petCriteria.getPurebred().equals(Purebred.NO)){
            return this.getPurebred().equals(petCriteria.getPurebred());
        }
        return true;
    }
}