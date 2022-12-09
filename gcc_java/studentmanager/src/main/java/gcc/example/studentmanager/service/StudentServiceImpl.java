package gcc.example.studentmanager.service;

import gcc.example.studentmanager.dao.StudentDao;
import gcc.example.studentmanager.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao sd;
    @Override
    public List<Student> queryAll() {
        return sd.selectAll();
    }
}
