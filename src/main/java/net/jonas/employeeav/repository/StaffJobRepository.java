package net.jonas.employeeav.repository;

import net.jonas.employeeav.model.StaffJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffJobRepository extends JpaRepository<StaffJob,Integer> {
}
