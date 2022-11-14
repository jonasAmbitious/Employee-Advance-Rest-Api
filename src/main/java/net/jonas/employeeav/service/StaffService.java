package net.jonas.employeeav.service;

import net.jonas.employeeav.model.Staff;
import net.jonas.employeeav.repository.StaffEmailRepository;
import net.jonas.employeeav.repository.StaffJobRepository;
import net.jonas.employeeav.repository.StaffLocationRepository;
import net.jonas.employeeav.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private StaffEmailRepository staffEmailRepository;

    @Autowired
    private StaffLocationRepository staffLocationRepository;

    @Autowired
    private StaffJobRepository staffJobRepository;

    public List<Staff> listStaff(){
        return staffRepository.findAll();
    }
    public Staff getEmployee(Integer staffID){
        return staffRepository.findById(staffID).orElseThrow(
                () -> new NoSuchElementException()
        );
    }
}
