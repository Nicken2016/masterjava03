package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableList;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendMail(
                ImmutableList.of(new Addressee("To <nick-n71@mail.ru>")),
                ImmutableList.of(new Addressee("Copy <nicken@post.kz>")), "Subject", "Body");
    }
}