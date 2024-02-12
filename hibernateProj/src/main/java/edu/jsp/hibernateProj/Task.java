package edu.jsp.hibernateProj;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskidgen")
	@SequenceGenerator(name = "taskidgen", allocationSize = 1, initialValue = 100, sequenceName = "taskidseq")
	@Column(nullable = false, unique = true)
	private int task_id;
	@Column(nullable = false)
	private String name;
	@CreationTimestamp
	private LocalDate startdate;
	

	@Column(nullable = false)
	private LocalDate deadline;

	@ManyToMany(mappedBy = "tasks",fetch = FetchType.LAZY)
	List<Employee> employees;

	public int getTask_id() {
		return task_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Task() {
		super();
	}

}


