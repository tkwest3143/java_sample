/**
 * Copyright 2019 Takanori Nishi
 */
package com.lmproject.application.database.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lmproject.application.database.entity.User;

/**
 * クラス名：UsersDao.java<br>
 * <p>
 * 作成日：2020/11/29<br>
 * 最終更新日：2020/11/29<br>
 * @author nishi
 * </p>
 *
 */
public class UsersDao extends CommonDao {

	/**
	 * コンストラクタ
	 */
	public UsersDao() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
	 * ユーザ名をもとにUser情報を取得します。
	 * @param username ユーザ名
	 * @return User情報
	 */
	public List<User> select(String username) {
		String query = "select u from User u "
				+ "where u.userName=:userName";

		Query q = getEntityManager().createQuery(query)
				.setParameter("userName", username);

		if (q.getResultList().size() > 0) {
			@SuppressWarnings("unchecked")
			List<User> ret = q.getResultList();
			return ret;
		} else {
			return null;
		}
	}

	/**
	 * ユーザ名をもとにUser情報を取得します。
	 * @param username ユーザ名
	 * @return User情報
	 */
	public List<User> getUserLIst() {

		TypedQuery<User> query = getEntityManager().createNamedQuery("User.findAll",User.class);

		if (query.getResultList().size() > 0) {
			List<User> ret = query.getResultList();
			return ret;
		} else {
			return null;
		}
	}

}
