package com.skyeye.common.service;

import com.skyeye.common.object.InputObject;
import com.skyeye.common.object.OutputObject;

public interface CommonService {

	public void uploadFile(InputObject inputObject, OutputObject outputObject) throws Exception;

	public void uploadFileBase64(InputObject inputObject, OutputObject outputObject) throws Exception;

}