/**
 * @author Dr Andreas Shepley (asheple2@une.edu.au | andreashepley01@gmail.com)
 * created for COSC120 (Trimester 1 2022)
 * last revised: Trimester 1 2024
 */

public class DreamDog extends DreamPet{

    private LevelOfTraining levelOfTraining;
    private int amountOfExercise;

    /**
     * @param breed    String representing the Pet's breed
     * @param sex      String (male or female)
     * @param deSexed  String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     * @param minAge   lowest age user would be willing to adopt
     * @param maxAge   highest age user would be willing to adopt
     */
    public DreamDog(String breed, Sex sex, DeSexed deSexed, Purebred purebred, int minAge, int maxAge) {
        super(breed, sex, deSexed, purebred, minAge, maxAge);
    }

    /**
     * @param breed    String representing the Pet's breed
     * @param sex      String (male or female)
     * @param deSexed  String (yes - de-sexed or no - not de-sexed)
     * @param purebred Enum Purebred representing yes/no/na
     * @param levelOfTraining an Enum representing the level of training a dog is at
     * @param amountOfExercise an integer representing the daily exercise minutes required by this dog
     */
    public DreamDog(String breed, Sex sex, DeSexed deSexed, Purebred purebred, LevelOfTraining levelOfTraining, int amountOfExercise) {
        super(breed, sex, deSexed, purebred);
        this.levelOfTraining=levelOfTraining;
        this.amountOfExercise=amountOfExercise;
    }

    /**
     * @return the Dog's level of training from none to advanced (enum)
     */
    public LevelOfTraining getLevelOfTraining(){
        return this.levelOfTraining;
    }

    /**
     * @return an integer representing the daily exercise minutes required by this dog
     */
    public int getAmountOfExercise(){
        return this.amountOfExercise;
    }

    @Override
    public String getDreamPetDescription(){
        return super.getDreamPetDescription()+".\n > Level of training: "+this.getLevelOfTraining()+
                ".\n > Exercise per day: "+this.getAmountOfExercise()+" minutes.";
    }

    @Override
    public boolean compareDreamPets(DreamPet petCriteria) {
        if(petCriteria instanceof DreamDog){
            return super.compareDreamPets(petCriteria);
        }
        return false;
    }
}
