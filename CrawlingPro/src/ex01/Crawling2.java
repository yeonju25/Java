package ex01;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling2 {

   public static void main(String[] args) throws Exception{
      
      int pages = 1;

      for(int i=0; i<pages; i++) {

      //네이버->경제 > 금융카테고리

      String url = "https://news.naver.com/main/list.naver?mode=LS2D&sid2=259&sid1=101&mid=shm&date=20220501&page="+i;

      Document doc = Jsoup.connect(url).get(); //사이트 정보 읽어 온다.

      Elements elements = doc.getElementsByAttributeValue("class", "list_body newsflash_body");

      //System.out.println(elements.size()); //기사 갯수

      //System.out.println(elements.get(0));

      Element element = elements.get(0);

      Elements photoelements = element.getElementsByAttributeValue("class", "photo");

      for(int j=0; j<photoelements.size(); j++) {

      Element newelements = photoelements.get(j);

      //System.out.println(newelements);

      Elements a_newelements = newelements.select("a");

      Element a_newelement = a_newelements.get(0);

      //System.out.println(a_newelement);

      String newUrl = a_newelement.attr("href"); //기사링크

      //System.out.println(newUrl);

      Elements imgelements = newelements.select("img");

      //System.out.println(imgelements.size() );

      Element imgelement = imgelements.get(0);

      //System.out.println(imgelement);

      String imgUrl = imgelement.attr("src"); //이미지 링크

      //System.out.println(imgUrl);

      String title = imgelement.attr("alt"); //기사 제목

      //System.out.println(title);

      Document detailDoc = Jsoup.connect(newUrl).get(); //기사 제목클릭 상세 기사로 이동주소

      //System.out.println(detailDoc);

      Element contentemement = detailDoc.getElementById("dic_area");

      //System.out.println(contentemement.text()); //br태크 있는 것은 text()로 기사 내용만 검색

      String content = contentemement.text();
      System.out.println(title);
      System.out.println(content);
      System.out.println();
      }
      }
   }
}