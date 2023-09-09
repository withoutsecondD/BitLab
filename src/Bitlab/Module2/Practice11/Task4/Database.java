package Bitlab.Module2.Practice11.Task4;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Person> personList = new ArrayList<>();

    void addPerson(Person person) {
        personList.add(person);
    }

    void printYoungPeopleNames() {
        List<Person> youngPeopleList = new ArrayList<>();

        for (Person p : personList) {
            if (p.getAge() >= 18 && p.getAge() <= 30) {
                youngPeopleList.add(p);
            }
        }

        for (int i = 0; i < youngPeopleList.size() - 1; i++) {
            for (int j = i + 1; j < youngPeopleList.size(); j++) {
                if (youngPeopleList.get(i).getName().compareTo(youngPeopleList.get(j).getName()) > 0) {
                    Person temp = youngPeopleList.get(i);
                    youngPeopleList.set(i, youngPeopleList.get(j));
                    youngPeopleList.set(j, temp);
                }
            }
        }

        for (Person p : youngPeopleList) {
            System.out.println(p.getName());
        }
    };
}
