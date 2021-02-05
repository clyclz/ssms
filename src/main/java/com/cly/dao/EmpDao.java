package com.cly.dao;

import com.cly.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

public interface EmpDao {
    public int addEmp(Emp emp) throws IOException;
    public List<Emp>getAll() throws IOException;
}
