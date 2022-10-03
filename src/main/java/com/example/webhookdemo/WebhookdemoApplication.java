package com.example.webhookdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication

public class WebhookdemoApplication {



	public static void main(String[] args) {
//		public static Map<String, String> splitQuery(URL url) throws UnsupportedEncodingException {
//			Map<String, String> query_pairs = new LinkedHashMap<>();
//			String query = url.getQuery();
//			String[] pairs = query.split("&");
//			for (String pair : pairs) {
//				int idx = pair.indexOf("=");
//				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
//			}
//			return query_pairs;
//		}

		 SpringApplication.run(WebhookdemoApplication.class, args);
		System.out.println("webhook");

	}

}
