package club.yongz.yunyi.blog.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import club.yongz.yunyi.blog.entity.Blog;
import club.yongz.yunyi.blog.entity.Catalog;
import club.yongz.yunyi.blog.entity.User;

/**
 * Blog 服务接口.
 * 
 * @since 1.0.0 2017年4月7日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface BlogService {
	/**
	 * 保存Blog
	 * Blog
	 * @return
	 */
	Blog saveBlog(Blog blog);
	
	/**
	 * 删除Blog
	 * id
	 * @return
	 */
	void removeBlog(Long id);
	
	/**
	 * 更新Blog
	 * Blog
	 * @return
	 */
	Blog updateBlog(Blog blog);
	
	/**
	 * 根据id获取Blog
	 * id
	 * @return
	 */
	Blog getBlogById(Long id);
	
	/**
	 * 根据用户名进行分页模糊查询（最新）
	 * user
	 * @return
	 */
	Page<Blog> listBlogsByTitleLike(User user, String title, Pageable pageable);
 
	/**
	 * 根据用户名进行分页模糊查询（最热）
	 * user
	 * @return
	 */
	Page<Blog> listBlogsByTitleLikeAndSort(User suser, String title, Pageable pageable);
	
	/**
	 * 阅读量递增
	 * id
	 */
	void readingIncrease(Long id);
	
	/**
	 * 发表评论
	 * blogId
	 * commentContent
	 * @return
	 */
	Blog createComment(Long blogId, String commentContent);
	
	/**
	 * 删除评论
	 * blogId
	 * commentId
	 * @return
	 */
	void removeComment(Long blogId, Long commentId);
	
	/**
	 * 点赞
	 * blogId
	 * @return
	 */
	Blog createVote(Long blogId);

	/**
	 * 取消赞
	 * blogId
	 * id
	 */
	void removeVote(Long blogId, Long id);

	/**
	 * 根据分类分页博客
	 * catalog
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable);

	/**
	 * 用户最热查询
	 * user
	 * keyword
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogsByTitleVoteAndSort(User user, String keyword,
			Pageable pageable);
	
	/**
	 * 首页最热查询
	 * user
	 * keyword
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogsByTitleVoteAndSort(String keyword,Pageable pageable);
	
	/**
	 * 用户最新查询
	 * user
	 * keyword
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogsByTitleVote(User user, String keyword, Pageable pageable);
	
	/**
	 * 首页最新查询
	 * user
	 * keyword
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogsByTitleVote(String keyword, Pageable pageable);

	/**
	 * 分页查询所有博客
	 * pageable
	 * @return
	 */
	Page<Blog> listBlogs(Pageable pageable);

	/**
	 * 最新前五
	 * @return
	 */
	List<Blog> listTop5NewestBlogs();

	/**
	 * 最热前五
	 * @return
	 */
	List<Blog> listTop5HotestBlogs();
}
