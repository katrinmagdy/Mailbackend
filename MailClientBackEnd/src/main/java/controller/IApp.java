package controller;

import java.util.LinkedList;

import models.Contact;
import models.Filter;
import models.Folder;
import models.Mail;
import models.Sort;

public interface IApp {

    public boolean signin(String email, String password);

    public boolean signup(Contact contact);

    public void setViewingOptions(Folder folder, Filter filter, Sort sort);

    public Mail[] listEmails(int page);

    public void deleteEmails(LinkedList mails);

    public void moveEmails(LinkedList mails, Folder des);

    public boolean compose(Mail email, String To);
}
