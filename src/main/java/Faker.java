import com.github.javafaker.Faker;
import com.github.javafaker.Dog;
import com.github.javafaker.Name;
import java.util.Locale;

class DataGenerator {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("pl"));

//        Dog dog = faker.dog();
//        String dogbreed = faker.dog().breed();
//        System.out.println("Losowe rasy psów:");
//        final int randomDataSize = 10;
//        for (int i = 0; i < randomDataSize; i++) {
//            System.out.println("Rasa psa: " + dog.breed() +" " + dog.age() + " " + dog.name());
//        }

        Name name = faker.name();
        System.out.println("Losowe adresy email:");
        final int randomDataSize = 77;
        for (int i = 0; i < randomDataSize; i ++) {
            System.out.println((name.firstName() + "." + name.lastName() + "@gmail.com").toLowerCase());
        }
    }
}