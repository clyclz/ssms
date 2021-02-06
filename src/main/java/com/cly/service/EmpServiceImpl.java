package com.cly.service;



import com.cly.dao.EmpDao;
import com.cly.pojo.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Service
public class EmpServiceImpl<Emp> implements EmpService {
    @Resource


    private EmpDao empDao;




    @Override
    public int addEmp(com.cly.pojo.Emp emp) throws IOException {
        return empDao.addEmp(emp);
    }
    @Override
    public List<com.cly.pojo.Emp> getAll() throws IOException {
        return empDao.getAll();
    }

    @Override
    public com.cly.pojo.Emp getByIdAndName(com.cly.pojo.Emp emp) {
        return empDao.getByIdAndName(emp);
    }
}
