package com.example.project.Student;
import java.util.ArrayList;
public class Utility {
    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
     for (int i = 0; i < studentsToSort.size() - 1; i++) {
  for (int j = i + 1; j < studentsToSort.size(); j++) {
     Student student1 = studentsToSort.get(i);
      Student student2 = studentsToSort.get(j);
        int lastNameComparison = student1.getLastName().compareTo(student2.getLastName());
            if (lastNameComparison > 0) {
                    studentsToSort.set(i, student2);
                    studentsToSort.set(j, student1);
         } else if (lastNameComparison == 0) {
           int firstNameComparison = student1.getFirstName().compareTo(student2.getFirstName());
                 if (firstNameComparison > 0) {
                        studentsToSort.set(i, student2);
                        studentsToSort.set(j, student1);
                    } else if (firstNameComparison == 0) {
                        if (student1.getGpa() < student2.getGpa()) {
                            studentsToSort.set(i, student2);
                            studentsToSort.set(j, student1);
                        }
                    }
                }
            }
        }
        return studentsToSort;
    }
}
