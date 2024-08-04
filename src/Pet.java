
import java.text.DecimalFormat;

/**
 * @param name            the Pet's name
 * @param microchipNumber the Pet's microchip number - unique 9-digit number
 * @param age             the Pet's age in years
 * @param adoptionFee     a double representing the adoption fee for this Pet
 * @param dreamPet        a pet's 'dream' properties
 */
public record Pet(String name, long microchipNumber, int age, double adoptionFee, DreamPet dreamPet) {

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.name() + " (" + this.microchipNumber() + ") is a " + this.age() + " year old " +
                this.dreamPet().getDreamPetDescription() + ".\n > Adoption fee: $" + df.format(this.adoptionFee()) + "\n";
    }
}