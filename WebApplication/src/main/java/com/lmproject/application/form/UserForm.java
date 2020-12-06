/**
 * Copyright 2019 Takanori Nishi
 */
package com.lmproject.application.form;

import lombok.Data;

/**
 * クラス名：UserForm.java<br>
 * <p>
 * 作成日：2020/12/06<br>
 * 最終更新日：2020/12/06<br>
 * @author nishi
 * </p>
 *
 */
@Data
public class UserForm {

	private String userId;

	private String username;

	private String password;

	private String mailAddress;

	/**
	 * userIdを取得します。
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * userIdを設定する。
	 * @param userId userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * usernameを取得します。
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * usernameを設定する。
	 * @param username username
	 */
	public void setUsername(String username) {
		this.username = username;
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

	/**
	 * mailAddressを取得します。
	 * @return mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * mailAddressを設定する。
	 * @param mailAddress mailAddress
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

}
