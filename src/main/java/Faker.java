import com.github.javafaker.Faker;
import com.github.javafaker.Dog;
import java.util.Locale;

class DataGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("pl-PL"));

        Dog dog = faker.dog();
        String dogbreed = faker.dog().breed();
        System.out.println("Losowe rasy psów:");
        final int randomDataSize = 10;
        for (int i = 0; i < randomDataSize; i++) {
            System.out.println("Rasa psa: " + dog.breed() +" " + dog.age() + " " + dog.name());
        }
    }
}