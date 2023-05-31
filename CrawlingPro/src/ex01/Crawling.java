package ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {

	public static void main(String[] args) {

		String url = "https://sports.news.naver.com/kbaseball/index";
		Document doc = null;
		
		try {
			// url(네이버 스포츠야구면) 사이트 접속해서 html문서 파일을 끌어옴
			doc = Jsoup.connect(url).get(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".home_news");
//		System.out.println(elements);
		
		String title = elements.select("h2").text();
		System.out.println("-----------------------------------------");
		System.out.printf("%20s\n", title);
		System.out.println("-----------------------------------------");
		
		for(Element el : elements.select("li")) {
			System.out.println(el.text());
		}
		
		
	}

}
