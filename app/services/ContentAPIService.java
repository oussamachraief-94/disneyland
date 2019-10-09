package services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletionStage;
import java.util.logging.Logger;
import play.mvc.Result;
import javax.inject.Singleton;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.ImageMap;
import play.libs.ws.WSClient;

@Singleton
public class ContentAPIService {
	private Logger logger = Logger.getLogger("play");

	public int getRandomId() {
		logger.info("getting random id for the image ");
		Random random = new Random();
		int id = (int) random.nextInt(1085);
		logger.info("returned id : " + id);
		return id;
	}

	public List<ImageMap> mapUrls(JsonNode sURL) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		// 1. convert JSON array to Array objects
		logger.info("converting JSON array to Array objects");
		ImageMap[] url1 = mapper.readValue(sURL.toString(), ImageMap[].class);
		logger.info("convert JSON array to List of objects");
		// 2. convert JSON array to List of objects
		List<ImageMap> ppl2 = Arrays.asList(mapper.readValue(sURL.toString(), ImageMap[].class));
		List<ImageMap> imagesToShow = new ArrayList<ImageMap>();
		logger.info("returning images with id multiple of 2");
		// return images with id multiple of 2
		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements that are divisible by 5
		ppl2.stream().filter(imageMap -> Integer.parseInt(imageMap.getId()) % 2 == 0)
				.forEach(imageMap -> imagesToShow.add(imageMap));
		logger.info("Number of returned images : " + imagesToShow.size());
		return imagesToShow;

	}

}
