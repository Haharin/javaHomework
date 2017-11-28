import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MailProcessor {

    public static final String OUTPUT_FILE_NAME = "outMailMessage.txt";

    public void createAndSendMail(
            User senderUser,
            String receiverEmail,
            String subject,
            String emailBodyFileName
    ) {

        Mail mail = createMail( senderUser, receiverEmail, subject, emailBodyFileName);
        send(mail);

    }

    private void send(Mail mail) {
        StringBuilder sb = new StringBuilder("");

        sb.append("From:  ").append(mail.getSender()). append("\n");
        sb.append("To:  ").append(mail.getReceiver()). append("\n");
        sb.append("Subject:  ").append(mail.getSubject()). append("\n");
        sb.append("MailBody:  ").append(mail.getMailBody());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {

            bw.write(sb.toString());

        } catch ( IOException e) {
            e.printStackTrace();
        }

        System.out.println("Текст письма записан в файл " + OUTPUT_FILE_NAME);

    }

    private Mail createMail(
            User senderUser,
            String receiverEmail,
            String subject,
            String emailBodyFileName) {

        Mail mail = new Mail();

        String senderEmail = senderUser.getEmail();
        mail.setSender(senderEmail);

        mail.setReceiver(receiverEmail);
        mail.setSubject(subject);

        List<String> mailBody = getMailBoby(emailBodyFileName);
        mail.setMailBody(mailBody);

        return mail;

    }

    private List<String> getMailBoby(String emailBodyFileName) {
        String line = null;
        List<String> mailBody = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(emailBodyFileName))) {

            while ( (line = br.readLine()) != null ){
                mailBody.add(line);
            }

        } catch ( IOException e) {
            e.printStackTrace();
        }

        return mailBody;
    }
}
