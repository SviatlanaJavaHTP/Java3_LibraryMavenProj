package by.htp.library.action.util;

import by.htp.library.action.BaseAction;
import by.htp.library.action.impl.ViewBookListActionImpl;

public class ActionManager {

	public static BaseAction defineAction(String action) {

		BaseAction act = null;
		
		switch (action) {
		case "view_books":
			act = new ViewBookListActionImpl();
			break;
		}
		
		return act;
		
	//	http://localhost:8081/java-library/SimpleServlet?action=view_books
	}

}
