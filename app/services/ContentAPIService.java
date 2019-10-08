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

import javax.inject.Singleton;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.ImageMap;

@Singleton
public class ContentAPIService {
    
	public int getRandomId() {
		// id = (int)(Math.random() * 900 + 100);
		
    	Random random = new Random();
    	int id=(int) random.nextInt(1085) ;
    	return id;
	}
	
	public List<ImageMap> mapUrls(String sURL) throws IOException {
        
        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        
        
        InputStream in =((InputStream) request.getContent());
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder result = new StringBuilder();
        String line;
        while((line = reader.readLine()) != null) {
        result.append(line);
        }
        
        ObjectMapper mapper = new ObjectMapper();
        
        
        // 1. convert JSON array to Array objects
        ImageMap[] url1 = mapper.readValue(result.toString(), ImageMap[].class);
        
        // 2. convert JSON array to List of objects
        List<ImageMap> ppl2 = Arrays.asList(mapper.readValue(result.toString(), ImageMap[].class));
        List<ImageMap> imagesToShow = new ArrayList<ImageMap>();
        //return images with id multiple of 2
        for (ImageMap imageMap : ppl2) {
			if(Integer.parseInt(imageMap.getId())%2==0) {
				imagesToShow.add(imageMap);
			}
		}
        
        return imagesToShow;
        
        }
}
