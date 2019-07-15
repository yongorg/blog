package club.yongz.yunyi.blog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ImageUrl {

	@Id//主键
	@GeneratedValue(strategy=GenerationType.IDENTITY) //自增策略
	private Long id; // 图片的唯一标识
	
	@Column(length = 200)
	private String imgUrl; // 图片地址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}
