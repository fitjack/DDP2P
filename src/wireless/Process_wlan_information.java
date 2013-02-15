/* ------------------------------------------------------------------------- */
/*   Copyright (C) 2012 
		Author: Osamah Dhannoon
		Florida Tech, Human Decision Support Systems Laboratory
   
       This program is free software; you can redistribute it and/or modify
       it under the terms of the GNU Affero General Public License as published by
       the Free Software Foundation; either the current version of the License, or
       (at your option) any later version.
   
      This program is distributed in the hope that it will be useful,
      but WITHOUT ANY WARRANTY; without even the implied warranty of
      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
      GNU General Public License for more details.
  
      You should have received a copy of the GNU Affero General Public License
      along with this program; if not, write to the Free Software
      Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.              */
/* ------------------------------------------------------------------------- */
package wireless;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
@Deprecated
public class Process_wlan_information {
	
	
	 public int wlan_number=0;
	@Deprecated
	 public ArrayList<String> process() throws IOException{
		 
		ArrayList<String> w_info = new ArrayList<String>();
		ArrayList<String> w_info1 = new ArrayList<String>();
		String line;
	    String s="E:\\convert.exe";
	    Process p = Runtime.getRuntime().exec(s);
	    BufferedReader bri = new BufferedReader (new InputStreamReader(p.getInputStream()));
	    
	    while ((line = bri.readLine()) != null) {
	    		w_info.add(line);
	      		}
	    bri.close();
	    
	    int index1=0;
	    index1=w_info.get(0).indexOf(':');
	    index1++;
	    Character c=w_info.get(0).charAt(index1);
	    String s_char=c.toString();
	    int entries= Integer.parseInt(s_char);
	    wlan_number=entries;
	    //System.out.println("Number of entries: "+entries);
	    
	    int indx=0;
		int in=-1;
		char a[];
		String new_s;
		int new_indx=0;
		for(int i=1;i<w_info.size();i++){
		    indx=w_info.get(i).indexOf(':');
		    new_indx=w_info.get(i).length()-indx;
		    indx++;
		    a=new char[new_indx-1];
		    for(int j=indx;j<w_info.get(i).length();j++){
		    	in++;
		    	a[in]=w_info.get(i).charAt(j);		    		
		    	}
		    new_s =new String(a);
		    w_info.set(i,new_s);
		    indx=0;
		    in=-1;
		    new_s=null;
		    new_indx=0;
		}
		
		int i=0;
	    //Windows_IP p1=new Windows_IP();
	    while(i<entries){
	    	for(int j=1;j<w_info.size();j=j+5){
	    		w_info1.add(w_info.get(j).substring(1,w_info.get(j).length()));
	    		w_info1.add(w_info.get(j+1));
		    	w_info1.add(w_info.get(j+2));
		    	w_info1.add(w_info.get(j+3));
		    	w_info1.add(w_info.get(j+4));
		    	i=i+1;
	    	}
	    }
	
		return w_info1;
	}
	 
	 
	 public int get_wlan_num()	{ return wlan_number; }
	
	 /*
	public static void main(String args[]) throws IOException{
		
	ArrayList<String> test=new ArrayList<String>();
	process_wlan_info p1=new process_wlan_info();
	test=p1.process();
	System.out.println(test);
	}
	  */
}
