package gcc.example.studentmanager.service;

import gcc.example.studentmanager.pojo.Student;

import java.util.List;

public interface StudentService {
    //全查学生信息
    public List<Student> queryAll();
}
