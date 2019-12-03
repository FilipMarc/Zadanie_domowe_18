import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return numberList
                .stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
//        List<Integer> numList = numberList
//                .stream()
//                .filter(i -> i > 20)
//                .collect(Collectors.toList());
//        return numberList;
        return numberList
                .stream()
                .filter(i -> i > 20)
                .collect(Collectors.toList());
    }

    public List<Book> convertToBooks(List<String> titles) {
        List<Book> titlesList = new ArrayList<>();
        titles
                .stream()
                .forEach(i -> titlesList.add(new Book(i)));

        return titlesList;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {
        List<Book> titleList = new ArrayList<>();
        titles
                .stream()
                .filter(i -> i.startsWith("Gra"))
                .forEach(i -> titleList.add(new Book(i)));

        return titleList;
    }
}
