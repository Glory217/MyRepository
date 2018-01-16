/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.customtags;

/**
 *
 * @author punjabi
 */
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HeadingTag extends SimpleTagSupport{
    
    private String value;

    public void setValue(String value) {
        this.value = value;
    }
    
    
public void doTag() throws JspException, IOException{
    String v = value.toUpperCase();
	JspWriter out = getJspContext().getOut();
	out.println(v);

}
}
