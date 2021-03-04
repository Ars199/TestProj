import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NameAge {
    public static void main(String[] args) {
        String a = "Petya";
        int agePetya = 20;
        String b = "Kolya";
        int ageKolya = 33;
        String c = "Lena";
        int ageLena = 25;

        ArrayList<Integer> age = new ArrayList<>();
        age.add(agePetya);
        age.add(ageKolya);
        age.add(ageLena);

        ArrayList<String> person = new ArrayList<>();
        person.add(a);
        person.add(b);
        person.add(c);

        for (int i = 0; i < age.size(); i++) {
            if (age.get(i) < 30) {
                System.out.println(person.get(i) + " " + age.get(i));
            } else {
                //System.out.println("The person is older than 30");
            }
        }
    }
}




