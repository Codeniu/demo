package actions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChainList extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/json");
		String nameValue = req.getParameter("keyword").toLowerCase();
		String type = req.getParameter("type").toLowerCase();
		System.out.println(nameValue);
		System.out.println(type);
		PrintWriter out=resp.getWriter();
		if(type.equals("carname")){
			String[] data;
			if(nameValue.equals("bmw")){
				data = new String[2];
				data[0] = "6ercupe";
				data[1] = "316ti";
			}else if(nameValue.equals("vw")){
				data = new String[1];
				data[0] = "Golf4";
			}else{
				data = new String[1];
				data[0] = "tt";
			}
			
			StringBuffer value=new StringBuffer();
			if(data.length==1)
				value.append("[\"").append(data[0]).append("\"]");
			else{
				value.append("[\"").append(data[0]).append("\"");
				for(int i=1;i<data.length;i++)
				    value.append(",\"").append(data[i]).append("\"");
				value.append("]");
			}
			
			//System.out.println(value.toString());
			out.write(value.toString());
			out.flush();
		}
		
	} 
}
