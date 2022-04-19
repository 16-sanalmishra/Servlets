package com.test.Listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class servletListeners implements ServletRequestListener, ServletRequestAttributeListener {
    
	public servletListeners() {
    }
   
	public void requestDestroyed(ServletRequestEvent sre)  { 
		System.out.println("inside destroyed");
    }
   
	public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
		System.out.println("inside removed");
    }

   
	public void requestInitialized(ServletRequestEvent sre)  { 
		System.out.println("Inside Intializatin Method" + sre.getSource());
    }

    
	public void attributeAdded(ServletRequestAttributeEvent srae)  { 
		System.out.println("Inside Attribute Added" + srae.getValue() + " " + srae.getSource());
    }

	public void attributeRyeplaced(ServletRequestAttributeEvent srae)  { 
		System.out.println("inside replaced");
    }
	
}
