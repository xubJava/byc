package com.byc.common;

public class AjaxDone {

	private String statusCode;
	private String message;
	private String navTabId;
	private String rel;
	private String callbackType;//这是啥 这是回调函数的类型  是的   应该是返回的类型   用异步提交时返回的，具体我也不知道，我都是赋值为空
	private String forwardUrl;
	private Object model;
	


	public AjaxDone() {
		
	}
	
	public AjaxDone(String statusCode, String message, Object model) {
		this.statusCode = statusCode;
		this.message = message;
		this.model = model;
	}

	public AjaxDone(String statusCode, String message, String navTabId,
			String rel, String callbackType, String forwardUrl,Object model){
		this.statusCode = statusCode;
		this.message = message;
		this.navTabId = navTabId;
		this.rel = rel;
		this.callbackType = callbackType;
		this.forwardUrl = forwardUrl;
		this.model = model;
	}
	
	public AjaxDone(String statusCode, String message, String navTabId,
			String rel, String callbackType, String forwardUrl) {
		this.statusCode = statusCode;
		this.message = message;
		this.navTabId = navTabId;
		this.rel = rel;
		this.callbackType = callbackType;
		this.forwardUrl = forwardUrl;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNavTabId() {
		return navTabId;
	}
	public void setNavTabId(String navTabId) {
		this.navTabId = navTabId;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getCallbackType() {
		return callbackType;
	}
	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
	}
	public String getForwardUrl() {
		return forwardUrl;
	}
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}
	public Object getModel() {
		return model;
	}

	public void setModel(Object model) {
		this.model = model;
	}
}
