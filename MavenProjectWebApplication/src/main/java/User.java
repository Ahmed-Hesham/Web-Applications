
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean

public class User {

    private String text;

    public String getText() {

        if (text == null) {
            return "";
        } else if ("".equals(text)) {
            return "Hello Stranger";
        } else {
            return "Hello " + text;
        }
    }

    public void setText(String text) {
        this.text = text;
    }

}
