package eLibrary;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class BookDataProvider {
	
	public BookData scanBook(Book book) {
		BookData bookData = new BookData(book);
		
		
	// retrieve page source code
		try {
			String bookTitleTr = book.getTitle().replace(" ", "+");
			String url = "https://www.goodreads.com/search?utf8=%E2%9C%93&q=" + bookTitleTr + "&search_type=books&search%5Bfield%5D=title";
			Document doc = Jsoup.connect(url).get();
			System.out.println(doc.body().text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookData;
		
	}
}


//You can use CSS selectors in Jsoup to easily extract the column data.
//
//// retrieve page source code
//Document doc = Jsoup
//        .connect("http://services.runescape.com/m=hiscore_oldschool/hiscorepersonal.ws?user1=Lynx%A0Titan")
//        .get();
//
//// find all of the table rows
//Elements rows = doc.select("div#contentHiscores table tr");
//ListIterator<Element> itr = rows.listIterator();
//
//// loop over each row
//while (itr.hasNext()) {
//    Element row = itr.next();
//
//    // does the second col contain the word attack?
//    if (row.select("td:nth-child(2) a:contains(attack)").first() != null) {
//
//        // if so, assign each sibling col to variable
//        String rank = row.select("td:nth-child(3)").text();
//        String level = row.select("td:nth-child(4)").text();
//        String xp = row.select("td:nth-child(5)").text();
//
//        System.out.printf("rank=%s level=%s xp=%s", rank, level, xp);
//
//        // stop looping rows, found attack
//        break;
//    }
//}