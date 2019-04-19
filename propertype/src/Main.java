import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{
        EmailTemplate template = new EmailTemplate();
        template.setFrom("xiaosen");
        template.setMessage("这是原型模式复制消息");
        template.setSubject("原型模式测试");
        EmailTemplate[] templateArray = new EmailTemplate[3];
        for (int i=0; i<templateArray.length; i++){
            templateArray[i] = template.clone();
            templateArray[i].setSendTo("接受者"+(i+1));
        }
        Stream.of(templateArray).forEach(emailTemplate -> {
            System.out.println(emailTemplate.getSendTo()+" 接收到["+emailTemplate.getFrom()+"]的消息，主题："+emailTemplate.getSubject()+"。消息："+emailTemplate.getMessage());
        });
    }
}
