/**
 *
 */
package com.lmproject.application.form;

import java.io.Serializable;

import lombok.Data;

/**
 * @author nishi
 *
 */
@Data
public class LoginForm implements Serializable {

	private String loginname = null;
	private String password = null;

	/**
	 * loginnameを取得します。
	 * @return loginname
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * loginnameを設定する。
	 * @param loginname loginname
	 */
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	/**
	 * passwordを取得します。
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * passwordを設定する。
	 * @param password password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
