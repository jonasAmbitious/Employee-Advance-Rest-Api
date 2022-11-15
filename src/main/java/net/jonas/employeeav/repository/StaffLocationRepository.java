package net.jonas.employeeav.repository;

import net.jonas.employeeav.model.StaffLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffLocationRepository extends JpaRepository <StaffLocation,Integer> {
}
