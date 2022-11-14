package net.jonas.employeeav.repository;

import net.jonas.employeeav.model.StaffEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffEmailRepository extends JpaRepository<StaffEmail,Integer> {
}
