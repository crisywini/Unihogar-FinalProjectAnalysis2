package co.edu.uniquindio.unihogar.dto;

import java.io.Serializable;

import co.edu.uniquindio.unihogar.entities.EstateAgency;

public class QueryEstateAgencyCountProjectsDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EstateAgency estateAgency;
	private Long countProjects;

	public QueryEstateAgencyCountProjectsDTO(EstateAgency estateAgency, Long countProjects) {
		this.estateAgency = estateAgency;
		this.countProjects = countProjects;
	}

	public EstateAgency getEstateAgency() {
		return estateAgency;
	}

	public void setEstateAgency(EstateAgency estateAgency) {
		this.estateAgency = estateAgency;
	}

	public Long getCountProjects() {
		return countProjects;
	}

	public void setCountProjects(Long countProjects) {
		this.countProjects = countProjects;
	}

	@Override
	public String toString() {
		return "QueryEstateAgencyCountProjectsDTO [estateAgency=" + estateAgency.getCode() + ", countProjects="
				+ countProjects + "]";
	}
}