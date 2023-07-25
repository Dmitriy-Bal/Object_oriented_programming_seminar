package org.example.ClassWork.Ex1.Service;

import org.example.ClassWork.Ex1.Model.AbstractUser;
import org.example.ClassWork.Ex1.Model.Type;

import java.util.List;

public interface DataService {

    public void userCreate(String name, String lastName, int valuation, int classNumber, Type type);

    List<AbstractUser> read();

    List<AbstractUser> readOnlyStudents();

    List<AbstractUser> readOnlyTeacher();
}
