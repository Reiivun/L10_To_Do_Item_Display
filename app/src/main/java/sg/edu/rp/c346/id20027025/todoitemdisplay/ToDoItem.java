package sg.edu.rp.c346.id20027025.todoitemdisplay;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        Date date = this.date.getTime();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy (EEEE)");
        String str = format1.format(date);

        return str;
    }

}
