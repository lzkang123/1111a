package com.example.springboot2;

import Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @GetMapping
    public String selectAll()
    {
        List<student> l=new ArrayList<student>();
        l=studentMapper.selectAll();
        System.out.println(l);
        return  "查询全部";

    }
    @GetMapping("/{id}")
    public String SelectById(@PathVariable int id)
    {
        student student=new student();
        student=studentMapper.selectById(id);
        System.out.println(student);
        return  "按id查询单个";
    }
    @PostMapping
    public String Save(@RequestBody student student)
    {

        return "插入"+studentMapper.SaveStudent(student);
    }
    @DeleteMapping("/{id}")
    public String DeleteById(@PathVariable int id)
    {

        return "删除id为"+id+"的数据"+studentMapper.DeleteById(id);
    }
    @PutMapping
    public String update(@RequestBody student student)
    {

        return "修改数据"+studentMapper.update(student);
    }
    @DeleteMapping("/a/{ids}")
    public String deletebyids(@PathVariable int [] ids)
    {
        studentMapper.DeleteByIds(ids);
        return "删除多个数据";
    }
    @Transactional
    @GetMapping("/b/{y}")
    public void test(@PathVariable int y)
    {
        student s=new student();
        s.setId(1);
        s.setAge(80);
        s.setName("五眼");

        studentMapper.update(s);
        System.out.println("已经执行=============");
        int p=1/y;

    }


}
