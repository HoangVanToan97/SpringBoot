package vn.hust.springbootcore.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import vn.hust.springbootcore.model.User;
@Repository
public class UserRepository {
	@PersistenceContext
	private EntityManager entityManager;

	public ArrayList<User> getAll() {
		try {
			@SuppressWarnings("unchecked")
			ArrayList<User> list = (ArrayList<User>) entityManager.createQuery("From User").getResultList();
			return list;
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ArrayList<User>();
	}

	public boolean checkLogin(User user) {
		String hql = "from User where username = ?1 and password = ?2";
		try {
			User check = (User) entityManager.createQuery(hql).setParameter(1, user.getUsername())
					.setParameter(2, user.getPassword()).getSingleResult();
			if(check.getUsername() != null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return false;
	}
	

}
