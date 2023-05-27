package com.example.domain.user.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="t_salary")
public class Salary {
	
    //private String userId;
    //private String yearMonth;

	/**
	 * @Embdded 主キーのフィールドを主キークラスに置き換える場合、@Idではなく、@EmbeddedId
	 */
	
	@EmbeddedId
	private SalaryKey salaryKey;
    private Integer salary;
}
