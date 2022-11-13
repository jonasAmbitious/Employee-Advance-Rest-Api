package net.jonas.employeeav.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "STAFF_ID")
    private Integer staffId;
    @Basic
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Basic
    @Column(name = "LAST_NAME")
    private String lastName;
    @Basic
    @Column(name = "IDENTITY_NO")
    private String identityNo;
    @Basic
    @Column(name = "AGE")
    private Integer age;
    @Basic
    @Column(name = "DATE_REQUESTED")
    private LocalDateTime dateRequested;
    @Basic
    @Column(name = "DATE_LAST_MODIFIED")
    private LocalDateTime dateLastModified;
    @Basic
    @Column(name = "MODIFICATION_COUNT")
    private Integer modificationCount;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(LocalDateTime dateRequested) {
        this.dateRequested = dateRequested;
    }

    public LocalDateTime getDateLastModified() {
        return dateLastModified;
    }

    public void setDateLastModified(LocalDateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    public Integer getModificationCount() {
        return modificationCount;
    }

    public void setModificationCount(Integer modificationCount) {
        this.modificationCount = modificationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffId, staff.staffId) && Objects.equals(firstName, staff.firstName) && Objects.equals(lastName, staff.lastName) && Objects.equals(identityNo, staff.identityNo) && Objects.equals(age, staff.age) && Objects.equals(dateRequested, staff.dateRequested) && Objects.equals(dateLastModified, staff.dateLastModified) && Objects.equals(modificationCount, staff.modificationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, firstName, lastName, identityNo, age, dateRequested, dateLastModified, modificationCount);
    }
}
