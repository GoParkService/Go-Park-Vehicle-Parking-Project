package com.demo.beans;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tenant_parking_user_booking")
public class TenantParkingUserBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tenant_booking_id")
    private int tenantBookingId;

    @Column(name = "tenant_user_id")
    private Integer tenantUserId;

    @Column(name = "tenant_parking_slot_id")
    private Integer tenantParkingSlotId;

    @Column(name = "tenant_booking_start_date_time")
    private Timestamp tenantBookingStartDateTime;

    @Column(name = "tenant_booking_end_date_time")
    private Timestamp tenantBookingEndDateTime;

    @Column(name = "tenant_booking_vehicle_type")
    private String tenantBookingVehicleType;

    @Column(name = "tenant_booking_vehicle_plate_no")
    private String tenantBookingVehiclePlateNo;

    // Getters and Setters
    public int getTenantBookingId() {
        return tenantBookingId;
    }

    public void setTenantBookingId(int tenantBookingId) {
        this.tenantBookingId = tenantBookingId;
    }

    public Integer getTenantUserId() {
        return tenantUserId;
    }

    public void setTenantUserId(Integer tenantUserId) {
        this.tenantUserId = tenantUserId;
    }

    public Integer getTenantParkingSlotId() {
        return tenantParkingSlotId;
    }

    public void setTenantParkingSlotId(Integer tenantParkingSlotId) {
        this.tenantParkingSlotId = tenantParkingSlotId;
    }

    public Timestamp getTenantBookingStartDateTime() {
        return tenantBookingStartDateTime;
    }

    public void setTenantBookingStartDateTime(Timestamp tenantBookingStartDateTime) {
        this.tenantBookingStartDateTime = tenantBookingStartDateTime;
    }

    public Timestamp getTenantBookingEndDateTime() {
        return tenantBookingEndDateTime;
    }

    public void setTenantBookingEndDateTime(Timestamp tenantBookingEndDateTime) {
        this.tenantBookingEndDateTime = tenantBookingEndDateTime;
    }

    public String getTenantBookingVehicleType() {
        return tenantBookingVehicleType;
    }

    public void setTenantBookingVehicleType(String tenantBookingVehicleType) {
        this.tenantBookingVehicleType = tenantBookingVehicleType;
    }

    public String getTenantBookingVehiclePlateNo() {
        return tenantBookingVehiclePlateNo;
    }

    public void setTenantBookingVehiclePlateNo(String tenantBookingVehiclePlateNo) {
        this.tenantBookingVehiclePlateNo = tenantBookingVehiclePlateNo;
    }

	public TenantParkingUserBooking() {
		super();
	}

	public TenantParkingUserBooking(int tenantBookingId, Integer tenantUserId, Integer tenantParkingSlotId,
			Timestamp tenantBookingStartDateTime, Timestamp tenantBookingEndDateTime, String tenantBookingVehicleType,
			String tenantBookingVehiclePlateNo) {
		super();
		this.tenantBookingId = tenantBookingId;
		this.tenantUserId = tenantUserId;
		this.tenantParkingSlotId = tenantParkingSlotId;
		this.tenantBookingStartDateTime = tenantBookingStartDateTime;
		this.tenantBookingEndDateTime = tenantBookingEndDateTime;
		this.tenantBookingVehicleType = tenantBookingVehicleType;
		this.tenantBookingVehiclePlateNo = tenantBookingVehiclePlateNo;
	}

	@Override
	public String toString() {
		return "TenantParkingUserBooking [tenantBookingId=" + tenantBookingId + ", tenantUserId=" + tenantUserId
				+ ", tenantParkingSlotId=" + tenantParkingSlotId + ", tenantBookingStartDateTime="
				+ tenantBookingStartDateTime + ", tenantBookingEndDateTime=" + tenantBookingEndDateTime
				+ ", tenantBookingVehicleType=" + tenantBookingVehicleType + ", tenantBookingVehiclePlateNo="
				+ tenantBookingVehiclePlateNo + "]";
	}
    
    
}
