package org.tinos.node.medcine.filterChuFangXingWeiKeyWordsAttribute;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class filterChuFangXingWeiKeyWordsAttributeHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public filterChuFangXingWeiKeyWordsAttributeHRun( ) throws IOException{	
		super();
	}
	
	public void run(final filterChuFangXingWeiKeyWordsAttributeHView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
