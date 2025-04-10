package com.xworkz.aquiredsecond.external;

import com.xworkz.aquiredsecond.internal.Book;

public class StoryBook extends Book {
    public StoryBook() {
        super();
        System.out.println("no-arg const of story book");
    }

    @Override
    public void open() {
        System.out.println("running open in story book");
    }

    public void readStory() {
        System.out.println("running readStory in story book");
    }
}
