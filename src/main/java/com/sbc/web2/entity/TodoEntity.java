package com.sbc.web2.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import lombok.Data;

@Data
@Entity
public class TodoEntity {

	/** ID */
	@Id
	private String id;

	/** 内容 */
	private String memo;

	/** 完了フラグ */
	private boolean doneFlg;
}
