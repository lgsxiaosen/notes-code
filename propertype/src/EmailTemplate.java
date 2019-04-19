/**
 * @author liuguisen
 * @date 2019/4/19 17:08
 * @description
 */
public class EmailTemplate implements Cloneable{

    private String sendTo;

    private String message;

    private String subject;

    private String from;

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    protected EmailTemplate clone() throws CloneNotSupportedException {
        return  (EmailTemplate) super.clone();
    }
}
