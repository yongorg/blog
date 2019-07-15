package club.yongz.yunyi.blog.service;

import club.yongz.yunyi.blog.dao.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.yongz.yunyi.blog.entity.Authority;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}
}
