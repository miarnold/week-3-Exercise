package edu.matc.tagLibExerceise;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalTime;

public class HelloCustomTag extends SimpleTagSupport {

    String contextGreeting;

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        getTimeContext();
        out.println(contextGreeting);
    }

    public void getTimeContext() {

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if(hour >= 6 & hour <= 9) {
            contextGreeting = "Time to wake up!!";
        }

        if (hour >= 10) {
            contextGreeting = "Its mid-morning, there's nothing to do";
        }

        if (hour >= 11 & hour <= 13) {
            contextGreeting = "Time to get lunch";
        }

        if (hour >= 14 & hour <= 16) {
            contextGreeting = "Prepare for Java!";
        }

        if (hour >= 17 & hour <= 21) {
            contextGreeting = "Time to get to Enterprise Java";
        }
        if (hour >= 22 & hour <= 24) {
            contextGreeting = "GO TO BED!";
        }

    }
}
