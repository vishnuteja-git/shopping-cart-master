package org.ejb.sample.model;

import org.ejb.session.model.core.BaseDaoImp;

import javax.ejb.Stateless;

/**
 * This is the UserDao implementation.
 * <p>
 * 
 *
 */
@Stateless
public class UserDaoImpl extends BaseDaoImp<User> implements UserDao {

	/**
	 * This method hooks the correct entity type, simplifying parent BaseDaoImp
	 * type discovery.
	 */
	@Override
	public Class<User> getType() {
		return User.class;
	}

}
