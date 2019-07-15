package club.yongz.yunyi.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import club.yongz.yunyi.blog.entity.Authority;

/**
 * 权限仓库
 * @author OJ's big hole
 *
 */
public interface AuthorityRepository extends JpaRepository<Authority,Long>{

}
