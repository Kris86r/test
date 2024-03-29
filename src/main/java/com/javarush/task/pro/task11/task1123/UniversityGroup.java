package com.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.List;


public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(el -> el.equals(excludedStudent));
        //   List<String > copyOfStudents = new ArrayList<>(students);
        //   for (String copy:copyOfStudents) {
        //       if (excludedStudent.equals(copy)) {
        //           students.remove(copy);
        //       }
        //   }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}





























