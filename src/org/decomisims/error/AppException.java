package org.decomisims.error;

import org.decomisims.app.AppInt;

/**
 *
 * @author jimmy
 */
public class AppException extends Exception {

	public AppException(String msgKey, boolean i18n, Object... params) {
		this(AppInt.str(msgKey, params));
	}

	public AppException(String msgKey, boolean i18n) {
		this(AppInt.str(msgKey));
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(Throwable cause) {
		super(cause);
	}

	public AppException(String msgKey, Throwable cause, boolean i18n) {
		this(AppInt.str(msgKey), cause);
	}

	public AppException(String message, Throwable cause) {
		super(message, cause);
	}
}
