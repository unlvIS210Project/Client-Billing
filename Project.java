package edu.unlv.is210.project;

public class Project {
	//fields
	final double HR_PRICE = 0.25;
	String clientName;
	String projectName;
	String projectSummary;
	double projectTime;
	boolean newProject;
	
	//getters/setters
	public String getProjectSummary() {
		return projectSummary;
	}
	public void setProjectSummary(String projectSummary) {
		this.projectSummary = projectSummary;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getProjectTime() {
		return projectTime;
	}
	public void setProjectTime(double projectTime) {
		this.projectTime = projectTime;
	}
	public boolean isNewProject() {
		return newProject;
	}
	public void setNewProject(boolean newProject) {
		this.newProject = newProject;
	}
	public double getHR_PRICE() {
		return HR_PRICE;
	}

}
