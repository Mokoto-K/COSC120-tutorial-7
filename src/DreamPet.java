import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DreamPet {

    private final int minAge;
    private final int maxAge;
    private final Map<Criteria, Object> criteria;

    /**
     *
     * @param minAge lowest age user would be willing to adopt
     * @param maxAge highest age user would be willing to adopt
     */
    public DreamPet(Map<Criteria, Object> criteria, int minAge, int maxAge) {
        if (criteria==null) this.criteria=new LinkedHashMap<>();
        else this.criteria = new LinkedHashMap<>(criteria);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    /**
     *
     * @param
     */
    public DreamPet(Map<Criteria, Object> criteria) {
        if (criteria==null) this.criteria=new LinkedHashMap<>();
        else this.criteria = new LinkedHashMap<>(criteria);
    }

    public Map<Criteria, Object> getAllCriteria() {
        return new HashMap<>(criteria);
    }

    public Object getCriteria(Criteria key) {return getAllCriteria().get(key); }

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
    public String getDreamPetDescription(Map<Criteria, Object> criteria){
        StringBuilder description = new StringBuilder();
        for (Criteria key : criteria.keySet()) {
            description.append("\n").append(key).append(": ").append(getCriteria(key));
        }
        return description.toString();
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