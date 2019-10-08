package models;

import com.typesafe.config.Config;

public class Configuration {
	
	private Config config;
	private String randomImgUrl;
	private Integer randomImgCache;
	private String multipleImgUrl;
	private String imgUrl;
	
	

	public Configuration() {
		this.config = config;
		this.randomImgUrl = config.getString("randomImg.url");
		this.randomImgCache = config.getInt("randomImg.cache");
		this.multipleImgUrl = config.getString("https://picsum.photos/v2/list");
		this.imgUrl = config.getString("https://picsum.photos/id/");
	}



	public String getRandomImgUrl() {
		return randomImgUrl;
	}



	public void setRandomImgUrl(String randomImgUrl) {
		this.randomImgUrl = randomImgUrl;
	}



	public Integer getRandomImgCache() {
		return randomImgCache;
	}



	public void setRandomImgCache(Integer randomImgCache) {
		this.randomImgCache = randomImgCache;
	}



	public String getMultipleImgUrl() {
		return multipleImgUrl;
	}



	public void setMultipleImgUrl(String multipleImgUrl) {
		this.multipleImgUrl = multipleImgUrl;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}



	public Config getConfig() {
		return config;
	}

	
	
	
	
}
