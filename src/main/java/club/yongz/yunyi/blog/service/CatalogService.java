package club.yongz.yunyi.blog.service;

import java.util.List;

import club.yongz.yunyi.blog.entity.Catalog;
import club.yongz.yunyi.blog.entity.User;



/**
 * Catalog 服务接口.
 * 
 * @since 1.0.0 2017年4月10日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface CatalogService {
	/**
	 * 保存Catalog
	 *  catalog
	 * @return
	 */
	Catalog saveCatalog(Catalog catalog);
	
	/**
	 * 删除Catalog
	 * id
	 * @return
	 */
	void removeCatalog(Long id);

	/**
	 * 根据id获取Catalog
	 * id
	 * @return
	 */
	Catalog getCatalogById(Long id);
	
	/**
	 * 获取Catalog列表
	 * @return
	 */
	List<Catalog> listCatalogs(User user);

	Catalog insertAnonymousCatalog(Catalog catalog);
}
