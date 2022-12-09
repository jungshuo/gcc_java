package gcc.example.studentmanager.dao;

import gcc.example.studentmanager.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDao {
    //全查学生信息 返回值是list的集合，泛型是Students
    public List<Student> selectAll();
}
