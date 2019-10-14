package com.varo.formatters;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.varo.spring.model.Owner;
import com.varo.spring.service.OwnerService;

public class OwnerEditor extends PropertyEditorSupport {

	@Autowired
	private OwnerService ownerService;

	// This will be called when user HTTP Post to server a field bound to
	// DepartmentVO
	@Override
	public void setAsText(String id) {
		Owner d = ownerService.get(Integer.parseInt(id)).get();

		this.setValue(d);
	}

}
