package net.jonas.employeeav.repository;

import net.jonas.employeeav.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
}
