package controllers;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.typesafe.config.Config;

import play.cache.*;
import play.cache.NamedCache;
import play.cache.SyncCacheApi;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;
import services.ContentAPIService;
import models.ImageMap;
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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final Config config;
    @NamedCache("session-cache")
    private final SyncCacheApi cache;
    private final WSClient wsClient;
    private final ContentAPIService contentAPIService;

    @Inject
    public HomeController(Config config, SyncCacheApi cache, WSClient wsClient,ContentAPIService contentAPIService) {
        this.config = config;
        this.cache = cache;
        this.wsClient = wsClient;
        this.contentAPIService=contentAPIService;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    /**
     * This is where the test will be coded
     * @return Result
     */
    public Result test() {

    	int id = 0;
    	String url = "";

    	//generating a random id to add it to the url
    	if ( cache.get("imgUrl") == null ){
    		id=this.contentAPIService.getRandomId();
    	//the complete url
    	this.cache.set("imgUrl",id,this.config.getInt("randomImg.cache"));
    	} else{
    	id = (cache.get("imgUrl"));
    	}
    	url = config.getString("imgUrl") + id+"/200/300" ;
    	return ok(views.html.image.render(url));
    }
   

    public Result testMultiple() throws IOException{
    	
    	// get the images path from config file
    	String sURL = config.getString("multipleImg.url") ; 
    	List<ImageMap> imagesToShow = new ArrayList<ImageMap>();
        try { 	
        	imagesToShow.addAll(this.contentAPIService.mapUrls(sURL));
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        return ok(views.html.images.render(imagesToShow));
        
     }
        
        
        
        

    

}