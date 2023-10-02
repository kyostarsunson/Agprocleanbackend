package ca.sait.agpro.utility;

import java.util.Map;

public class MyResult {
	private String code;
	private String message;
	private Object data;
	private Map<String, Long> pageData;
	private static final String SUCCESS_CODE = "1";
	private static final String FAIL_CODE = "-1";

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Map<String, Long> getPageData() {
		return pageData;
	}

	public void setPageData(Map<String, Long> pageData) {
		this.pageData = pageData;
	}

	public static MyResult ok(String message) {
		MyResult myResut = new MyResult();
		myResut.setMessage(message);
		myResut.setCode(SUCCESS_CODE);
		return myResut;
	}

	public static MyResult ok(String message, Object data) {
		MyResult myResut = new MyResult();
		myResut.setMessage(message);
		myResut.setCode(SUCCESS_CODE);
		myResut.setData(data);
		return myResut;
	}

	public static MyResult ok(String message, Object data, Map<String, Long> pageDate) {
		MyResult myResut = new MyResult();
		myResut.setMessage(message);
		myResut.setCode(SUCCESS_CODE);
		myResut.setData(data);
		myResut.setPageData(pageDate);
		return myResut;
	}

	public static MyResult fail(String message) {
		MyResult myResut = new MyResult();
		myResut.setCode(FAIL_CODE);
		myResut.setMessage(message);
		return myResut;
	}

}
