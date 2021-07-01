import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class genie {

	public static void main(String[] args) throws IOException {
		String url="https://www.genie.co.kr/chart/top200";
		        //크롤링하고싶은 대상 url 을 적는다 
		Document doc=Jsoup.connect(url).get();
		Elements songName = doc.select("[class=title ellipsis]");
		Elements artist = doc.select("[class=artist ellipsis]");
		Elements calender = doc.select("[class=multi_row]").select("[class=hhmm]").select("span");
		
		ArrayList<String> list = new ArrayList<String>();
		for(Element e: songName) {
			String songs= e.text();
			list.addAll(Arrays.asList(songs));
			System.out.println("제목 : "+ songs);
		}
		System.out.println("============");
		for(Element e: artist) {
			String artists= e.text();
			list.addAll(Arrays.asList(artists));
			System.out.println("가수 : "+ artists);
		}
		for(String lists: list) {
			System.out.println(lists);
		}
		
		
		
	}

}