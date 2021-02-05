package com.cly.service;


import com.cly.pojo.Emp;

import java.io.IOException;
import java.util.List;

public interface  EmpService {
    public int addEmp(Emp emp) throws IOException;
    public List<Emp> getAll() throws IOException;
}
