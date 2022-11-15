package net.jonas.employeeav.controller;

import net.jonas.employeeav.model.Staff;
import net.jonas.employeeav.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @GetMapping("/{staffId}")
    public ResponseEntity <Staff> getEmployee(@PathVariable Integer staffId){
        try{
            Staff staff = staffService.getEmployee(staffId);
            return new ResponseEntity<>(staff, HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
