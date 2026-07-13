package com.xworkz.bankingApplication.service.impl;

import com.xworkz.bankingApplication.dao.ManagerDao;
import com.xworkz.bankingApplication.dao.impl.ManagerDaoImpl;
import com.xworkz.bankingApplication.dto.ManagerDto;
import com.xworkz.bankingApplication.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
    ManagerDao managerDao= new ManagerDaoImpl();

    @Override
    public boolean save(ManagerDto dto) {
        return managerDao.save(dto);
    }
}
