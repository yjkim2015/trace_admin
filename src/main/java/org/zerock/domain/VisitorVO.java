package org.zerock.domain;

import java.util.Date;

public class VisitorVO {
	private Integer visit_id;
	private String visit_ip;
	private Date visit_time;
	private String visit_agent;
	public Integer getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(Integer visit_id) {
		this.visit_id = visit_id;
	}
	public String getVisit_ip() {
		return visit_ip;
	}
	public void setVisit_ip(String visit_ip) {
		this.visit_ip = visit_ip;
	}
	public Date getVisit_time() {
		return visit_time;
	}
	public void setVisit_time(Date visit_time) {
		this.visit_time = visit_time;
	}
	public String getVisit_agent() {
		return visit_agent;
	}
	public void setVisit_agent(String visit_agent) {
		this.visit_agent = visit_agent;
	}
	
	
}
