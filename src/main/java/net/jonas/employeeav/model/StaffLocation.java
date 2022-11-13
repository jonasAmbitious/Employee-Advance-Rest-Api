package net.jonas.employeeav.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "STAFF_LOCATION", schema = "PUBLIC", catalog = "EMPLOYEEAVDB")
public class StaffLocation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "LOCATION_KEY")
    private Integer locationKey;
    @Basic
    @Column(name = "STAFF_ID")
    private Integer staffId;
    @Basic
    @Column(name = "CITY")
    private String city;
    @Basic
    @Column(name = "PROVINCE")
    private String province;
    @Basic
    @Column(name = "COUNTRY")
    private String country;
    @Basic
    @Column(name = "DATE_REQUESTED")
    private LocalDateTime dateRequested;
    @Basic
    @Column(name = "DATE_LAST_MODIFIED")
    private LocalDateTime dateLastModified;
    @Basic
    @Column(name = "MODIFICATION_COUNT")
    private Integer modificationCount;

    public Integer getLocationKey() {
        return locationKey;
    }

    public void setLocationKey(Integer locationKey) {
        this.locationKey = locationKey;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        StaffLocation that = (StaffLocation) o;
        return Objects.equals(locationKey, that.locationKey) && Objects.equals(staffId, that.staffId) && Objects.equals(city, that.city) && Objects.equals(province, that.province) && Objects.equals(country, that.country) && Objects.equals(dateRequested, that.dateRequested) && Objects.equals(dateLastModified, that.dateLastModified) && Objects.equals(modificationCount, that.modificationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationKey, staffId, city, province, country, dateRequested, dateLastModified, modificationCount);
    }
}
