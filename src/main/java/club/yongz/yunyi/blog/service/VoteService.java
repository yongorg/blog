package club.yongz.yunyi.blog.service;

import club.yongz.yunyi.blog.entity.Vote;



/**
 * Vote 服务接口.
 * 
 * @since 1.0.0 2017年4月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 *  id
	 * @return
	 */
	Vote getVoteById(Long id);
	/**
	 * 删除Vote
	 *  id
	 * @return
	 */
	void removeVote(Long id);
}
