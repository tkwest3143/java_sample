package com.lmproject.application.database.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;





/**
 * Daoの抽象クラス
 *
 */
public abstract class CommonDao {
	private EntityManagerFactory emf= Persistence.createEntityManagerFactory("web01");
	private EntityManager em=emf.createEntityManager();
	public final EntityTransaction et=em.getTransaction();



	/**
	 * コンストラクタ
	 */
	public CommonDao(){
	}
	/**
	 * コンストラクタ
	 * @param emf
	 */
	public CommonDao(EntityManagerFactory emf) {
		this();
		this.emf=emf;
	}

	/**
	 * 使用するエンティティマネージャーファクトリーを取得します。
	 * @return EntityManagerFactory エンティティマネージャーファクトリー
	 */
	public EntityManagerFactory getEntityManagerFactory() {
		return this.emf;
	}

	/**
	 * 使用するエンティティマネージャーファクトリーを設定します。
	 * @param emf エンティティマネージャーファクトリー
	 */
	public void setEntityManagerFactory(EntityManagerFactory emf) {
		this.emf=emf;
	}

	/**
	 * エンティティマネージャーを取得します。
	 * @return エンティティマネージャー
	 */
	public EntityManager getEntityManager() {
		return this.em;
	}


	/**
	 * コミットします。
	 */
	public void commit() {
		this.et.commit();
	}

	/**
	 * トランザクションを開始します。
	 */
	public void begin() {
		this.et.begin();
	}
	/**
	 * クローズします。
	 */
	public void close() {
		this.em.close();
	}
}
