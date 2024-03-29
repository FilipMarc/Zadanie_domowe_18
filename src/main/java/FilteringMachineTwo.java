import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> kidNamesList = new ArrayList<>();
        ppl
                .stream()
                .filter(i -> i.getAge() < 18)
                .forEach(i ->kidNamesList.add(i.getName()));

        return kidNamesList;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> users = new ArrayList<>();
        people
                .stream()
                .forEach(person -> users
                        .add(new User(person.getName(), person.getAge(),
                        person.getName() + "_" + person.getAge())));

        return users;
    }
}
