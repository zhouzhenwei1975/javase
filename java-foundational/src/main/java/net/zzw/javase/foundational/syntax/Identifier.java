package net.zzw.javase.foundational.syntax;

/**
 * 标识符的命名规范和命名规则
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午9:08
 * @since JDK11
 */
public class Identifier {
}

/**
 * 类的命名规范
 */
class UserInfo {

	/**
	 * 常量的命名规范
	 */
	public static final String DEFAULT_PASSWORD = "111111";
	/**
	 * 变量名的命名规范
	 */
	private Long id;
	/**
	 * 变量名的命名规范
 	 */
	private String userName;

	/**
	 * 方法的命名规范
	 * @return
	 */
	public Long getId() {
		return id;
	}

	/**
	 * 方法的命名规范
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 方法的命名规范
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 方法的命名规范
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
