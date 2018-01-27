package by.htp.library.action.impl;

import java.io.PrintWriter;
import java.util.List;

import by.htp.library.action.BaseAction;
import by.htp.library.bean.Book;
import by.htp.library.dao.BookDao;
import by.htp.library.dao.file.BookDaoFileImpl;

public class ViewBookListActionImpl implements BaseAction{

	private BookDao dao = new BookDaoFileImpl();
	
	public void doSmth(PrintWriter out) {
		
		List<Book> books = dao.readAll();
		
		for(Book book: books){
			out.println(book);
		}	
	}

}
