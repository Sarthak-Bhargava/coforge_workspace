package com.airport.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="schedule")
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scheduleId;
	
	@Column
	@NotEmpty
    private Airport srcAirport;
	
	@Column
	@NotEmpty
    private Airport dstnAirport;
	
	@Column
    private String deptDateTime;
	
	@Column
    private String arrDateTime;

	public long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Airport getSrcAirport() {
		return srcAirport;
	}

	public void setSrcAirport(Airport srcAirport) {
		this.srcAirport = srcAirport;
	}

	public Airport getDstnAirport() {
		return dstnAirport;
	}

	public void setDstnAirport(Airport dstnAirport) {
		this.dstnAirport = dstnAirport;
	}

	public String getDeptDateTime() {
		return deptDateTime;
	}

	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	public Schedule(long scheduleId, @NotEmpty Airport srcAirport, @NotEmpty Airport dstnAirport, String deptDateTime,
			String arrDateTime) {
		super();
		this.scheduleId = scheduleId;
		this.srcAirport = srcAirport;
		this.dstnAirport = dstnAirport;
		this.deptDateTime = deptDateTime;
		this.arrDateTime = arrDateTime;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", srcAirport=" + srcAirport + ", dstnAirport=" + dstnAirport
				+ ", deptDateTime=" + deptDateTime + ", arrDateTime=" + arrDateTime + ", getScheduleId()="
				+ getScheduleId() + ", getSrcAirport()=" + getSrcAirport() + ", getDstnAirport()=" + getDstnAirport()
				+ ", getDeptDateTime()=" + getDeptDateTime() + ", getArrDateTime()=" + getArrDateTime() + "]";
	}
	
	
}
