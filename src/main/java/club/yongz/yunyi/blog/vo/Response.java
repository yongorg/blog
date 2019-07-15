package club.yongz.yunyi.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回对象
 * @author OJ's big hole
 *
 */

public class Response {
	private boolean success;//处理是否成功
	private String message;//处理后的消息提示
	private Object body;//返回的数据

	public Response(boolean success, String message, Object body) {
		this.success = success;
		this.message = message;
		this.body = body;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public Response(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
}
