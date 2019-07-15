package club.yongz.yunyi.blog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import club.yongz.yunyi.blog.entity.Catalog;
import club.yongz.yunyi.blog.entity.User;

/**
 * Catalog 仓库.
 *
 * @since 1.0.0 2017年4月10日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
	/**
	 * 根据用户查询
	 * user
	 * @return
	 */
	List<Catalog> findByUser(User user);
	
	/**
	 * 根据用户查询
	 * user
	 * name
	 * @return
	 */
	List<Catalog> findByUserAndName(User user,String name);

	@Modifying
	@Query(value="DELETE from blog where catalog_id=?",nativeQuery=true)
	void deleteBlogsByCatalogId(Long id);


}
