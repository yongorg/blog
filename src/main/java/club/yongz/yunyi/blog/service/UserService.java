package club.yongz.yunyi.blog.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import club.yongz.yunyi.blog.entity.User;

/**
 * 用户服务接口
 * @author OJ's big hole
 *
 */
public interface UserService {
	/**
	 * 保存用户
	 *  user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 删除用户
	 *  user
	 * @return
	 */
	void removeUser(Long id);
	
	/**
	 * 根据id获取用户
	 *  user
	 * @return
	 */
	User getUserById(Long id);
	
	/**
	 * 根据用户名进行分页模糊查询
	 *  user
	 * @return
	 */
	Page<User> listUsersByNameLike(String name, Pageable pageable);

	/**
	 * 根据用户名进行查询
	 *  user
	 * @return
	 */
	List<User> listUsersByUsernames(Collection<String> usernames);
	
	/**
	 * 根据用户名查找用户
	 *  username
	 * @return
	 */
	User findByUsername(String username);
	
	User findByEmail(String email);
}
