/**
 * 
 */
package ${package}.persistence.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ${package}.model.User;
import ${package}.persistence.UserDao;

/**
 * @author Bill
 *
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	/**
	 * 
	 */
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		setHibernateTemplate(new HibernateTemplate(sessionFactory));
	}
	
	@Transactional
	public Long save(User newInstance) {
		// TODO Auto-generated method stub
		return (Long) getHibernateTemplate().save(newInstance);
	}
	
	public User find(Long primaryKey) {
		// TODO Auto-generated method stub
		return (User) getHibernateTemplate().get(User.class, primaryKey);
	}

}