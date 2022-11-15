package net.jonas.employeeav.service;

import net.jonas.employeeav.model.Staff;
import net.jonas.employeeav.model.StaffEmail;
import net.jonas.employeeav.model.StaffJob;
import net.jonas.employeeav.model.StaffLocation;
import net.jonas.employeeav.repository.StaffEmailRepository;
import net.jonas.employeeav.repository.StaffJobRepository;
import net.jonas.employeeav.repository.StaffLocationRepository;
import net.jonas.employeeav.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

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

    public Staff getEmployee(Integer staffID){
        Staff currentStaff = staffRepository.findById(staffID).orElseThrow(
                () -> new NoSuchElementException()
        );
        StaffLocation staffLocation = staffLocationRepository.findById(currentStaff.getLocationKey()).orElseThrow(
                () -> new NoSuchElementException()
        );
        StaffJob staffJob = staffJobRepository.findById(currentStaff.getJobKey()).orElseThrow(
                () -> new NoSuchElementException()
        );

        Set<StaffEmail> staffEmails = staffEmailRepository.findStaffEmailsByStaffId(staffID);
        currentStaff.setStafflocation(staffLocation);
        currentStaff.setStaffjobs(staffJob);
        //currentStaff.setStaffemails(staffEmails);

        return currentStaff;
    }
}
