package example;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String,Website> websites = new HashMap<>();

    public Website getWebsiteCategory(String key){
        if(!websites.containsKey("key")){
            websites.put(key,new ConcreteWebsite(key));
        }
        return websites.get(key);
    }

    public int getWebsiteCount(){
        return websites.size();
    }
}
