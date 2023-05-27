package com.example.domain.user.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @Embeddable 主キーのカラムが２つ以上ある場合、JPAでは主キーのクラスを作成する必要がある
 */

@Embeddable
@Data
public class SalaryKey implements Serializable {

	private String userId;
	private String yearMonth;
}
