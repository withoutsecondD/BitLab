package Bitlab.Module2.Practice12.Task8;

import java.util.List;
import java.util.stream.Collectors;

class PersonFilter {
    List<Person> filterPersons(List<Person> persons) {
        return
                persons.stream()
                        .filter(p -> p.getAge() > 18 && p.getCity().equals("Almaty"))
                        .collect(Collectors.toList());
    }
}