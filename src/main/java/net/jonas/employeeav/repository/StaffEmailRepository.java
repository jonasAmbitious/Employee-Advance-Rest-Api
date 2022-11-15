package net.jonas.employeeav.repository;

import net.jonas.employeeav.model.StaffEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface StaffEmailRepository extends JpaRepository<StaffEmail,Integer> {
    Set<StaffEmail> findStaffEmailByStaffId(Integer staffID);
    Set<StaffEmail> findStaffEmailsByStaffId(Integer staffID);
}
