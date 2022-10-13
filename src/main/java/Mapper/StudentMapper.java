package Mapper;

import com.example.springboot2.User;
import com.example.springboot2.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Mapper

    public List<student> selectAll();
    public student selectById(@Param("id") int id);
    public boolean SaveStudent(student student);
    public boolean DeleteById(@Param("id") int id);
    public boolean update(student student);
    public boolean DeleteByIds(@Param("ids") int [] ids);
}
