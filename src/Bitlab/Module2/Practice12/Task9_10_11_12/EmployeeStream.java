package Bitlab.Module2.Practice12.Task9_10_11_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeStream {
    static void printUniqueLastNames(List<Employee> employees) {
        TreeSet<String> filteredList = new TreeSet<>();

        employees.stream()
                .forEach(e -> filteredList.add(e.getLastName()));

        for (String s : filteredList) {
            System.out.println(s);
        }
    }

    static double calculateAverageSalaryOfEmployeesYoungerThan30(List<Employee> employees) {
        ArrayList<Employee> youngerThan30 = (ArrayList<Employee>) employees.stream()
                .filter(e -> e.getAge() < 30)
                .collect(Collectors.toList());

        double sum = youngerThan30.stream()
                .mapToDouble(e -> e.getSalary()).sum();

        return (sum / youngerThan30.size());
    }

    static double findMaximumSalaryOfEmployeesOlderThan50(List<Employee> employees) {
        ArrayList<Double> olderThan50 = (ArrayList<Double>) employees.stream()
                .filter(e -> e.getAge() > 50)
                .map(e -> e.getSalary())
                .collect(Collectors.toList());

        return olderThan50.stream()
                .max(Double::compareTo)
                .get();
    }

    static void printAverageSalaryByAge(List<Employee> employees) {
        HashSet<Integer> ages = (HashSet<Integer>) employees.stream()
                .map(e -> e.getAge())
                .collect(Collectors.toSet());

        for (Integer a : ages) {
            double sum = employees.stream()
                    .filter(s -> s.getAge() == a)
                    .mapToDouble(d -> d.getSalary())
                    .sum();

            int count = (int) employees.stream()
                    .filter(s -> s.getAge() == a)
                    .count();

            if (count != 0) {
                System.out.println("Average salary for age " + a + ": " + (sum / count));
            }
        }
    }
}
