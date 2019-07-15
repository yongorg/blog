package club.yongz.yunyi.blog.dao;

import java.util.Collection;
import java.util.List;

import club.yongz.yunyi.blog.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Long>{
	/**
	 * 根据用户姓名分页模糊查询
	 * name
	 * pageable
	 * @return
	 */
	Page<User> findByNameLike(String name , Pageable pageable);
	
	/**
	 * 根据用户姓名查询
	 * name
	 * pageable
	 * @return
	 */
	UserDetails findByUsername(String name);
	
	/**
	 * 根据用户姓名查询
	 * usernames
	 * @return
	 */
	List<User> findByUsernameIn(Collection<String> usernames);

	/**
	 * 根据邮箱查找用户
	 * email
	 * @return
	 */
	User findByEmail(String email);
}
