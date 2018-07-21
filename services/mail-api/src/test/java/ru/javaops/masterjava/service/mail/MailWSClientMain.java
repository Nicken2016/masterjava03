package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;
import ru.javaops.masterjava.web.WebStateException;

public class MailWSClientMain {
    public static void main(String[] args) throws WebStateException {
        String state = MailWSClient.sendToGroup(
                ImmutableSet.of(new Addressee("To <nick-n71@mail.ru>")),
                ImmutableSet.of(new Addressee("Copy <nicken@post.kz>")), "Subject", "Body");
        System.out.println(state);
    }
}