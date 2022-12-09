package gcc.example.studentmanager.controller;


import gcc.example.studentmanager.pojo.Student;
import gcc.example.studentmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService ss;
    @RequestMapping("queryAll")
    public String queryAll(Model model){

        List<Student> list = ss.queryAll();
            //存入model中
        model.addAttribute("list",list);
            //控制跳转
        System.out.println(list);
        return "showAll";

    }
}
