package club.yongz.yunyi.blog.service;

import club.yongz.yunyi.blog.entity.Comment;

/**
 * Comment 服务接口.
 * 
 * @since 1.0.0 2017年4月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface CommentService {
	/**
	 * 根据id获取 Comment
	 *  id
	 * @return
	 */
	Comment getCommentById(Long id);
	/**
	 * 删除评论
	 *  id
	 * @return
	 */
	void removeComment(Long id);
}
